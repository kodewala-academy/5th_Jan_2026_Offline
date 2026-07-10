package com.irctc.booking.exception;

public class InSufficientBalanceException extends RuntimeException
{

	public InSufficientBalanceException(String _message)
	{
		super(_message);
	}

}
