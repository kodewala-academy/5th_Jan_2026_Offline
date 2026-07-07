package com.irctc.booking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.irctc.booking.request.BookingRequest;
import com.irctc.booking.response.BookingResponse;
import com.irctc.booking.service.BookingService;

@RestController
@RequestMapping("/irctc/booking/")
public class BookingController
{
	@Autowired
	BookingService bookingService;

	@PostMapping("confirmticket")
	public BookingResponse doBooking(@RequestBody BookingRequest request)
	{
		return bookingService.doBooking(request);
	}
}
