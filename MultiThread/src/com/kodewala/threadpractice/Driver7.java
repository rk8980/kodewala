package com.kodewala.threadpractice;
class FactorialThread implements Runnable
{

	@Override
	public void run() {
		int fact = 1;
		for (int i = 1; i <= 5; i++)
		{
			fact = fact * i;
		}
		System.out.println("Factorial = " + fact);
	}
	
}
public class Driver7 {

	public static void main(String[] args) {
		FactorialThread factorialThread = new FactorialThread();
		factorialThread.run();

	}

}
