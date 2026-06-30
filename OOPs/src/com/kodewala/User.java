package com.kodewala;

public class User
{

	public static void main(String[] args)
	{
		Account account = new Account(1000, "Arvind");
		System.out.println(" Initials bal " + account.getBalance());

	//	 account.balance= 120000;

		account.doFundTransfer(120000, "1234");

		System.out.println(" Balance now " + account.getBalance());

	}

}
