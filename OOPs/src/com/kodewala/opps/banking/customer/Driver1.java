package com.kodewala.opps.banking.customer;

class Banking
{
	public int calculateInterest(int amount)
	{
		System.out.println("Banking.calculateInterest()");
		int interest = (amount * 5) / 100;
		return interest;
	}
}

class SBI extends Banking
{
	@Override // this annotation will check all the rules of overriding.
	public int calculateInterest(int amount)
	{
		System.out.println("SBI.calculateInterest()");
		int interest = (amount * 3) / 100; // changed the business logic.
		return interest;
	}
}

public class Driver1
{

	public static void main(String[] args)
	{
		SBI sbi = new SBI();
		int intestest = sbi.calculateInterest(1000);
		System.out.println("  intestest is " + intestest);
	}

}
