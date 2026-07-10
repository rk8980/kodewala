package com.kodewala.stringbuilderexp;

public class StringBufferExample {

	public static void main(String[] args) {
		// Create a StringBuffer with initial content
		StringBuffer sb = new StringBuffer("Welcome to");
		// Use insert() method to insert text at a specific position
		sb.insert(10, " Kodewala Acadeny!");
		System.out.println(sb);
		

	}

}
