package com.kodewala;

public class Driver
{

	public static void main(String[] args)
	{
		Address address = new Address("12th cross", "13th main", "near udupi singal", "BLR", "KA", "560076", "IN");
		
		// insert into
		
		// hibernate.save(address); --> insert address record into table
		
		// Using Constructor...(Mandatory, Immutable)
		
		Employee employee = new Employee("Anand", "Yadav", "anand@tcs.com", address);
		
		
		Employee employee1 = new Employee("Anand", "Yadav", "anand@tcs.com");
		
		// Using setter to inject the address object(Optional, mutable)
		employee1.setAddress(address);
		
		address  = new Address("12th cross", "13th main", "near udupi singal", "BLR", "KA", "560078", "IN");
		
		employee1.setAddress(address);
		
		System.out.println();

	}

}
