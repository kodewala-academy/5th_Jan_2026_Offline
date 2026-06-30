package com.kodewala.opps.abstraction;

interface IPayment
{
	public abstract void pay(int amount, String accNo); // What to Do
	public abstract void stopPayment(int paymentId);
}

class Payment implements IPayment
{
	@Override
	public void pay(int amount, String accNo) // exposing what we are doing
	{
		dbConnect(); // Hiding how we are doing

		validateUser();

		checkBalance();

		checkLimit();

		doTxn();
	}

	// 1. Connect to database
	private void dbConnect()
	{

	}

	// 2. validate userid nad pin
	private void validateUser()
	{

	}

	// 3. check balance
	private void checkBalance()
	{

	}

	// 4. doTxn
	private void doTxn()
	{

	}
	// 5. check daily limit

	private void checkLimit()
	{

	}

	@Override
	public void stopPayment(int paymentId)
	{
		// TODO Auto-generated method stub
		
	}
}

public class Driver
{
	public static void main(String[] args)
	{

	}
}
