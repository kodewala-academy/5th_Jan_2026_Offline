package com.kodewala.inf2;

interface IBank
{
	public void pay(); // public abstract void pay(); // WHAT

	public void settle();

	public default void printPassbook()
	{
		//
		createConnection();
	}
	
	public static void sendSMSNotification()
	{
		// 250 (50 for connection + 200 biz logic)
		createConnection();
	}
	public static void sendEmailNotification()
	{
		// 150 (50 for connection + 100 biz logic)
		createConnection();
	}
	
	private static void createConnection()
	{
		
	}
}

class HDFC implements IBank
{
	public void pay()
	{ // HOW

	}

	public void settle()
	{

	}
}

class SomeRuralBank implements IBank
{

	public void pay()
	{ // HOW

	}

	public void settle()
	{

	}
}
public class Driver
{

}
