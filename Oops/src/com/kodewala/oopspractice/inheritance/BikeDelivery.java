package com.kodewala.oopspractice.inheritance;

public class BikeDelivery extends Delivery {
	private String riderName;
	
	public BikeDelivery(double weight, String address, String riderName)
	{
		super(weight, address);
		this.riderName = riderName;
	}
	public void deliveryByBike()
	{
		startDelivery();
		System.out.println("Delivering by Bike. Rider: " + riderName);
		completeDelivery();
	}

}
