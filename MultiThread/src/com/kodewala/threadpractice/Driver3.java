package com.kodewala.threadpractice;
class MyThread6 implements Runnable // implementing RUNNABLE interface
{

	@Override
	public void run() { // Running
		System.out.println("MyThread.run().....attending kodewala clasess---- SARTED at 9 AM");
		System.out.println("MyThread.run()");
		System.out.println("MyThread.run()");
		
		// T1(student) can go to sleep/ wait/pause state (30 mins) ---> WAITING STATE
		// once waiting state is completed t1 will move to Runnable state ----> CPU gives time to t1 ---> Running state 
		
		System.out.println("MyThread6.run()");
		System.out.println("MyThread6.run()");
		
		System.out.println("MyThread6.run().....attending kodewala clasess---- END at 6 AM");
		
	}
	// once run method is completed , our thread t1 is terminated or DEAD
	
}
public class Driver3 {

	public static void main(String[] args) {
		MyThread6 myThread = new MyThread6(); //new Born (Thread object Created)
		Thread t1 = new Thread(myThread); 
		
		t1.start(); //  Threaded Moved from new born to RUNNABLE

	}

}
