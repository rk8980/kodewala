package com.kodewala.arraylistpractice;

import java.util.ArrayList;

public class driver1 {
	public static void main(String[] args) {
		// Create ArrayList
		ArrayList<String> list = new ArrayList<>();

		// Add elements
		list.add("Rahul");
		list.add("Aman");
		list.add("Rohit");
		list.add("Abhishek");

		System.out.println("Original List");
		System.out.println(list);

		// Remove element
		list.remove(1);

		System.out.println("After Removing Element");
		System.out.println(list);
	}
}
