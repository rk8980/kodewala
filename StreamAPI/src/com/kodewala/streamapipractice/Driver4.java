package com.kodewala.streamapipractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Driver4 {

	public static void main(String[] args) {
		List<List<Integer>> numbers = Arrays.asList(Arrays.asList(1, 2, 3, 4), Arrays.asList(5, 6, 7, 8),
				Arrays.asList(9, 10, 11, 23));
		
	List<Integer> output = 	numbers.stream().flatMap(list -> list.stream()).filter(num -> num % 2 == 0).map(num -> num * 10).collect(Collectors.toList());
	
	System.out.println(output);

	}

}
