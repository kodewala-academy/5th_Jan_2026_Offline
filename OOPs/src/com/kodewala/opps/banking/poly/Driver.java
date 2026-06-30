package com.kodewala.opps.banking.poly;

class Customer
{
	public void buy()
	{
		System.out.println("Customer.buy()");
	}
}

class SilverCustomer extends Customer // IS-A
{

	public void buy()
	{
		System.out.println("SilverCustomer.buy()");
	}
}

public class Driver
{

	public static void main(String[] args)
	{
		Customer parent = new SilverCustomer();
		parent.buy(); // 1. at the time of compilation, it will check if method buy() is available in Customer or not. 
		             // 2. while running / executing, jvm will call method on actual object (SilverCustomer)
	}
}
