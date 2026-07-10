package com.kodewala.oopspractice.inheritance;

public class Delivery {
	private double weight;
	private String address;
	
	public Delivery(double weight, String address)
	{
		this.weight = weight;
		this.address = address;
	}
	public double getWeight()
	{
		return weight;
	}
	public String getAddress()
	{
		return address;
	}
	private void pickupPackage()
	{
		System.out.println("Picking up the package...");
	}
	private void deliverPackage()
	{
		System.out.println("delivering to: "+ address);
	}
	
	
	public void startDelivery()
	{
		pickupPackage();
	}
	
	public void completeDelivery()
	{
		deliverPackage();
		System.out.println("Delivery completed successfully");
	}
}
