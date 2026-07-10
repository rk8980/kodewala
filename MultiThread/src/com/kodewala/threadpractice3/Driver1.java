package com.kodewala.threadpractice3;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class EmailSender implements Callable<Boolean>
{

	@Override
	public Boolean call() 
	{
		System.out.println("EmailSender.call()" + Thread.currentThread().getName());
		return true;
	}
	
}
public class Driver1 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService es = Executors.newFixedThreadPool(5);
		
		EmailSender task = new EmailSender();
		
		for (int i = 0; i < 5; i++)
		{
		Future<Boolean> response = es.submit(task);
		
		System.out.println("response from call() method is " + response.get());
		}
		es.shutdown();

	}

}



// java opts
