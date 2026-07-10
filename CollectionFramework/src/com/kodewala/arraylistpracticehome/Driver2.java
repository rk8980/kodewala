package com.kodewala.arraylistpracticehome;

import java.util.ArrayList;

public class Driver2 {

	public static void main(String[] args) {

		ArrayList<Student> studentList = new ArrayList<Student>();

		// Adding Students
		studentList.add(new Student(101, "Rahul", "Java"));
		studentList.add(new Student(102, "Aman", "Python"));
		studentList.add(new Student(103, "Rohit", "Testing"));
		studentList.add(new Student(104, "Karan", "React"));

		System.out.println("Original Student List : ");
		System.out.println(studentList);

		// Remove Student
		studentList.remove(2);

		System.out.println();
		System.out.println("After Removing Student : ");
		System.out.println(studentList);

		// Update Course
		studentList.get(1).setCourseName("Full Stack Java");

		System.out.println();
		System.out.println("After Updating Course : ");
		System.out.println(studentList);

		// Display All Students
		System.out.println();
		System.out.println("Displaying All Students : ");

		for(Student stu : studentList)
		{
			System.out.println(stu);
		}
	}
}