package com.kodewala.opps.poly2;

class Parent // parent
{
	public void doTask()
	{
		System.out.println("Employee.doTask()");
	}
}

class Child extends Parent
{
	@Override
	public void doTask()
	{
		System.out.println("Manager.doTask()");
	}
}

public class Driver
{
	int i = 100;
	public static void main(String[] args)
	{
		Parent e = new Child(); // auto up-casting. Parent is referring child object.
		e.doTask();

		Child child = (Child) new Parent(); // child is referring parent object X
		child.doTask(); // Class cast exception.

		Child c1 = (Child) e; //Child c1 = new Child() // down casting.
		c1.doTask();

	}
}
