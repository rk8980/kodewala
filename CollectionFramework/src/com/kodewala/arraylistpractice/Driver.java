package com.kodewala.arraylistpractice;

import java.util.ArrayList;

public class Driver {

	public static void main(String[] args) {
		// Task ---> Create an array list and store the element
		
		ArrayList<String> studentList = new ArrayList<>(); // default size is 10; create an object of ArrayList and store String objects 
		studentList.add("Rahul");
		studentList.add("abhishek");
		studentList.add("ganpat");
		studentList.add("piyush");
		studentList.add("sumit");
		studentList.add("Abhishek");
		studentList.add("Aman");
		studentList.add("Bhanu");
		studentList.add("rohit");
		
		//System.out.println(studentList.get(0));
		
		for (int i = 0; i < studentList.size(); i++)
		{
			String currentElement = studentList.get(i);
			
			if (currentElement.toUpperCase().startsWith("R"))
			{
				System.out.println(currentElement);
			}
		}
		

	}

}
