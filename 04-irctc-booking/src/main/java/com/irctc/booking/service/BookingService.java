package com.irctc.booking.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.irctc.booking.entity.BookingEntity;
import com.irctc.booking.payment.entity.PaymentEntity;
import com.irctc.booking.payment.repository.PaymentRepo;
import com.irctc.booking.repository.BookingRepository;
import com.irctc.booking.request.BookingRequest;
import com.irctc.booking.response.BookingResponse;

import jakarta.transaction.Transactional;

@Service
public class BookingService
{

	@Autowired
	BookingRepository bookingRepository;

	@Autowired
	PaymentRepo paymentRepo;

	public List<BookingResponse> getAllTickets(String userId, String pageNumber, String pageSize)
	{

		Pageable pageable = PageRequest.of(Integer.parseInt(pageNumber), Integer.parseInt(pageSize));

		Page<BookingEntity> tickets = bookingRepository.findAll(pageable); // pagination

		List<BookingResponse> response = new ArrayList<BookingResponse>();

		for (BookingEntity bookingEntity : tickets)
		{
			BookingResponse ticketResponse = new BookingResponse();

			ticketResponse.setBookingId(bookingEntity.getBookingId());
			ticketResponse.setPnrNumber(bookingEntity.getPnr());
			ticketResponse.setBookingStatus("CONFIRMED"); // Or WAITING, RAC, etc.
			ticketResponse.setJourneyDate(bookingEntity.getJourneyDate());
			ticketResponse.setCoach("B2");
			ticketResponse.setSeatNumber("32");
			response.add(ticketResponse);
		}

		return response;

	}

	@Transactional
	public BookingResponse doBooking(BookingRequest bookingRequest)
	{
		BookingEntity bookingEntity = new BookingEntity();

		bookingEntity.setFromStation(bookingRequest.getFrom());
		bookingEntity.setToStation(bookingRequest.getTo());
		bookingEntity.setJourneyDate(bookingRequest.getDate());
		bookingEntity.setTravelClass(bookingRequest.getTravelClass());
		bookingEntity.setPassengerName(bookingRequest.getPassengerName());
		bookingEntity.setAge(bookingRequest.getAge());
		bookingEntity.setGender(bookingRequest.getGender());
		bookingEntity.setUserId(bookingRequest.getUserId());
		// bookingEntity.setPnr(generatePnr());
		bookingEntity.setStatus("BOOKING_INIT");

		// create a booking record. - 1st query
		bookingEntity = bookingRepository.save(bookingEntity);

		// init the payment
		PaymentEntity paymentEntity = new PaymentEntity();
		paymentEntity.setAmount(1235);
		paymentEntity.setBookingId(bookingEntity.getBookingId());
		paymentEntity.setTransactionId("TXN23435");
		
		String statsuFromPG=null;
		paymentEntity.setPaymentStatus(statsuFromPG.concat("some text..."));
		
        // 2nd
		PaymentEntity paymentEntityResponse = paymentRepo.save(paymentEntity);
		BookingResponse response = null;
		if (paymentEntityResponse.getPaymentId() > 0)
		{
			bookingEntity.setPnr(generatePnr());
			bookingEntity.setStatus("BOOKED");
			// update a booking record. 3rd
			BookingEntity bookingEntityUpdated = bookingRepository.save(bookingEntity);

			response = new BookingResponse();

			response.setBookingId(bookingEntityUpdated.getBookingId());
			response.setPnrNumber(bookingEntityUpdated.getPnr());
			response.setBookingStatus("CONFIRMED"); // Or WAITING, RAC, etc.
			response.setJourneyDate(bookingEntityUpdated.getJourneyDate());
			response.setCoach("B2");
			response.setSeatNumber("32");
			response.setMessage("Ticket booked successfully.");
		}
		return response;

	}

	public static String generatePnr()
	{
		Random random = new Random();
		long pnr = 1000000000L + (long) (random.nextDouble() * 9000000000L);
		return String.valueOf(pnr);
	}
}
