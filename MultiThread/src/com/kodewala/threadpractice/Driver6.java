package com.kodewala.threadpractice;

class MyThrerad7 implements Runnable
{

	@Override
	public void run() { // running
		System.out.println("printing odd and even number" + Thread.currentThread().getName());
		
		for (int i = 0; i <= 20; i++)
		{
			if(i % 2 == 0)
			{
				System.out.println("Even Number is : " + i + " and " + Thread.currentThread().getName());
				
				 try
		            {
		                Thread.sleep(5000); // 5 seconds
		            }
		            catch (InterruptedException e)
		            {
		                e.printStackTrace();
		            }
			}
			else
			{
				System.out.println("odd number is : " + i + " and " + Thread.currentThread().getName());
			}
//			 try
//	            {
//	                Thread.sleep(1000); // sleep for 1 second
//	            }
//	            catch (InterruptedException e)
//	            {
//	                e.printStackTrace();
//	            }
		}
		
		
		
	}
	
}
public class Driver6 {

	public static void main(String[] args) {
		MyThrerad7 myThread = new MyThrerad7();
		Thread t1 = new Thread(myThread);
		t1.setName("myThread");
		t1.start();
		
		Thread t2 = new Thread(myThread);
		t2.setName("thread2");
		t2.start();

	}

}
