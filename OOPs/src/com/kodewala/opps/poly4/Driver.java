package com.kodewala.opps.poly4;

class Account
{
	public Account createAccount(String name)
	{

		return new Account();
	}
}

class SavingAccount extends Account
{
	@Override
	public SavingAccount createAccount(String name)
	{

		return new SavingAccount();
	}

}

public class Driver
{

	public static void main(String[] args)
	{
		SavingAccount sb = new SavingAccount();
		sb.doTransfer(); // # 19

	}

}
