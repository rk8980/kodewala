package com.kodewala.threadpractice;

public class HelloWorld {

	public static void main(String[] args) {
		
		Thread.currentThread().setName("My Thread");
		System.out.println("HelloWorld.main() START : " + Thread.currentThread().getName());

	}

}
