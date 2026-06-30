package com.kodewala.threads.print;

import java.util.concurrent.locks.ReentrantLock;

public class Task
{

	ReentrantLock reentrantLock = new ReentrantLock(); // Creating reentrant lock object.

	public void printEven() throws InterruptedException // Called on 'task' object. Even Thread will be waiting for
														// lock. outside the
	// method.
	{

		System.out.println("================== Got the Object and Doing PhonePay txn==========================");
		for (int i = 0; i < 20; i++)
		{
			reentrantLock.tryLock();// Trying to get lock and max it(thread) will wait for 1000 ms.
			if (i % 2 == 0)
			{
				System.out.println(" Number is " + i + " and printed by : " + Thread.currentThread().getName());
			}
			reentrantLock.unlock(); // END
		}
		System.out.println("==================Done PhonePay txn==========================");

	}

	public void printOdd() // Called on 'task' object --> Odd Thread got the object lock
	{

		reentrantLock.lock();
		System.out.println("================== Got the Object and Doing  ATM txn==========================");
		for (int i = 0; i < 20; i++)
		{

			if (i % 2 != 0)
			{
				System.out.println(" Number is " + i + " and printed by : " + Thread.currentThread().getName());
			}
		}
		System.out.println("==================Done  ATM txn==========================");
		reentrantLock.unlock();
	}

}
