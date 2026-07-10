package com.kodewala.threadpractice.itc;

public class Consumer extends Thread {
	
	
	Task task;

	public Consumer(Task task) {
		
		this.task = task;
	}
	public void run()
	{
		for(int i = 0 ; i <= 10; i ++)
		{
			try {
				sleep(1000);
				task.consume();
				sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	

}
