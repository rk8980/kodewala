package com.kodewala.mappractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Drivver3 {

	public static void main(String[] args) {
		List<String> products = new ArrayList<String>();
		
		products.add("Samsung");
		products.add("Apple");
		products.add("Nokia");
		products.add("$Vivo");
		
		System.out.println(products);
		
		  Iterator<String> itr = products.iterator();

	        while (itr.hasNext()) {
	            String product = itr.next();

	            if (product.startsWith("$")) {
	                itr.remove(); 
	                 
	                System.out.println("Removing the junk element");
	            }
	            
	           
	        }
	        System.out.println(products);
	}

}
