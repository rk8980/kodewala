package com.kodewala.streamapipractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Driver9 {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(4,5,6,7,8,4,5,8,54,67,89,23,44,44,55);
		
		//  remove duplicate 
		
		List<Integer> output = numbers.stream().distinct().collect(Collectors.toList());
		
		
		// numbers.stream().distinct().forEach(n -> System.out.println(n));
		System.out.println(output);

	}

}
