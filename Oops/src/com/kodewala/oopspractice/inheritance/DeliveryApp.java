package com.kodewala.oopspractice.inheritance;

public class DeliveryApp {

	public static void main(String[] args) {
		BikeDelivery bike = new BikeDelivery(2.5, "Daltonganj", "Rahul");
		
		TruckDelivery truck = new TruckDelivery(50, "Hyderabad", "JH0 3s 8980");
		
		DroneDelivery drone = new DroneDelivery(1.2, "Chennai", "DR-001");
		
		bike.deliveryByBike();
		System.out.println("-------------------------------------------------");
		truck.deliveryByTruck();
		System.out.println("-------------------------------------------------");
		drone.deliverByDrone();
	}

}
