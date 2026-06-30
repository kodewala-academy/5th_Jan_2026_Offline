package com.kodewala.collection.fw.set;

import java.util.Set;
import java.util.TreeSet;

class Employee5 implements Comparable<Employee5>
{
	String name;

	public Employee5(String name)
	{
		super();
		this.name = name;
	}

	@Override
	public int compareTo(Employee5 o)
	{
		int result = this.name.compareTo(o.name);
		System.out.println(" result is " + result);
		return result; // -Ve , zero or +VE
	}

}

public class Driver4
{

	public static void main(String[] args)
	{
		Set<Employee5> set = new TreeSet<Employee5>();

		set.add(new Employee5("kodewala"));
		set.add(new Employee5("academy"));
		set.add(new Employee5("bangalore"));
		set.add(new Employee5("hyd"));
		set.add(new Employee5("chennai"));
		set.add(new Employee5("bangalore"));
		set.add(new Employee5(null));
		
		System.out.println(set.size());
		for (Employee5 emp : set)
		{
			System.out.println(emp.name);
		}
	}

}
