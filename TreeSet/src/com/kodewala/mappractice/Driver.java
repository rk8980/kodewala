package com.kodewala.mappractice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Driver {

	public static void main(String[] args) {
		//Task to store key value 
		Map<String, String> cityAndEmpName= new HashMap<String, String>();
		
		cityAndEmpName.put("Darbhanga", "Sumit");
		cityAndEmpName.put("Daltonganj", "Abhishek");
		cityAndEmpName.put("PAtna", "Piyush");
		cityAndEmpName.put("Asansol", "Ganpat");
		cityAndEmpName.put("Garhwa", "Aman");
		cityAndEmpName.put("Gaya ji", "Akash");
		cityAndEmpName.put("Latehar", "Ajay");
		
		//System.out.println(cityAndEmpName);
		//System.out.println(empIdAndName.get(02));
		
		System.out.println("Darbhanga".hashCode());
		
		// convert the map to set bcz map dont have iterator 
		
		Set<Entry<String, String>> entrySet = cityAndEmpName.entrySet();
		
		// using iterator on set 
		
		Iterator<Entry<String, String>> itr = entrySet.iterator();
		
		// iterate it
		
		while (itr.hasNext())
		{
			Entry<String, String> element = itr.next();
			System.out.println(element.getKey()+ " and "+ element.getValue());
		}
				

	}

}
