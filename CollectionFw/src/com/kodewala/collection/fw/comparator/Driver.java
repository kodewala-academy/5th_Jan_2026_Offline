package com.kodewala.collection.fw.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee
{
	private String name;
	private int salary;

	public Employee(String name, int salary)
	{
		super();
		this.name = name;
		this.salary = salary;
	}

	public String getName()
	{
		return name;
	}

	public int getSalary()
	{
		return salary;
	}

}

public class Driver
{

	public static void main(String[] args)
	{
		List<Employee> list = new ArrayList<Employee>();

		Employee e1 = new Employee("Zaid", 10000);
		Employee e2 = new Employee("Siraj", 199000);
		Employee e3 = new Employee("Siraj", 22000);
		Employee e4 = new Employee("Shivan", 8000);
		Employee e5 = new Employee("Gulsan", 113000);

		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);

		Collections.sort(list, new NameComparator());

		for (Employee emp : list)
		{
			System.out.println(emp.getName() + " | " + emp.getSalary());
		}

		System.out.println(" Sorting - By Salary....");
		Collections.sort(list, new SalaryComparator());

		for (Employee emp : list)
		{
			System.out.println(emp.getName() + " | " + emp.getSalary());
		}
	}

}
