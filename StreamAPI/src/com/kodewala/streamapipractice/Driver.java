package com.kodewala.streamapipractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Driver {

	private static Stream<String> upperCaseStream;

	public static void main(String[] args) {
		// collection / storing the products
		List<String> brand = Arrays.asList("samsung", "lg", "sony", "apple", "nokia"," micromax","realme");
		
		System.out.println(brand);
		
		// process the collection - Task---> convert all the brand to upper case
		
		// 1 - convert the collection(list) to stream object
		
		Stream<String> stream = brand.stream();
		
		// 2 - Apply processing logic (intermediate and terminal)
		
		Stream<String> upperCase = stream.map(word -> word.toUpperCase());
		
		// 3 - Collect the result / terminate the stream
		
		
		List<String> processBrand = upperCase.collect(Collectors.toList());
		
		System.out.println("Processed : " + processBrand);

	}

}
