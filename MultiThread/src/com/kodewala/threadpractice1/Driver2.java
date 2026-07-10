package com.kodewala.threadpractice1;

class Task
{

	synchronized void printNumber() // this method is being executed in parallel (t1 and t2)
	{
		for (int i = 0; i < 10; i++)
		{

			System.out.println(" Number : " + i + " --> " + Thread.currentThread().getName());

		}
	}

}

class PrinterThread extends Thread
{

	Task task;

	public PrinterThread(Task task)
	{
		this.task = task;
	}

	@Override
	public void run()
	{
		task.printNumber();
	}
}

public class Driver2
{

	public static void main(String[] args)
	{
		Task task1 = new Task(); // user1

		PrinterThread oddThread = new PrinterThread(task1);
		oddThread.start();

		Task task2 = new Task(); // user 2
		PrinterThread evenThread = new PrinterThread(task2);
		evenThread.start();
	}

}