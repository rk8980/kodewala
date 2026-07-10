package com.kodewala.oopspractice.override;
class Car
{
	 public  void refuel() {
	        System.out.println("Car is refueling...");
	    }
	 
}

class FuelCar extends Car {
    public void refuel() {
        System.out.println("Fuel Car is filling petrol/diesel...");
    }
}

class EVCar extends Car {
    public void refuel() {
        System.out.println("EV Car is charging battery...");
    }
}

public class CarApp {

	public static void main(String[] args) {
		
		System.out.println("----------------");
		 Car car1 = new FuelCar();
	        car1.refuel();  
	        System.out.println("----------------------------");

	        Car car2 = new EVCar();
	        car2.refuel();   

	}

}
