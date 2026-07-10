package com.kodewala.threadpractice;
class TablePrinter implements Runnable
{

	@Override
	public void run() {
		String threadName = Thread.currentThread().getName();
		
		if(threadName.equals("Table-2"))
		{
			for(int i = 1;i <= 10; i++)
			{
				System.out.println("2 x " + i + " = " + (2 * i));
				try
				{
					Thread.sleep(1000);
				}
				catch(InterruptedException e)
				{
					e.printStackTrace();
				}
			}
		}
		else if(threadName.equals("Table-3"))
		{
			for(int i = 1; i <= 10; i++)
			{
				System.out.println("3 x " + i + " = " + (3 * i));
				 try
	                {
	                    Thread.sleep(1000);
	                }
	                catch(InterruptedException e)
	                {
	                    e.printStackTrace();
	                }
			}
		}
		
	}
	
}
public class Driver9 {

	public static void main(String[] args) {
		
		TablePrinter tablePrinter = new TablePrinter();
		Thread t1 = new Thread(tablePrinter);
		Thread t2 = new Thread(tablePrinter);
		
		t1.setName("Table-2");
		t2.setName("Table-3");
		
		
		t1.start();
		t2.start();
	}

}



