package com.irctc.booking.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "train_booking")
public class BookingEntity
{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long bookingId;
	private String pnr;
	private String userId;
	private String fromStation;

	private String toStation;

	private LocalDate journeyDate;

	private String travelClass;

	private String passengerName;

	private Integer age;

	private String gender;

	public Long getBookingId()
	{
		return bookingId;
	}

	public void setBookingId(Long bookingId)
	{
		this.bookingId = bookingId;
	}

	public String getFromStation()
	{
		return fromStation;
	}

	public void setFromStation(String fromStation)
	{
		this.fromStation = fromStation;
	}

	public String getToStation()
	{
		return toStation;
	}

	public void setToStation(String toStation)
	{
		this.toStation = toStation;
	}

	public LocalDate getJourneyDate()
	{
		return journeyDate;
	}

	public void setJourneyDate(LocalDate journeyDate)
	{
		this.journeyDate = journeyDate;
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

	public String getPnr()
	{
		return pnr;
	}

	public void setPnr(String pnr)
	{
		this.pnr = pnr;
	}

}