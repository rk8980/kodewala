package com.kodewala.interfacemultipleinheritance;
@FunctionalInterface
interface Calculator
{
	void add(int firstNum, int secondNum);
	public default void subtract(int x, int y)
	{
		
	}
}
class Demo implements Calculator
{

	@Override
	public void add(int firstNum, int secNum) {
		System.out.println("Sum = " + (firstNum + secNum));
	
		
	}

	@Override
	public void subtract(int x, int y) {
		System.out.println("subtraction = " + (x - y));
		
	}

}
public class Main2 {

	public static void main(String[] args) {
		Calculator c = new Demo();
		c.add(10, 20);

	}

}


