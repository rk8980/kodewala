package com.kodewala.threadpractice1;
class MyThread extends Thread
{
	@Override
	public void run()
	{
		System.out.println("Counting start from 6 to 10 ......" + Thread.currentThread().getName());
		for(int i = 6; i <= 10;i++)
		{
			System.out.println(i);
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
}
public class Driver {

	public static void main(String[] args) throws InterruptedException {
		Thread.currentThread().setName("MainThread");
		System.out.println("Counting start from 1 to 5....." + Thread.currentThread().getName());
		for(int i = 1; i <= 5; i++)
		{
			System.out.println(i);
			Thread.sleep(1000);
		}
		
		
		MyThread myThread = new MyThread();
		myThread.setName("count");
		myThread.start();
		myThread.join();
		
		
		
		System.out.println("counting end " + Thread.currentThread().getName());

	}


}
