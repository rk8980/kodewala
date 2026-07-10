package com.kodewala.ex.practice;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class NotifyDelivery1 implements Callable<String>
{

	
	@Override
	public String call() throws Exception {
		System.out.println("NotifyDelivery1.run() START " + Thread.currentThread().getName());
		ServiceDelivery delivery = new ServiceDelivery();
		delivery.doDelivery();
		System.out.println("NotifyDelivery.run() END " + Thread.currentThread().getName());
		Thread.sleep(3000);
		return "Success";
	}
	
}
public class Driver1 {

	public static void main(String[] args) {
		// Create the executor service
		
		// ExecutorService exeService = Executors.newSingleThreadExecutor(); // only single thread will be created 
		
		//  ExecutorService exeService = Executors.newCachedThreadPool(); // thread will be decided by executor framework
		
		 ExecutorService exeService = Executors.newFixedThreadPool(3); // fix number of thread will created by executor framework
		for (int i = 0; i < 5; i++)
		{
			NotifyDelivery1 task = new NotifyDelivery1();
			exeService.submit(task);
			
		}
		exeService.shutdown();

	}

}
