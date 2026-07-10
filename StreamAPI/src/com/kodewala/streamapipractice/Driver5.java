package com.kodewala.streamapipractice;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Driver5 {


	public static void main(String[] args) {
		List<String> input = Arrays.asList("I", "Am", "From","Banglore","Banglore","Is","In","Karnatka","Banglore");
		// removing duplicate 
		
		input.stream().distinct().forEach(word -> System.out.println(word));
		
		// Find first element 
		String output = input.stream().skip(0).findFirst().get();
		System.out.println("The first element is : " + output);
		
		// find second element
		String output1 = input.stream().skip(1).findFirst().get();
		System.out.println("the second element is : " + output1);
		
		// finding any
		
		Optional<String> output2 = input.stream().skip(5).findAny();
		System.out.println(output2.get());
		
		// limit the 5 elements
		input.stream().distinct().limit(7).forEach(v -> System.out.println(v));
		
		// sorting
		
		System.out.println("Driver5.main(......Sorting.....)");
		input.stream().sorted().forEach(v -> System.out.println(v));
		
		
		
		//   custom sorting 
		
		System.out.println("--------------------------------------------");
		input.stream().sorted((a, b) ->  a.length() - b.length()).forEach(v -> System.out.println(v));
		
		System.out.println("--------------------------------------------");
		input.stream().sorted((a, b) ->  b.length() - a.length()).forEach(v -> System.out.println(v));
	}

}
