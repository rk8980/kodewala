package com.kodewala.threadpractice;
class MyThread5 implements Runnable
{

	@Override
	public void run() {
		System.out.println("MyThread.run()............");
		
	}
	
}
public class Driver2 {

	public static void main(String[] args) {
		MyThread5 myThread = new MyThread5(); // New Born (Thread Object Created)
		Thread t1 = new Thread(myThread); 
		t1.start(); // Threaded moved from new born to Runnable
	}

}
