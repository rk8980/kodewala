package com.kodewala.oopspractice.polymorphism;

class Delivery
{
	public void doDelivery()
	{
		System.out.println(".DeliverydoDelivery");
	}
}

class EComDelivery extends Delivery
{
	public void doDelivery()
	{
		System.out.println("EComDelivery.doDeliver");
	}
}
public class Driver1 {

	public static void main(String[] args) {
		Delivery delivery = new EComDelivery();
		delivery.doDelivery();

	}

}
