package com.kodewala.streamapipractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Driver3 {

	public static void main(String[] args) {
		// Find the city names starts with B and city name length is more than 6
		List<List<String>> input = Arrays.asList(Arrays.asList("Banglore", "Chennai"),Arrays.asList("Hyderabad","Ahmedabad","Delhi"),
				Arrays.asList("Banaras"));
		
		System.out.println("2D array"+ input);
		
		List<String> flattenList =input.stream().flatMap(list -> list.stream()).collect(Collectors.toList());
		
		System.out.println("1D array" +flattenList );
		
		flattenList.stream().filter(w -> w.startsWith("B") && w.length() > 6).forEach(word -> System.out.println(word));
		
	}

}
