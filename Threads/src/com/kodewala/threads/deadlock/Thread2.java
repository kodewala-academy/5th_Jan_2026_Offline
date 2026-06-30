package com.kodewala.threads.deadlock;

public class Thread2 extends Thread
{
	Task task1;
	Task task2;

	public Thread2(Task task1, Task task2)
	{
		super();
		this.task1 = task1;
		this.task2 = task2;
	}

	@Override
	public void run()
	{
		synchronized (task1) // hold by t2 for 100 ms
		{

			try
			{
				System.out.println(" Executing - " + task2.getTaskName());
				Thread.sleep(100);
			} catch (InterruptedException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			synchronized (task2)
			{

				System.out.println(" Executing - " + task1.getTaskName());

			}

		}

	}
}
