package com.kodewala;

public class Employee // 200 attributes(you details + add details, salary details, past exp, tech, id card, dept, Hr)
{

	private String firstName;
	private String lastName;
	private String email;
	private Address address;
	
	public Employee(String firstName, String lastName, String email, Address address)
	{
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.address = address;
	}
	

	public void setAddress(Address _address)
	{
		address = _address;
	}
	
	public Employee(String firstName, String lastName, String email)
	{
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		
	}
}
