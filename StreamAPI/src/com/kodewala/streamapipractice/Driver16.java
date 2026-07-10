package com.kodewala.streamapipractice;

import java.util.Optional;

public class Driver16 {

	public static void main(String[] args) {
		
		// Find the first non repeating character from the string 
		String word = "swiss";
		
		Optional<Character> output = word.chars().mapToObj(c -> (char) c).filter(ch -> word.indexOf(ch) == word.lastIndexOf(ch)).findFirst();
		
		System.out.println(output.get());
		
		
		// Find the Second non repeating character from the string 
		Optional<Character> output1 = word.chars().mapToObj(c -> (char) c).filter(ch -> word.indexOf(ch) == word.lastIndexOf(ch)).skip(1).findFirst();
		
		System.out.println(output1.get());
		
	}

}
