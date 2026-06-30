package com.kodewala.opps.banking.new1;

class A
{
	public void m1()
	{
		System.out.println(" from A class");
	}
}

class B extends A
{
	@Override
	public void m1()
	{
		System.out.println(" from B class");
	}
}

class C extends A
{
	@Override
	public void m1()
	{
		System.out.println(" from C class");
	}
}

class D 
{

}

public class Driver
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

	}

}
