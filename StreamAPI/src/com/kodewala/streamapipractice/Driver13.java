package com.kodewala.streamapipractice;
// find third highest even number from given list of integer
import java.util.Arrays;
import java.util.List;

public class Driver13 {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(2,4,6,8,10,13,11,12,18,19,20);
		
		int output = numbers.stream().distinct().filter(n -> n % 2 == 0).sorted((a, b) -> b - a).skip(2).findFirst().get();
		
		System.out.println(output);

	}

}
