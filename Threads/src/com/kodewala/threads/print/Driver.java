package com.kodewala.threads.print;

public class Driver
{

	public static void main(String[] args)
	{
		// System.out.println("Driver.main() START - " +
		// Thread.currentThread().getName());
		Task task = new Task(); // Shared object

		OddThread oddThread = new OddThread(task);
		oddThread.setName("OddThread");

		Task task2 = new Task();
		EvenThread evenThread = new EvenThread(task);
		evenThread.setName("EvenThread");

		evenThread.start();
		oddThread.start();

		// System.out.println("Driver.main() END - " +
		// Thread.currentThread().getName());
	}

}
