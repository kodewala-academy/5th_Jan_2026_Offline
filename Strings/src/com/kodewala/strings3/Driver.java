package com.kodewala.strings3;

public class Driver
{

	public static void main(String[] args)
	{
		// String s1 = "Hello" + " Bangalore"; // one object created.

		// System.out.println(s1);

		String s10 = "Hello"; // scp

		String s11 = " Bangalore"; // scp

		String s12 = s10 + s11; // heap

		String s13 = s12.intern(); // s13 is referring scp object
		
		System.out.println();
		

	}
}
