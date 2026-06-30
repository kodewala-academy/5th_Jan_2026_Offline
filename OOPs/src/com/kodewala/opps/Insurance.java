package com.kodewala.opps;

// parent class
class InsuranceManagement extends Object
{
	private int bonus=12000;
	// func - 1 
	public void doInsurance()
	{
		System.out.println("InsuranceManagement.doInsurance().. parent");
	}
}

// child class 
public class Insurance extends InsuranceManagement
{
	// available for use in child class 
	
	public static void main(String[] args)
	{
		Insurance insurance = new Insurance();
		System.out.println(insurance.bonus);
		insurance.doInsurance();
	}
}
