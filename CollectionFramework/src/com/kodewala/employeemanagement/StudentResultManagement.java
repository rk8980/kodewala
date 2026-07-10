package com.kodewala.employeemanagement;

import java.lang.reflect.Array;
import java.util.ArrayList;

class Student
{
	// private variable
	private int rollNumber;
	private String studentName;
	private double marks;
	
	// constructor
	public Student(int rollNumber, String studentName, double marks)
	{
		super();
		this.rollNumber = rollNumber;
		this.studentName = studentName;
		this.marks = marks;
	}
	
	// gettr method
	
	public int getRollNumber()
	{
		return rollNumber;
	}
	public String getStudentName()
	{
		return studentName;
	}
	public double getMarks()
	{
		return marks;
	}
}
public class StudentResultManagement {

	public static void main(String[] args) {
		// creating ArrayList
		ArrayList<Student> studentList = new ArrayList<Student>();
		
		// Add students
		
		studentList.add(new Student(101, "Rahul", 85));
		studentList.add(new Student(102, "Aman", 30));
		studentList.add(new Student(103, "Abhishek", 92));
		studentList.add(new Student(104, "Bhulu", 60));
		
		// Display all student
		System.out.println("---Student Details-----");
		
		for (int i = 0; i < studentList.size(); i++)
		{
			Student s = studentList.get(i);
			
			System.out.println("Roll Number : " + s.getRollNumber());
			System.out.println("Student Name : " + s.getStudentName());
			System.out.println("Marks : " + s.getMarks());

			System.out.println("----------------------------");
			
			
		}
		// find topper 
		
		Student topper = studentList.get(0);
		
		for(int i = 0; i < studentList.size(); i++)
		{
			Student s = studentList.get(i);
			
			if(s.getMarks() > topper.getMarks())
			{
				topper = s;
			}
		}
		System.out.println("-----------Topper Student------------");
		
		System.out.println("Roll Number : " + topper.getRollNumber());
		System.out.println("Student Name : " + topper.getStudentName());
		System.out.println("Marks : " + topper.getMarks());
		
		// Find Average Marks
		
		double total = 0;
		
		for (int i = 0; i < studentList.size(); i++)
		{
			Student s = studentList.get(i);
			
			total = total + s.getMarks();
		}
		
		double average = total / studentList.size();
		
		System.out.println("\nAverage MArks : " + average);
		
		// Search Student by roll number
		
		int searchRoll = 102;
		
		for (int i = 0; i < studentList.size(); i++)
		{
			Student s = studentList.get(i);
			
			if (s.getRollNumber() == searchRoll)
			{
				System.out.println("\nStudent Found");
				
				System.out.println("Roll Number : " + s.getRollNumber());
				System.out.println("Student Name : " + s.getStudentName());
				System.out.println("Marks : " + s.getMarks());
			}
		}
		
		// Remove Failed Students
		
		for (int i = 0; i < studentList.size(); i++)
		{
			Student s = studentList.get(i);
			
			if (s.getMarks() < 35)
			{
				studentList.remove(i);
				
				i--;
			}
		}
		
		// Display Student After Removing Failed Students 
		
		System.out.println("\n------Student After Removing Failed Students-----");
		
		for (int i = 0; i < studentList.size(); i++)
		{
			Student s = studentList.get(i);
			
			System.out.println("Roll Number : " + s.getRollNumber());
			System.out.println("Student Name : " + s.getStudentName());
			System.out.println("Marks : " + s.getMarks());

			System.out.println("----------------------------");
		}
	}

}
