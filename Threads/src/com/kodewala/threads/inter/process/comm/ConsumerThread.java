package com.kodewala.threads.inter.process.comm;

public class ConsumerThread extends Thread
{

	Task task;

	public ConsumerThread(Task task)
	{
		super();
		this.task = task;
	}

	@Override
	public void run()
	{
		for (int i = 0; i < 10; i++)
		{
			try
			{
				sleep(2000);
				task.consume();
			} catch (InterruptedException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
