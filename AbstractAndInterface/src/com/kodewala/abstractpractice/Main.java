package com.kodewala.abstractpractice;
abstract class Device 
{
	public abstract void turnOn();
}
class Laptop extends Device
{

	@Override
	public void turnOn() {
		System.out.println("Laptop.turnOn()");
		System.out.println("laptop is working");
		
	}
	
}

public class Main {

	public static void main(String[] args) {
		

	}

}
