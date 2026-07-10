package com.kodewala.mappractice;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Driver4 {

	public static void main(String[] args) {
		List<String> products = new CopyOnWriteArrayList<String>();
		products.add("Samsung");
		products.add("Apple");
		products.add("Nokia");
		products.add("$Vivo");
		Iterator<String> itr = products.iterator();
		
		while(itr.hasNext())
		{
			String element = (String) itr.next();
			
			products.remove("Samsung");
			System.out.println("removing the junk element");
		}
		
		System.out.println(products);

	}

}
