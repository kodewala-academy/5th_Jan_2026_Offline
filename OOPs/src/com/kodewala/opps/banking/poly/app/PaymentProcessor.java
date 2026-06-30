package com.kodewala.opps.banking.poly.app;

public class PaymentProcessor
{

	public void processPayment(CorePayment corePayment)
	{
		// CorePayment corePayment = new NBPayment();
		corePayment.pay(); // polymorphism
	}

}
