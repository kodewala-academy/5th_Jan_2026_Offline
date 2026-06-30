package com.kodewala;

public class Account
{
	 private int balance; // No one will be able to access these variables outside this class
	 private String name; // No one will be able to access these variables outside this class

	public Account(int balance, String name)
	{
		this.balance = balance;
		this.name = name;
	}

	public void doFundTransfer(int _amountToBeTransferred, String _pin) // setter method which modify the balance.
	{
		if (_pin.equals("1234") && _amountToBeTransferred > 0)
		{
			balance = balance + _amountToBeTransferred;
		} else
		{
			System.err.println(" Invalid PIN or -ve amount entered");
		}
		System.out.println(" New balance is " + balance);
	}

	public int getBalance()
	{
		return balance;
	}
}
