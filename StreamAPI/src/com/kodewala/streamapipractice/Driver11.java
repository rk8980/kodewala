package com.kodewala.streamapipractice;

import java.util.Arrays;
import java.util.List;

public class Driver11 {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(11,12,14,13,3,4,5,6,7,8,9,10);
		
		numbers.stream().skip(4).forEach(n -> System.out.print(n + " "));


	}

}
