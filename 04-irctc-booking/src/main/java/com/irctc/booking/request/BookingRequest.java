package com.irctc.booking.request;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BookingRequest
{

	private String userId;
	
	private String from;

	private String to;

	private LocalDate date;

	@JsonProperty("class")
	private String travelClass;

	private String passengerName;

	private Integer age;

	private String gender;

	public String getFrom()
	{
		return from;
	}

	public void setFrom(String from)
	{
		this.from = from;
	}

	public String getTo()
	{
		return to;
	}

	public void setTo(String to)
	{
		this.to = to;
	}

	public LocalDate getDate()
	{
		return date;
	}

	public void setDate(LocalDate date)
	{
		this.date = date;
	}

	public String getTravelClass()
	{
		return travelClass;
	}

	public void setTravelClass(String travelClass)
	{
		this.travelClass = travelClass;
	}

	public String getPassengerName()
	{
		return passengerName;
	}

	public void setPassengerName(String passengerName)
	{
		this.passengerName = passengerName;
	}

	public Integer getAge()
	{
		return age;
	}

	public void setAge(Integer age)
	{
		this.age = age;
	}

	public String getGender()
	{
		return gender;
	}

	public void setGender(String gender)
	{
		this.gender = gender;
	}

	public String getUserId()
	{
		return userId;
	}

	public void setUserId(String userId)
	{
		this.userId = userId;
	}

}