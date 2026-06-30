package com.kodewala.threads.print;

public class OddThread extends Thread
{
	Task task;

	public OddThread(Task task)
	{
		this.task = task;
	}

	@Override
	public void run()
	{
		System.out.println(Thread.currentThread().getName()+" waiting for object lock!");
		task.printOdd(); // Executing task
	}

}
