package com.kodewala.streamapipractice;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Driver14 {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(2,4,6,8,10,13,11,12,18,19,20);
		
		int output = numbers.stream().reduce(0, (a, b) -> a + b);
		
		System.out.println(output);
		
		// finding maximum from the array
		int output1 = numbers.stream().filter(n -> n % 2 != 0).reduce(0, (a, b) -> a + b); 
		
		System.out.println(output1);
		
		
		// find the minimum number number
		
		Optional<Integer> optional = numbers.stream().min((a,b) -> a - b );
		System.out.println(optional.get());
	            
		Optional<Integer> optional1 = numbers.stream().max((a,b) -> a - b );
		System.out.println(optional1.get());
		
	}

}
