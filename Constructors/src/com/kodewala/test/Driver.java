package com.kodewala.test;

class Account
{
	void doSomething()
	{
		System.out.println("Account.doSomething()");
	}

	private String accNo;

	public Account(String accNo)
	{
		super();
		this.accNo = accNo;
	}

}

public class Driver
{
	Account account = null;

	public void test() // Application is responsible for managing life-cycle of an object 
	{
		account = new Account("4523453456346"); // Creating and init the account object

		// use
		account.doSomething();

		// set reference as null so that GC can remove it

		account = null;
	}

}
