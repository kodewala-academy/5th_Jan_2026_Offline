package com.kodewala.threads.deadlock;

public class Driver
{

	public static void main(String[] args)
	{
		Task task1 = new Task("Task-1");
		Task task2 = new Task("Task-2");

		Thread1 t1 = new Thread1(task1, task2);
		Thread2 t2 = new Thread2(task1, task2);

		t1.start();
		t2.start();
	}

}
