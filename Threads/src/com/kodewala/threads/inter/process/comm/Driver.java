package com.kodewala.threads.inter.process.comm;

public class Driver
{

	public static void main(String[] args)
	{
		Task task = new Task();

		ProducerThread producerThread = new ProducerThread(task);
		ConsumerThread consumerThread = new ConsumerThread(task);

		
		consumerThread.start();
		producerThread.start();
	}

}
