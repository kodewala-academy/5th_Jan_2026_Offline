package com.kodewala.threads.wait.and.sleep;

class Task
{

	public synchronized void doSomeTask() throws InterruptedException
	{
		for (int i = 0; i < 10; i++)
		{
			System.out.println("Task.doSomeTask() : " + Thread.currentThread().getName());
			Thread.sleep(1000); // t1 is holding object lock of task object
			wait(1000); // will release object lock and goes to waiting state
		}
	}
}

class MyThread extends Thread
{
	private Task task;

	@Override
	public void run()
	{
		try
		{
			task.doSomeTask();
		} catch (InterruptedException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public MyThread(Task _task)
	{
		this.task = _task;
	}
}

public class Driver
{
	public static void main(String[] args)
	{
		MyThread t1 = new MyThread(new Task());
		t1.start();
	}
}
