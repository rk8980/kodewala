package com.kodewala.streamapipractice;

import java.util.Arrays;
import java.util.List;

// find 2nd largest salary from the list 
public class Driver6 {

	public static void main(String[] args) {
		List<Integer> salaries = Arrays.asList(1000,1200,1300,1000,4400,5000,6000,8000,5000,56000);
		
		// i will remove duplicate.
		// i will sort 
		// then i will do skip and then find first 
		
		salaries.stream().distinct().sorted().forEach(v -> System.out.println(v));
		
		System.out.println("--------------------");
		
		 int output = salaries.stream().distinct().sorted((a, b) -> a - b).skip(6).findFirst().get();
		 
		System.out.println("the 2nd largest salary is : " + output);
		

	}

}
