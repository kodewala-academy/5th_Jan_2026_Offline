package com.kodewala.exception5;

public class Driver
{

	public static void main(String[] args)
	{
		System.out.println("Driver.main() START");
		User user = new User();

		try
		{
			user.createUser();
		} catch (UserCreationException e)
		{
			e.printStackTrace();
			System.out.println(" unable to create user. Pls contact support team pn +91 0000000000");
		}
		System.out.println("Driver.main() END");
	}
}

class Account
{
	public void createAccount() throws FailedToCreateAccountException
	{
		System.out.println("Account.createAccount() START");

		if (true)
		{
			throw new FailedToCreateAccountException(" unable to create default account");
		}

		System.out.println("Account.createAccount() END");
	}
}

class User
{
	public void createUser()
	{
		System.out.println("User.createUser() START... ");
		Account account = new Account();
		try
		{
			account.createAccount();
		} catch (FailedToCreateAccountException e)
		{
			e.printStackTrace();

			throw new UserCreationException(" Unable to create user");
		}
		System.out.println("User.createUser() END");
	}
}
