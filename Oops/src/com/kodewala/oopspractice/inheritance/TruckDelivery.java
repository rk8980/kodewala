package com.kodewala.oopspractice.inheritance;

public class TruckDelivery extends Delivery 
{
	private String truckNumber;
	public TruckDelivery(double weight,String address, String truckNumber) 
	{
		super(weight, address);
		this.truckNumber= truckNumber;
	}
	public void deliveryByTruck()
	{
		startDelivery();
		System.out.println("Delivering by truck, truck number :"+ truckNumber);
		completeDelivery();
	}
}
