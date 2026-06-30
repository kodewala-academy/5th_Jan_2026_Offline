package com.sbi.customers;

public class Customer {

	String name; // fields OR attributes
	String accountNumber;
	String bankCode;

	public Customer() // default constructor
	{
		System.out.println(" i am inside no arg constructor...");
	}

	Customer(String _name, String _accountNumber, String _bankCode) {
		System.out.println("Creating customer object.....");
		name = _name;
		accountNumber = _accountNumber;
		bankCode = _bankCode;
	}
}
