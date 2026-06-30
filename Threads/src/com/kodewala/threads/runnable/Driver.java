package com.kodewala.threads.runnable;

class Task
{
	public int performTask(int a, int b) // 5 ms
	{
		int sum = a + b;
		return sum;
	}
}

class MyThread implements Runnable
{
	Task task;

	MyThread(Task _task)
	{
		this.task = _task;
	}

	@Override
	public void run()
	{ 
        System.out.println(" Task # 4 status updated in database as In-progress");
		int sum = task.performTask(4, 6); // 2 sec
		// write sum to database or file system
		 System.out.println(" Task # 4 status updated in database as Completed and result is "+sum);
	}

}

public class Driver
{

	public static void main(String[] args)
	{
		
	}

}
