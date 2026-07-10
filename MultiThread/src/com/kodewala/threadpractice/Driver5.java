package com.kodewala.threadpractice;
class PrintNumbers1 implements Runnable
{
	public void run()
	{
		// running
		System.out.println("PrintNumbers.run()...." + Thread.currentThread().getName());
		
		for (int i = 0; i <= 10; i++)
		{
			System.out.println("numbers is  : " + i + " and " + Thread.currentThread().getName());
			
			if (i == 5)
			{
				System.out.println("Sending" + Thread.currentThread().getName() + " to sleeping state");
				
				try {
					Thread.currentThread().sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("sleep time over..startingb executing again" + Thread.currentThread().getName());
			}
		}
		
	} // terminated 
}
public class Driver5 {

	public static void main(String[] args) {
		PrintNumbers1 printNumbers = new PrintNumbers1();
		
		Thread t1 = new Thread(printNumbers);
		t1.run();
		

	}

}
