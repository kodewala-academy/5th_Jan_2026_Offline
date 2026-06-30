package com.kodewala.collection.fw.set;

import java.util.HashSet;
import java.util.Set;

class Employees

{
	String name;

	public Employees(String name)
	{
		this.name = name;
	}

	@Override
	public int hashCode()
	{
		return this.name.hashCode();
	}

	@Override
	public boolean equals(Object obj)
	{
		Employees e1 = (Employees) obj;
		return this.name.equals(e1.name);
	}

}

public class Driver3
{

	public static void main(String[] args)
	{
		Set<Employees> hashSet = new HashSet<Employees>(16, 0.50f); // default cap : 16 , LF = 0.75(park) , TH : 12 --> 32
		Employees e1 = new Employees("deepak");
		Employees e2 = new Employees("deepak");

		System.out.println(" e1's hashcode " + e1.hashCode());
		System.out.println(" e2's hashcode " + e2.hashCode());

		hashSet.add(e1);
		hashSet.add(e2);

		System.out.println(" Total employees are " + hashSet.size());
	}

}
