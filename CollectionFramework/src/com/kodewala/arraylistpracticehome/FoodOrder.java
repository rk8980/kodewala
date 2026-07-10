package com.kodewala.arraylistpracticehome;

public class FoodOrder {

	private int orderId;
	private String foodName;
	private double price;

	// Constructor
	public FoodOrder(int orderId, String foodName, double price) {
		this.orderId = orderId;
		this.foodName = foodName;
		this.price = price;
	}

	// Getter Methods
	public int getOrderId() {
		return orderId;
	}

	public String getFoodName() {
		return foodName;
	}

	public double getPrice() {
		return price;
	}

	// Setter Method
	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Order Id : " + orderId +
			   ", Food Name : " + foodName +
			   ", Price : " + price;
	}
}