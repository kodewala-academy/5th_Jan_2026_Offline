package com.kodewala.exception3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Driver
{

	public static void main(String[] args) throws IOException
	{
		BufferedReader br=null;
		try
		{
			System.out.println(" try START");
			br = new BufferedReader(new FileReader(
					"C:\\Users\\Suresh\\OneDrive\\Desktop\\Academy\\Batch\\Java Backend - Full Course\\09th March 2026\\day42\\test.txt.txt"));

			String name = args[0]; // This code may throw exception....

			System.out.println("Driver.main() -- try end....");
			// return 5;
			System.exit(0); // Kill the JVM
		}

		catch (ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
			System.err.println(" Name is not provided...");

		}

		catch (Exception e)
		{
			e.printStackTrace();
			System.err.println("Some other problem..");
		} finally
		{
			// return 10;
			br.close();// Closing the file connection....
			// Mandatory executable block -
			System.out.println("Driver. finally block...");
		}

	}

}
