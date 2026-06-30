package com.kodewala.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee1
{
	@Value("Kodewala2")
	private String firstName;
	@Value("Academy2")
	private String lastName;

	// Field Injection.....
	
	@Autowired
	private Address1 address;

	@Override
	public String toString()
	{
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + "]";
	}

}
