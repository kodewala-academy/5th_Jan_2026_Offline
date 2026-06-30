package com.kodewala.inf;

import java.util.concurrent.CompletableFuture;

public class Driver1
{

	public static void main(String[] args)
	{

		CompletableFuture<Integer> task1 = CompletableFuture.supplyAsync(() -> {
			System.out.println("Task1 running in: " + Thread.currentThread().getName());
			sleep(3000);
			return 10;
		});

		CompletableFuture<Integer> task2 = CompletableFuture.supplyAsync(() -> {
			System.out.println("Task2 running in: " + Thread.currentThread().getName());
			sleep(3000);
			return 20;
		});

		CompletableFuture<Integer> combined = task1.thenCombine(task2, (a, b) -> {
			System.out.println("Combining in: " + Thread.currentThread().getName());
			return a + b;
		});

		System.out.println("Final Result: " + combined.join());
	}

	private static void sleep(int ms)
	{
		try
		{
			Thread.sleep(ms);
		} catch (Exception e)
		{
		}
	}
}
