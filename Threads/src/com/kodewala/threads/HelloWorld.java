package com.kodewala.threads;

public class HelloWorld
{

	public static void main(String[] args)
	{
		String threadName = Thread.currentThread().getName();

		System.out.println("Hello World , and this code is executed by " + threadName + " thread");

		HelloWorld helloWorld = new HelloWorld();
		helloWorld.doSomething();
	}

	// Task
	public void doSomething()
	{
		System.out.println("HelloWorld.doSomething() and executed by " + Thread.currentThread().getName());
		Order order = new Order();
		order.placeOrder();
	}

}
