package com.kodewala.inf1;

import java.util.concurrent.CompletableFuture;

// in interface all the methods are public and abstract.
public interface IBank
{
	public abstract void fundTransfer();

	void cancelTxn(); // public abstract void cancelTxn();

	public default void printPassbook() // only rural bank need this feature // added in java 8
	{
		System.out.println("IBank.printPassbook().....");
	}

	// this is common code, all sub classes can re-use it
	public static void sendEmail()
	{
		System.out.println("IBank.sendEmail()"); // 250 (50 connection + 200 biz logic)
	}

	// this is common code, all sub classes can re-use it
	public static void sendSMS()
	{
		System.out.println("IBank.sendEmail()"); // 150 (50 lines for connection + 100 biz logic)
	}
}

class HDFC implements IBank // 20 more bank
{

	@Override
	public void fundTransfer()
	{

	}

	@Override
	public void cancelTxn()
	{
		IBank.sendEmail(); // re-using the generic method
	}

}

class KarnatakaRuralBank implements IBank // 5 rural bank
{

	@Override
	public void fundTransfer()
	{

	}

	@Override
	public void cancelTxn()
	{

	}

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
		
		long end = System.currentTimeMillis();
		System.out.println("Time  "+(end-start));
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
