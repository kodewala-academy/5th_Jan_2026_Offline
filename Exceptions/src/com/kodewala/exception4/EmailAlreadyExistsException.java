package com.kodewala.exception4;

public class EmailAlreadyExistsException extends Exception
{
	EmailAlreadyExistsException(String _message)
	{
		super(_message);
	}
}