package com.kodewala.oopspractice.encap;


class Vehicle
{
	private String brand;
	private int spped;
	private String color;
	
	// constructor
	
	public Vehicle(String brand, int speed, String color)
	{
		this.brand = brand;
		this.spped = speed;
		this.color = color;
	}
	// getter
	public String getBrand()
	{
		return brand;
	}
	public int getSpeed()
	{
		return spped;
	}
	public String getColor()
	{
		return color;
	}
}

class Car extends Vehicle
{
	private int price;
	private String fuelType;
	public Car(String brand, int speed, String color,int price, String fuelType)
	{
		super(brand, speed, color);
		this.price = price;
		this.fuelType = fuelType;
	}
	public void display()
	{
		System.out.println("Brand : "+getBrand());
		System.out.println("Speed : "+getSpeed());
		System.out.println("Color is : "+ getColor());
		
		System.out.println("Price : "+price);
		System.out.println("FuelType : "+ fuelType);
	}
}
public class CarType {

	public static void main(String[] args) {
		Car car = new Car("Toyota", 180, "black", 1000000, "petrol");
		car.display();

	}

}
