package com.irctc.booking.response;

import java.time.LocalDate;

public class BookingResponse
{

	private Long bookingId;
	private String pnrNumber;
	private String bookingStatus;
	private LocalDate journeyDate;
	private String coach;
	private String seatNumber;
	private String message;

	public Long getBookingId()
	{
		return bookingId;
	}

	public void setBookingId(Long bookingId)
	{
		this.bookingId = bookingId;
	}

	public String getPnrNumber()
	{
		return pnrNumber;
	}

	public void setPnrNumber(String pnrNumber)
	{
		this.pnrNumber = pnrNumber;
	}

	public String getBookingStatus()
	{
		return bookingStatus;
	}

	public void setBookingStatus(String bookingStatus)
	{
		this.bookingStatus = bookingStatus;
	}

	public LocalDate getJourneyDate()
	{
		return journeyDate;
	}

	public void setJourneyDate(LocalDate journeyDate)
	{
		this.journeyDate = journeyDate;
	}

	public String getCoach()
	{
		return coach;
	}

	public void setCoach(String coach)
	{
		this.coach = coach;
	}

	public String getSeatNumber()
	{
		return seatNumber;
	}

	public void setSeatNumber(String seatNumber)
	{
		this.seatNumber = seatNumber;
	}

	public String getMessage()
	{
		return message;
	}

	public void setMessage(String message)
	{
		this.message = message;
	}
}