package com.kodewala.abs1;

abstract class Banking // abstract + non abstract
{
	Banking()
	{
		super();
	}

	// default func
	public void addPayee(String payeeName)
	{

	}

	// abstract methods
	public abstract void pay();

	public abstract void settle();
}

class HDFC extends Banking
{
	HDFC()
	{
		super();
	}

	@Override
	public void pay()
	{
		Banking banking = new HDFC();
	}

	@Override
	public void settle()
	{

	}

}

public class Driver
{

}
