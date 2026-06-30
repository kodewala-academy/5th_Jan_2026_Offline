package com.kodewala.inf1;

import java.util.concurrent.CompletableFuture;

public class Driver
{

	public static void main(String[] args)
	{

		long start = System.currentTimeMillis();
		CompletableFuture<Integer> task1 = CompletableFuture.supplyAsync(() -> {
			sleep();
			return 10;
		});

		CompletableFuture<Integer> task2 = CompletableFuture.supplyAsync(() -> {
			sleep();
			return 20;
		});

		CompletableFuture<Integer> combine = task1.thenCombine(task2, (a, b) -> {

			return a + b;

		});
		
		CompletableFuture<Integer> task3 = task1.thenApply(a -> {
			
			return a*3;
		});
		
		System.out.println(" gds"+task3.join());
		long end = System.currentTimeMillis();
		System.out.println("Time  " + (end - start));
	}

	public static void sleep()
	{
		try
		{
			Thread.sleep(3000);
		} catch (InterruptedException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
