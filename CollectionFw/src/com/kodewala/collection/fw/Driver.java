package com.kodewala.collection.fw;

public class Driver
{

	public static void main(String[] args)
	{
		// Creating container which will hold the name(String Objects)
		String names[] =
		{ "shantanu", "Deewan", "Chandan", "Arshu", "Denil", "Mahendra", "Asit", "Diptesh", "Munna", "Raj", "test" };

		/// process-2 (send email to students)

		for (int index = 0; index < names.length; index++)
		{
			String student = names[index];
			System.out.println(" Sending email to student " + student);
		}

	}

}
