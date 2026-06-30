package com.kodewala;

public class Driver
{
	public static void main(String[] args)
	{
		System.out.println(" START OF MAIN");

		try
		{
			String name = null; // args[0]; // AIOBE ArrayIndexOutOfBoundsException
			int length = name.length(); // this code is risky(may or may not throw exception)

			System.out.println(" legth is " + length);
			// int i = 200/0;
		}
		catch (NullPointerException e) // Child-1
		{
			e.printStackTrace();
			System.out.println(" unknown error!");
		}
		catch (Exception e) // Parent
		{
			e.printStackTrace();
			System.out.println(" unknown error!");
		}
		System.out.println(" END OF MAIN");
	}
}
