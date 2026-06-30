package com.kodewala.strings2;

class Account
{
	
	String accountHolderName;
	

	public Account(String _accountHolderName)
	{
		this.accountHolderName = _accountHolderName;
	}
}

public class Driver
{
	public static void main(String[] args)
	{
		Account acc1 = new Account("Kodewala"); // czx423

		Account acc2 = new Account("Kodewala"); // 432fds

		System.out.println(acc1 == acc2); // false
		System.out.println(acc1.equals(acc2)); // false

	}
}
