package com.irctc.booking.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.irctc.booking.entity.BookingEntity;
import com.irctc.booking.kafka.producer.service.KafkaService;
import com.irctc.booking.payment.entity.PaymentEntity;
import com.irctc.booking.payment.repository.PaymentRepo;
import com.irctc.booking.repository.BookingRepository;
import com.irctc.booking.request.BookingRequest;
import com.irctc.booking.response.BookingResponse;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.micrometer.tracing.Span;
import io.micrometer.tracing.Tracer;

@Service
public class BookingService
{

	private static final Logger log = LoggerFactory.getLogger(BookingService.class);

	@Autowired
	BookingRepository bookingRepository;

	@Autowired
	PaymentRepo paymentRepo;

	@Autowired
	KafkaService kafkaService;

	@Autowired
	PaymentClient paymentClient;

	@Autowired
	Tracer tracer;

	public List<BookingResponse> getAllTickets(String userId, String pageNumber, String pageSize)
	{

		log.info("getAllTickets() START - userId={}, pageNumber={}, pageSize={}", userId, pageNumber, pageSize);

		Pageable pageable = PageRequest.of(Integer.parseInt(pageNumber), Integer.parseInt(pageSize));

		Page<BookingEntity> tickets = bookingRepository.findAll(pageable);

		List<BookingResponse> response = new ArrayList<BookingResponse>();

		for (BookingEntity bookingEntity : tickets)
		{

			BookingResponse ticketResponse = new BookingResponse();

			ticketResponse.setBookingId(bookingEntity.getBookingId());

			ticketResponse.setPnrNumber(bookingEntity.getPnr());

			ticketResponse.setBookingStatus("CONFIRMED");

			ticketResponse.setJourneyDate(bookingEntity.getJourneyDate());

			ticketResponse.setCoach("B2");
			ticketResponse.setSeatNumber("32");

			response.add(ticketResponse);
		}

		log.info("getAllTickets() END - totalTickets={}", response.size());

		return response;
	}

	@CircuitBreaker(name = "paymentService", fallbackMethod = "paymentFallback")
	public BookingResponse doBooking(BookingRequest bookingRequest)
	{

		log.info("=================================================");
		log.info("BookingService.doBooking() START");
		log.info("Passenger: {}", bookingRequest.getPassengerName());
		log.info("From: {}", bookingRequest.getFrom());
		log.info("To: {}", bookingRequest.getTo());
		log.info("=================================================");

		// Current Trace / Span
		Span currentSpan = tracer.currentSpan();

		if (currentSpan != null)
		{

			log.info("BOOKING TRACE -> traceId={}, spanId={}", currentSpan.context().traceId(),
					currentSpan.context().spanId());

		} else
		{

			log.warn("BOOKING TRACE -> No current span found");
		}

		// -------------------------------------------------
		// Create Booking
		// -------------------------------------------------

		BookingEntity bookingEntity = new BookingEntity();

		bookingEntity.setFromStation(bookingRequest.getFrom());

		bookingEntity.setToStation(bookingRequest.getTo());

		bookingEntity.setJourneyDate(bookingRequest.getDate());

		bookingEntity.setTravelClass(bookingRequest.getTravelClass());

		bookingEntity.setPassengerName(bookingRequest.getPassengerName());

		bookingEntity.setAge(bookingRequest.getAge());

		bookingEntity.setGender(bookingRequest.getGender());

		bookingEntity.setUserId(bookingRequest.getUserId());

		bookingEntity.setStatus("BOOKING_INIT");

		log.info("Saving initial booking...");

		// 1st query
		bookingEntity = bookingRepository.save(bookingEntity);

		log.info("Booking created successfully. bookingId={}", bookingEntity.getBookingId());

		// -------------------------------------------------
		// Payment
		// -------------------------------------------------

		int amount = 13000;

		log.info("Calling Payment Service through Feign. amount={}", amount);

		String paymentResponse = paymentClient.makePayment(amount);

		log.info("Response received from Payment Service: {}", paymentResponse);

		// -------------------------------------------------
		// Create Payment Record
		// -------------------------------------------------

		PaymentEntity paymentEntity = new PaymentEntity();

		paymentEntity.setAmount(amount);

		paymentEntity.setBookingId(bookingEntity.getBookingId());

		paymentEntity.setTransactionId("TXN23435");

		log.info("Saving payment record for bookingId={}", bookingEntity.getBookingId());

		// 2nd query
		PaymentEntity paymentEntityResponse = paymentRepo.save(paymentEntity);

		log.info("Payment record saved. paymentId={}", paymentEntityResponse.getPaymentId());

		// -------------------------------------------------
		// Update Booking
		// -------------------------------------------------

		BookingResponse response = null;

		if (paymentEntityResponse.getPaymentId() > 0)
		{

			bookingEntity.setPnr(generatePnr());

			bookingEntity.setStatus("BOOKED");

			log.info("Payment successful. Updating booking. bookingId={}, pnr={}", bookingEntity.getBookingId(),
					bookingEntity.getPnr());

			// 3rd query
			BookingEntity bookingEntityUpdated = bookingRepository.save(bookingEntity);

			response = new BookingResponse();

			response.setBookingId(bookingEntityUpdated.getBookingId());

			response.setPnrNumber(bookingEntityUpdated.getPnr());

			response.setBookingStatus("CONFIRMED");

			response.setJourneyDate(bookingEntityUpdated.getJourneyDate());

			response.setCoach("B2");

			response.setSeatNumber("32");

			response.setMessage("Ticket booked successfully.");

			log.info("Booking completed successfully. bookingId={}, pnr={}", bookingEntityUpdated.getBookingId(),
					bookingEntityUpdated.getPnr());
		}

		// -------------------------------------------------
		// Kafka Events
		// -------------------------------------------------

		for (int i = 0; i < 2; i++)
		{

			String message = "This is test message and pnr is " + response.getPnrNumber();

			log.info("Publishing Kafka event. topic=booking-confirmed, message={}", message);

			kafkaService.publishMessage("booking-confirmed", message);

			log.info("Kafka event published successfully.");
		}

		log.info("BookingService.doBooking() END");

		return response;
	}

	public static String generatePnr()
	{

		Random random = new Random();

		long pnr = 1000000000L + (long) (random.nextDouble() * 9000000000L);

		return String.valueOf(pnr);
	}

	public BookingResponse paymentFallback(BookingRequest bookingRequest, Exception ex)
	{

		log.error("Circuit Breaker Triggered for Payment Service. Error: {}", ex.getMessage(), ex);

		Span currentSpan = tracer.currentSpan();

		if (currentSpan != null)
		{

			log.error("PAYMENT FALLBACK TRACE -> traceId={}, spanId={}", currentSpan.context().traceId(),
					currentSpan.context().spanId());
		}

		BookingResponse response = new BookingResponse();

		response.setBookingStatus("FAILED");

		response.setMessage("Payment Service is currently unavailable. Please try again later.");

		return response;
	}
}