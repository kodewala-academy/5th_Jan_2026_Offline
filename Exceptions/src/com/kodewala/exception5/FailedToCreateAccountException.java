package com.kodewala.exception5;

public class FailedToCreateAccountException extends RuntimeException

{
	FailedToCreateAccountException(String msg)
	{
		super(msg);
	}
}
