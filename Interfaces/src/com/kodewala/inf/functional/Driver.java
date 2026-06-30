package com.kodewala.inf.functional;

@FunctionalInterface
interface IPayment
{

	public abstract void pay(); //  Single Abstract Method (SAM Interface)
	
	public default void settle()
	{
		
	}

}

public class Driver
{

}
