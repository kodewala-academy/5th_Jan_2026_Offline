package com.kodewala.inf.marker1;

class Person implements Copyable
{
	private String name;

	public Person(String name)
	{
		super();
		this.name = name;
	}

	public void copy(Person p1)
	{
		Copy copy = new Copy();
		copy.copyDcoument(p1);
	}
}

public class Driver
{
	public static void main(String[] args)
	{
		Person p1 = new Person("Abcd");
		p1.copy(p1);
	}
}
