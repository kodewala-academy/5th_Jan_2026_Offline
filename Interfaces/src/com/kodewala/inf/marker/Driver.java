package com.kodewala.inf.marker;

class Account implements Cloneable
{
	public String name;

	public Account(String _name)
	{

		this.name = _name;
	}

	@Override
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}

}

public class Driver
{
	public static void main(String[] args) throws CloneNotSupportedException
	{
		Account acc1 = new Account("Aryan");
		
		Account acc2 = (Account) acc1.clone(); // cloned object
		
		System.out.println(acc2.name);
	}
}
