package com.irctc.booking.service;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.irctc.booking.entity.BookingEntity;
import com.irctc.booking.repository.BookingRepository;
import com.irctc.booking.request.BookingRequest;
import com.irctc.booking.response.BookingResponse;

@Service
public class BookingService
{

	@Autowired
	BookingRepository bookingRepository;

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

		bookingEntity = bookingRepository.save(bookingEntity);

		BookingResponse response = new BookingResponse();

		response.setBookingId(bookingEntity.getBookingId());
		response.setPnrNumber(generatePnr());
		response.setBookingStatus("CONFIRMED"); // Or WAITING, RAC, etc.
		response.setJourneyDate(bookingEntity.getJourneyDate());
		response.setCoach("B2");
		response.setSeatNumber("32");
		response.setMessage("Ticket booked successfully.");

		return response;

	}

	public static String generatePnr()
	{
		Random random = new Random();
		long pnr = 1000000000L + (long) (random.nextDouble() * 9000000000L);
		return String.valueOf(pnr);
	}
}
