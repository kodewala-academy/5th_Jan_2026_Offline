package com.kodewala.threads;

class MyThread extends Thread
{
	@Override
	public void run() // run does not return anything
	{
		// work or Task
		for (int i = 0; i < 10; i++)
		{
			System.out.println("Number is "+i +" and printed by " + Thread.currentThread().getName());
		}
	}
}

public class Driver
{

	public static void main(String[] args)
	{
		System.out.println("Driver.main() - START " + Thread.currentThread().getName());
		// Creating thread object
		MyThread t1 = new MyThread(); // main
		// Starting the thread
		t1.start(); // started new thread(Thread-0)

		MyThread t2 = new MyThread(); // main
		// Starting the thread
		t2.start(); // started new thread(Thread-1)

		System.out.println("Driver.main() - END " + Thread.currentThread().getName());
	}

}
