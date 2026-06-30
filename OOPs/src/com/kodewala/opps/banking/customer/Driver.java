package com.kodewala.opps.banking.customer;

class Customer
{
	public void buyProduct(String productName)
	{
		System.out.println("Customer.buyProduct().. Buying product...");
	}
}

class GoldCustomer extends Customer //(IS-A) Customer class is parent class and GoldCustomer is child class
{
	// all the functionalities of parent classes(Customer + Object)
	// Object class's func + Customer class func
	private void doSomething()
	{
		GoldCustomer cust = new GoldCustomer();
		cust.buyProduct("pizza"); // from Customer class
		cust.hashCode();   // from Object class
		cust.toString();   // from object class
	}
}


public class Driver
{
	public static void main(String[] args)
	{

	}
}
