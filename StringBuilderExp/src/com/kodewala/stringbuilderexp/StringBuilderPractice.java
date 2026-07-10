package com.kodewala.stringbuilderexp;

public class StringBuilderPractice {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Hello ");
		
		sb.append("World");
		System.out.println(sb);
		String s1 = "Hello World";
		
		System.out.println(s1.equals(sb));

	}

}
