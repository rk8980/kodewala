package com.kodewala.threadpractice.itc;

public class Driver {

	public static void main(String[] args) {
		  Task task = new Task();

	       Producer p = new Producer(task);
	       
	       p.start();
	       
	       
	       Consumer c = new Consumer(task);
	       
	       c.start();

			

	}

}
