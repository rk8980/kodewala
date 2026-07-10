package com.kodewala.mappractice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Driver2 {

	public static void main(String[] args) {
		List<String> products = new ArrayList<String>();
		
		
		products.add("Samsung");
		products.add("Apple");
		products.add("Nokia");
		products.add("$Vivo");
		
		System.out.println(products);
		
		
		for(String product : products )
		{
			products.add("Realme");
		}
	}		
			
}
