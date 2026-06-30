package com.sbi.customers;

public class Driver {

	public static void main(String[] args) {

		// Object of Customer class. I am creating new customer
		int amount = 100; // <data type> <name> = <value>;
		Customer c1 = new Customer("kodewala", "1234512345", "Bank123");
		// call to Customer class constructor which expecting 3 params as String, String
		// , String

		System.out.println(" attrubites values for c1 --> " + c1.accountNumber + " " + c1.name + " " + c1.bankCode);
	
		Customer c2 = new Customer("academy", "54234534", "Bank123");
		System.out.println(" attrubites values for c1 --> " + c2.accountNumber + " " + c2.name + " " + c2.bankCode);
		
	}

}
