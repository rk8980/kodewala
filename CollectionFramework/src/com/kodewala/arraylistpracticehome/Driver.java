package com.kodewala.arraylistpracticehome;

import java.util.ArrayList;

public class Driver {

	public static void main(String[] args) {

		ArrayList<Product> productList = new ArrayList<Product>();

		// Adding Products
		productList.add(new Product(101, "Laptop", 55000));
		productList.add(new Product(102, "Mobile", 25000));
		productList.add(new Product(103, "Keyboard", 1500));
		productList.add(new Product(104, "Mouse", 700));

		System.out.println("Original Product List : ");
		System.out.println(productList);

		// Adding Product at Specific Index
		productList.add(2, new Product(105, "Monitor", 12000));

		System.out.println();
		System.out.println("After Adding New Product : ");
		System.out.println(productList);

		// Removing Product
		productList.remove(3);

		System.out.println();
		System.out.println("After Removing Product : ");
		System.out.println(productList);

		// Updating Price
		productList.get(1).setPrice(27000);

		System.out.println();
		System.out.println("After Updating Product Price : ");
		System.out.println(productList);
	}
}