// Find the city names starts with B and city name length is more than 6
package com.kodewala.streamapipractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Driver2 {

	public static void main(String[] args) {
		List<String> cityName = Arrays.asList("Banglore", "Chennai","Manglore","Hyderabad","Bhubaneswar","");
		//List<String> newCityName = cityName.stream().filter(c-> c.startsWith("B")).filter(a->a.length() > 6).collect(Collectors.toList());
		List<String> newCityName = cityName.stream().filter(w -> w.startsWith("B") && w.length() > 6).collect(Collectors.toList());
		
		System.out.println(newCityName);

	}

}
