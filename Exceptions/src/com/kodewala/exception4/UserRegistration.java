package com.kodewala.exception4;

import java.io.IOException;

public class UserRegistration
{

	public boolean registerUser(String _email) throws EmailAlreadyExistsException
	{
		String email = _email;

		// logic to check the email.... with DB and if already available the return true
		boolean isEmailRegisted = true;
		if (isEmailRegisted)
		{
			throw new EmailAlreadyExistsException(" Email id " + email + " already registered");
			   // new Person("test");
		}

		return true;
	}
}
