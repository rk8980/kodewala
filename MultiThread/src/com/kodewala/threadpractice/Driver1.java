package com.kodewala.threadpractice;


class MyThread1 extends Thread
{
	@Override
	public void run()
	{
		for (int i = 0; i < 10; i++)
		{
			System.out.println("MyThread1.run()"+ i + " "+ Thread.currentThread().getName());
		}
	}
}
public class Driver1 {

	public static void main(String[] args) {
		
		MyThread1 t0 = new MyThread1();
		t0.setName("mythread");
		t0.start();
		
		
		MyThread1 t1 = new MyThread1();
		t1.setName("t2");
		t1.start();
		
		

	}

}
