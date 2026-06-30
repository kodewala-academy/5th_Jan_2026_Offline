package com.kodewala.threads.executor.fw;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Task implements Callable<String>
{
	int taskNo;

	Task(int _taskNo)
	{
		this.taskNo = _taskNo;
	}

	@Override
	public String call()
	{
		return "The task number " + taskNo + " has been completed by " + Thread.currentThread().getName();
	}
}

public class Driver
{

	public static void main(String[] args) throws InterruptedException, ExecutionException
	{

		ExecutorService es = Executors.newSingleThreadExecutor(); // Creating 10 threads

		for (int i = 1; i <= 20; i++) // 10 threads will perform 5 tasks.
		{
			Task task = new Task(i);
			Future<String> future = es.submit(task);
			String output = future.get();
			System.out.println(output);
		}
		es.shutdown();

	}

}
