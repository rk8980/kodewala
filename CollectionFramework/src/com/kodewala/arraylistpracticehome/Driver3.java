package com.kodewala.arraylistpracticehome;

import java.util.ArrayList;

public class Driver3 {

	public static void main(String[] args) {

		ArrayList<FoodOrder> orderList = new ArrayList<FoodOrder>();

		// Add Orders
		orderList.add(new FoodOrder(101, "Burger", 150));
		orderList.add(new FoodOrder(102, "Pizza", 300));
		orderList.add(new FoodOrder(103, "Pasta", 250));
		orderList.add(new FoodOrder(104, "Sandwich", 120));

		System.out.println("Original Order List : ");
		System.out.println(orderList);

		// Cancel Order
		orderList.remove(2);

		System.out.println();
		System.out.println("After Cancelling Order : ");
		System.out.println(orderList);

		// Update Food Price
		orderList.get(1).setPrice(350);

		System.out.println();
		System.out.println("After Updating Food Price : ");
		System.out.println(orderList);

		// Display All Orders
		System.out.println();
		System.out.println("Displaying All Orders : ");

		for(FoodOrder order : orderList)
		{
			System.out.println(order);
		}
	}
}