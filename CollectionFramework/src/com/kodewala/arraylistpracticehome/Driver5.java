package com.kodewala.arraylistpracticehome;

import java.util.ArrayList;

public class Driver5 {

	public static void main(String[] args) {

		ArrayList<Integer> customerQueue = new ArrayList<Integer>();

		// Adding Customer Tokens
		customerQueue.add(101);
		customerQueue.add(102);
		customerQueue.add(103);
		customerQueue.add(104);
		customerQueue.add(105);

		System.out.println("Original Customer Queue : ");
		System.out.println(customerQueue);

		// Insert VIP Token
		customerQueue.add(1, 999);

		System.out.println();
		System.out.println("After Adding VIP Token : ");
		System.out.println(customerQueue);

		// Remove Served Token
		customerQueue.remove(0);

		System.out.println();
		System.out.println("After Removing Served Token : ");
		System.out.println(customerQueue);

		// Display Final Queue
		System.out.println();
		System.out.println("Final Customer Queue : ");
		System.out.println(customerQueue);
	}
}