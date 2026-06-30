package com.kodewala;

public class Driver1
{

	public static void main(String[] args) throws ClassNotFoundException
	{
        
		Class.forName("com.kodewala.Account"); // Checked Exception. // Compile time exception 

		String name = null;
		name.length(); // Runtime / Un-checked Exception
	}

}
