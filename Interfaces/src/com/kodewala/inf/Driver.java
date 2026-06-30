package com.kodewala.inf;

interface Payment // an interface(before java 8)
{
	// variable + methods

	public static final int LIMIT = 100; // only constants
	
	public abstract void pay(); // What to Do
	public abstract void stopPayment();
	
	
	// new feature 
	 void checkLimit(); // public abstract void checkLimit();
	
}

class SBIBank implements Payment
{
	@Override
	public void pay()
	{ // How to do
		System.out.println(" implementation......"+Payment.LIMIT);
	}

	@Override
	public void stopPayment()
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void checkLimit()
	{
		// TODO Auto-generated method stub
		
	}
	
	
}

public class Driver
{

}
