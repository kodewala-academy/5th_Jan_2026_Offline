package com.kodewala.strings4;

public class Driver2
{

	public static void main(String[] args)
	{
		System.out.println("START of main()");

		String name = null; // Obj is not yet created
		try
		{
			System.out.println(" START of try block");
			System.out.println(name.length()); // Risky code
			System.out.println(" END of try block");
		} catch (NullPointerException e)
		{
			System.err.println(" Exception caught....");
		}
		System.out.println("END of main()");
	}

}
