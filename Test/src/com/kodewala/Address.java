package com.kodewala;

public class Address
{
	private String addLine1;
	private String addLine2;
	private String addLine3;
	private String city;
	private String state;
	private String pinCode;
	private String country;

	public Address(String addLine1, String addLine2, String addLine3, String city, String state, String pinCode,
			String country)
	{
		super();
		this.addLine1 = addLine1;
		this.addLine2 = addLine2;
		this.addLine3 = addLine3;
		this.city = city;
		this.state = state;
		this.pinCode = pinCode;
		this.country = country;
	}

}
