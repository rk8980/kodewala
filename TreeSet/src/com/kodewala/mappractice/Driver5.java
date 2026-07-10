package com.kodewala.mappractice;

import java.util.Map.Entry;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class Driver5 {

	public static void main(String[] args) {
		Map<String, String> map = new ConcurrentHashMap<String, String>();
		
		map.put("Abhishek","abhishek@gmail.com" );
		map.put("Piyush","piyush@gmail.com" );
		map.put("Subham","subham@gmial.com");
		map.put("Aman", "amman@gmail.com");
		map.put("Ranka", "ranka@gmail.com");
		
		System.out.println(map);
		
		Set<Entry<String, String>> entrySet = map.entrySet();
		
		Iterator<Entry<String, String>> itr = entrySet.iterator();
		
		while(itr.hasNext())
		{
			Entry element = itr.next();
			
			map.remove("Subham");
			System.out.println(element.getKey()+ " and "+ element.getValue());
			System.out.println(map);

		}
	}

}
