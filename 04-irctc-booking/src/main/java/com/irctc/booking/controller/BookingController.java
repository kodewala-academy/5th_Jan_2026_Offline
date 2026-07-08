package com.irctc.booking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

	@GetMapping("gettickets")
	public List<BookingResponse> getTickets(@RequestParam String userId, @RequestParam String page,
			@RequestParam String records)
	{
		return bookingService.getAllTickets(userId, page, records);
	}

	@PostMapping("confirmticket")
	public BookingResponse doBooking(@RequestBody BookingRequest request)
	{
		return bookingService.doBooking(request);
	}
}
