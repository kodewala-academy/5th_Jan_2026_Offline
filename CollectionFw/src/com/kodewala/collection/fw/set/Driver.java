package com.kodewala.collection.fw.set;

class Employee
{
	String firstName;
	String lastName;

	public Employee(String firstName, String lastName)
	{

		this.firstName = firstName;
		this.lastName = lastName;
	}

	@Override
	public boolean equals(Object obj)
	{
		Employee e2 = (Employee) obj;
		return this.firstName.equals(e2.firstName) && this.lastName.equals(e2.lastName);
	}

	@Override
	public int hashCode()
	{
		return (this.firstName + this.lastName).hashCode();
	}

}

public class Driver
{

	public static void main(String[] args)
	{
		Employee e1 = new Employee("Kodewala", "Kodewala");
		Employee e2 = new Employee("Kodewala1", "Kodewala2");

		System.out.println(e1.equals(e2));

		System.out.println("e1's hash code " + e1.hashCode());
		System.out.println("e2's hash code " + e2.hashCode());

	}

}
