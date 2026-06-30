package com.kodewala.threads.wait.and.callable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class MyThread implements Callable<String>
{

	@Override
	public String call() throws Exception
	{
		int sum = 6 + 10;
		System.out.println(" Executed by " + Thread.currentThread().getName());
		Thread.sleep(3000);
		return "hello from call() method...";
	}

}

public class Driver
{

	public static void main(String[] args) throws InterruptedException, ExecutionException
	{
		System.out.println("Driver.main() - START : " + Thread.currentThread().getName());
		ExecutorService executorService = Executors.newFixedThreadPool(1);

		MyThread task = new MyThread();

		Future<String> future = executorService.submit(task); // Will start new thread...
		System.out.println("Driver.main() Before future.get() : " + Thread.currentThread().getName());

		String msg = future.get(); // Blocking --> waiting for output/return from call method / thread

		System.out.println("Driver.main() after : " + Thread.currentThread().getName());
		System.out.println(msg);
		
		executorService.shutdown();

	}

}
