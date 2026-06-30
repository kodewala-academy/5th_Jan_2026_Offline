package com.kodewala;

// User defined Exception 
public class UserAlreadyRegisteredException extends Exception
{

	public UserAlreadyRegisteredException(String message)
	{
		super(message);
	}

}
