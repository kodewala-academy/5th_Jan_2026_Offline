package com.kodewala.opps.banking.poly.app;

public class Driver
{
	public static void main(String[] args)
	{
		PaymentProcessor paymentProcessor = new PaymentProcessor();

		CCPayment ccPayment = new CCPayment();
		paymentProcessor.processPayment(ccPayment);

		NBPayment nbPayment = new NBPayment();
		// CorePayment corePayment = new NBPayment();
		paymentProcessor.processPayment(nbPayment);
		
		UPIPayment upiPayment = new UPIPayment();
		
		paymentProcessor.processPayment(upiPayment);

	}
}
