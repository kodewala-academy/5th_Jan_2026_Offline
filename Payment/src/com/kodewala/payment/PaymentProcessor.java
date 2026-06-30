package com.kodewala.payment;

import javax.mail.MessageAware;

import com.kodewala.account.AccountStatus;

public class PaymentProcessor
{

	MessageAware aware;

	public static void main(String[] args)
	{

	}

	public void processPayment()
	{
		// get the account info and process the payment
		AccountStatus accountStatus = new AccountStatus();
		accountStatus.getAccountstatus();
		sendEmail();
	}

	private void sendEmail()
	{

	}

}
