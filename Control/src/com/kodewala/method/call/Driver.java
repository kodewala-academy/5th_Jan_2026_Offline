package com.kodewala.method.call;

public class Driver
{

	public static void main(String[] args)
	{
		Delivery delivery = new Delivery("Raj");
		
		// calling the method
		String orderStatus =  delivery.getCurrentStatus("OD1234");
		
		System.out.println(orderStatus);
		
		

	}

}
