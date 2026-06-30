package com.kodewala.threads.cook.waiter;

class Cook extends Thread
{
	public void run()
	{
		try
		{
			System.out.println(" Cooking food - Started");
			Thread.sleep(2000);
			System.out.println(" Cooking food - Ended");
		} catch (InterruptedException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

public class Driver
{

	public static void main(String[] args) throws InterruptedException
	{
		System.out.println("Waiter - Took Order and waiting for food to be cooked");
		Thread.currentThread().setName("Waiter");

		Cook cookThread = new Cook();
		
		cookThread.start();
		cookThread.join(); // waiter(main) thread join the cook thread.
		System.out.println("Waiter - Started serving food.");
	}

}
