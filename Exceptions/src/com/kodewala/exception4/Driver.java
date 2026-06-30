package com.kodewala.exception4;



public class Driver
{

	public static void main(String[] args)
	{
		String email = args[0];
		
		UserRegistration registration = new  UserRegistration();
		try {
		registration.registerUser(email);
		}
		catch (EmailAlreadyExistsException e) {
			e.printStackTrace();
			System.out.println(" Email is already registered. Pls connect with support team...");
		}
	}

}
