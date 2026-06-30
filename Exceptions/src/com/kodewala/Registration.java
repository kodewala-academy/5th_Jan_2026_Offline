package com.kodewala;

public class Registration
{

	public void doRegistration(String email) throws UserAlreadyRegisteredException
	{
		// check the email id in DB.
		boolean isExists = false;
		if (isExists)
		{
			throw new UserAlreadyRegisteredException(" User is already registered, " + email);

		} else
		{
			// Register this user.
			System.out.println(" Registering the user, " + email);
		}
	}
}
