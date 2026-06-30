package com.kodewala.threads.print;

public class EvenThread extends Thread
{
	Task task;

	public EvenThread(Task task)
	{
		this.task = task;
	}

	@Override
	public void run()
	{
		System.out.println(Thread.currentThread().getName() + " waiting for object lock!");
		try
		{
			task.printEven();
		} catch (InterruptedException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // Executing task
	}

}
