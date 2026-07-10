package com.kodewala.abstractpractice;
abstract class Ride
{
	protected double distance;
	
	public Ride(double distance)
	{
		this.distance = distance;
	}
	public abstract double calculateFare();
	
	// common mehtod 
	
	public void startRide()
	{
		System.out.println("Ride started...");
	}
}
class MiniRide extends Ride
{

	public MiniRide(double distance) {
		super(distance);
		
	}
	@Override
	public double calculateFare()
	{
		return distance * 10;
	}
}

class LuxuryRide extends Ride
{

	public LuxuryRide(double distance) {
		super(distance);
		
	}
	public double calculateFare()
	{
		return distance * 25;
	}
	
}
public class RideApp {

	public static void main(String[] args) {
		Ride  r1 = new MiniRide(15);
		r1.calculateFare();
		System.out.println("fare = "+ r1.calculateFare());
		r1.startRide();
		System.out.println();
		System.out.println("--------------");
		
		Ride r2 = new LuxuryRide(35);
		r2.calculateFare();
		System.out.println("fare = "+ r2.calculateFare());

		r2.startRide();

	}

}


/*
interface Vehicle {
    void start();
}

class Car implements Vehicle {
    public void start() {
        System.out.println("Car starts with key");
    }
}

class Bike implements Vehicle {
    public void start() {
        System.out.println("Bike starts with button");
    }
}

*/




  interface Login {
    void authenticate();
}

class GoogleLogin implements Login {
    public void authenticate() {
        System.out.println("Login using Google");
    }
}

class EmailLogin implements Login {
    public void authenticate() {
        System.out.println("Login using Email");
    }
}

