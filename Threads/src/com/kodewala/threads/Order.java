package com.kodewala.threads;

public class Order
{
	// Task 
	public void placeOrder()
	{
		System.out.println("Order.placeOrder() and executed by " + Thread.currentThread().getName());
	}
}
