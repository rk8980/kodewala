package com.kodewala.streamapipractice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Driver17 {

	public static void main(String[] args) {
		List<String> list1 = Arrays.asList("Banglore", "Pune","Delhi", "Chennai", "Hyderabad");
		List<String> list2 = Arrays.asList("Delhi", "Noida", "Mysore", "Delhi");
		
		Stream.concat(list1.stream(), list2.stream()).distinct().forEach(v -> System.out.println(v));
		
		
		// finding longest words in string.
		
		//Stream.concat(list1.stream(), list2.stream()).max(Comparator<T>)

	}

}
