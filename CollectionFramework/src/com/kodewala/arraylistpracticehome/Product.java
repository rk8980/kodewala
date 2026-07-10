package com.kodewala.arraylistpracticehome;

public class Product {

	private int productId;
	private String productName;
	private double price;

	// Constructor
	public Product(int productId, String productName, double price) {
		this.productId = productId;
		this.productName = productName;
		this.price = price;
	}

	// Getter Methods
	public int getProductId() {
		return productId;
	}

	public String getProductName() {
		return productName;
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
		return "Product Id : " + productId +
			   ", Product Name : " + productName +
			   ", Price : " + price;
	}
}