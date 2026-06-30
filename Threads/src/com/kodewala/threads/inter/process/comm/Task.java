package com.kodewala.threads.inter.process.comm;

public class Task
{
	private int number;
	private boolean isDataAvailable = false;

	public synchronized void produce(int _num) throws InterruptedException
	{
		while (isDataAvailable)
		{
			wait();
		}
		number = _num;
		System.out.println(" Data produced " + number);
		isDataAvailable = true;
		notify();
	}

	public synchronized void consume() throws InterruptedException
	{
		while (!isDataAvailable)
		{
			wait();
		}
		System.out.println(" consuming data "+number);
		isDataAvailable=false;
		notify();
	}
}
