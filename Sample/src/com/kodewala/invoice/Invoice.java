package com.kodewala.invoice;

public class Invoice {

	public String companyName; // default
	
	public static void main(String[] args) {
		Invoice invoice = new Invoice();
		invoice.addTax();
		
	}
	
	private int addTax() // will be used with in invoice class only
	{
		return 100;
	}
	
	public int payTax() // default. With in the class + outside the class with in same package
	{
		return 120;
	}
	
}
