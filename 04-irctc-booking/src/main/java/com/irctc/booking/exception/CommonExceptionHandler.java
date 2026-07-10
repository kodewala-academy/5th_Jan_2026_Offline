package com.irctc.booking.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.irctc.booking.response.ErrorResponse;

@RestControllerAdvice
public class CommonExceptionHandler
{

	@ExceptionHandler(InSufficientBalanceException.class)
	public ResponseEntity<ErrorResponse> handleInSufficientBalanceException(InSufficientBalanceException balanceException)
	{
		
		ErrorResponse response = new ErrorResponse("BE-120", balanceException.getMessage());
		// this block will get executed if InSufficientBalanceException
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(response);
		
	}

	@ExceptionHandler(Exception.class)
	public void handleInException(Exception exception)
	{
		// this block will get executed if Exception
	}
}
