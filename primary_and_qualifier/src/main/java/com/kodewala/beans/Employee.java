package com.kodewala.beans;

public class Employee
{

	private String firstName;
	private String lastName;
	private String dept;

	public Employee(String firstName, String lastName, String dept)
	{
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.dept = dept;
	}

	public void display()
	{
		System.out.println("Employee [firstName=" + firstName + ", lastName=" + lastName + ", dept=" + dept + "]");
	}

}
