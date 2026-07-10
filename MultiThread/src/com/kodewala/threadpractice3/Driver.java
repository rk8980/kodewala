package com.kodewala.threadpractice3;
class FirstThread extends Thread
{
	@Override
	public void run() {
		System.out.println("FirstThread.run() START " + Thread.currentThread().getName());
		Thread.yield(); // pause the current thread and give the chance to another thread to execute 
		System.out.println("FirstThread.run() END " + Thread.currentThread().getName());
	}

}
public class Driver {

	public static void main(String[] args) {
		FirstThread t1 = new FirstThread();
		t1.start();
		
		
		FirstThread t2 = new FirstThread();
		t2.start();

	}

}
