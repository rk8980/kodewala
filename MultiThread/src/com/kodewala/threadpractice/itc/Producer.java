package com.kodewala.threadpractice.itc;

public class Producer extends Thread {

		Task task;
		
	public Producer(Task task) {
		super();
		this.task = task;
	}
	
	public void run()
	{
		for(int i = 0 ; i <= 10; i ++)
		{
			try {
				sleep(1000);
				task.produce(i);
				sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
