package com.kodewala.threadpractice;

class MyThread8 implements Runnable

{

	@Override
	public void run() 
	{
		for (int i = 1;i<= 5;i++)
		{
			System.out.println("count : " + i + "Thread Name :" + Thread.currentThread().getName());
		}
		
		
	}
	
}

public class Driver8 {

	public static void main(String[] args) {
		MyThread8 myThread8 = new MyThread8();
		
		Thread t1 = new Thread(myThread8);
		Thread t2 = new Thread(myThread8);
		Thread t3 = new Thread(myThread8);
		
		
		
		t1.setName("EmployeThread");
		t1.setName("PaymentThread");
		t1.setName("OrderThread");
		
		t1.start();
		t2.start();
		t3.start();
		

	}

}
