package com.kodewala.arrays;

import java.util.concurrent.*;

public class FutureVsCompletableFuture
{

	public static void main(String[] args) throws Exception
	{

		// ============================
		// 1. Future - get() blocks
		// ============================

		ExecutorService executor = Executors.newSingleThreadExecutor();

		Future<String> future = executor.submit(() -> 
		{
			Thread.sleep(3000);
			return "Future Result";
		});

		System.out.println("Future : Before get()");

		String futureResult = future.get(); // Blocks here

		System.out.println("Future : " + futureResult);
		System.out.println("Future : After get()");

		executor.shutdown();

		System.out.println("--------------------------------------");


		// ==========================================
		// 2. CompletableFuture without get()
		// ==========================================

		CompletableFuture<String> asyncFuture = CompletableFuture.supplyAsync(() -> {

			try
			{
				Thread.sleep(3000);
			} catch (Exception e)
			{
			}

			return "Async Result";
		});

		System.out.println("Non Blocking : Before thenAccept()");

		asyncFuture.thenAccept(data -> {
			System.out.println("Non Blocking : " + data);
		});

		System.out.println("Non Blocking : After thenAccept()");

		Thread.sleep(5000);
	}
}