package com.kodewala.streamapipractice;

import java.util.Arrays;
import java.util.List;

public class Driver10 {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(11,12,14,13,3,4,5,6,7,8,9,10);
		
		System.out.println("number sorted in ascending order.......");
		
		numbers.stream().sorted((a, b) -> a - b).forEach(num -> System.out.print(num + " "));
		
		System.out.println("\n numbers sorted un descending order.......");
		
		numbers.stream().sorted((a, b) -> b - a).forEach(num -> System.out.print(num + " "));

	}

}
