package com.kodewala.oopspractice.inheritance;

public class DroneDelivery extends Delivery {
	private String droneID;
	
	public DroneDelivery(double weight, String address, String droneID)
	{
		super(weight, address);
		this.droneID = droneID;
	}
	
	public void deliverByDrone()
	{
		startDelivery();
		System.out.println("Delivering by drone, droneID : "+ droneID);
		completeDelivery();
	}

}
