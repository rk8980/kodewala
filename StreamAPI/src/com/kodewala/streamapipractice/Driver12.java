package com.kodewala.streamapipractice;

import java.io.ObjectInputStream.GetField;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Driver12 {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(11,12,14,13,3,4,5,6,7,8,9,10);
		
		// print the first element only
		
	Optional<Integer> optional = 	numbers.stream().findFirst();
	System.out.println(optional.get());	
	
	
	System.out.println("Driver12.main(limit......)");
	numbers.stream().distinct().sorted((a, b) -> b -a).skip(1).limit(1).forEach(n -> System.out.print(n + " "));
	
	 Map<String, List<Integer>> result =
             numbers.stream()
                    .collect(Collectors.groupingBy(
                            n -> n % 2 == 0 ? "Even" : "Odd"
                    ));
	 System.out.println(result);
	}

}
