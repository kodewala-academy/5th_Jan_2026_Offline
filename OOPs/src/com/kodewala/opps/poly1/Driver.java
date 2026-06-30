package com.kodewala.opps.poly1;

class Parent
{
	public void doSomething()
	{
		System.out.println("Parent.doSomething()");
	}
}

class Child extends Parent
{

	public void doSomething()
	{
		System.out.println("Child.doSomething()");
	}
}

public class Driver
{
	public static void main(String[] args)
	{
        Parent p = new Child();// parent can refer child object.
        p.doSomething();
        // 1. Compile --> it will check the availability of doSomething() method in parent class.
        // 2. runtime --> jvm will call the method on actual object(Child class).
	}
}
