package com.kodewala.ex.practice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class NotifyDelivery implements Runnable
{

	@Override
	public void run() {
		System.out.println("NotifyDelivery.run() START " + Thread.currentThread().getName());
		ServiceDelivery delivery = new ServiceDelivery();
		//delivery.doDelivery();
		System.out.println("NotifyDelivery.run() END " + Thread.currentThread().getName());
		
	}
	
}
public class Driver {

	public static void main(String[] args) {
		// Create the executor service
		
		// ExecutorService exeService = Executors.newSingleThreadExecutor(); // only single thread will be created 
		
		//  ExecutorService exeService = Executors.newCachedThreadPool(); // thread will be decided by executor framework
		
		 ExecutorService exeService = Executors.newFixedThreadPool(150); // fix number of thread will created by executor framework
		for (int i = 0; i < 100; i++)
		{
			NotifyDelivery task = new NotifyDelivery();
			exeService.execute(task);
			
		}
		exeService.shutdown();

	}

}
