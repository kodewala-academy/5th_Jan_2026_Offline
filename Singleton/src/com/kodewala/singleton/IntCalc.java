package com.kodewala.singleton;

public class IntCalc
{

	private static IntCalc intCalc;

	private IntCalc()
	{

	}

	public synchronized static IntCalc getInstance()
	{
		if (intCalc == null)
		{
			System.out.println(" Creating object as it was null. first time object creation...");
			intCalc = new IntCalc();
		} else
		{
			System.out.println(" Object already created.. returning existing(which was already created by some else)");
		}
		return intCalc;
	}

}
