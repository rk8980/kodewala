package com.kodewala.streamapipractice;
// remove duplicate from list
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Driver7 {

	public static void main(String[] args) {
		   
		List<String> list = Arrays.asList("banglore", "chennai", "banglore", "hyderabad","delhi","hyderabad");
		
		HashSet<String> set = new HashSet<String>();
		
		list.stream().filter(w -> !set.add(w)).forEach(v -> System.out.println(v));
	}

}
