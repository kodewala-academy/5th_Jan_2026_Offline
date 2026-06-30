package com.kodewala.exception6;

public class Driver
{

	public static void main(String[] args)
	{
		try
		{

		} catch (NumberFormatException | ArrayIndexOutOfBoundsException  | NullPointerException e) // java 7
		{
			e.printStackTrace();
		}

	}

}
