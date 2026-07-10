package com.kodewala.streamapipractice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Driver15 {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Banglore", "Pune", "Chennai", "Hyderabad", "Delhi", "Noida", "Mysore");
		
		
		// group the cities by the length. 
		Map<Integer, List<String>>output = list.stream().collect(Collectors.groupingBy(w -> w.length()));
		
		System.out.println(output);
		
		
		// group the cities by the length  whose length is more than 6.
		Map<Integer, List<String>>output1 = list.stream().filter(n -> n.length() > 6).collect(Collectors.groupingBy(w -> w.length()));
		
		System.out.println(output1);
		
		
		// partition the data based on length ,length < 6 and other length > 6.
		
		Map<Boolean, List<String>> output2 = list.stream().collect(Collectors.partitioningBy(w -> w.length() > 6));		
		
		System.out.println(output2);
	}

}
