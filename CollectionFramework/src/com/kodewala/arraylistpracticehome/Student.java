package com.kodewala.arraylistpracticehome;

public class Student {

	private int studentId;
	private String studentName;
	private String courseName;

	// Constructor
	public Student(int studentId, String studentName, String courseName) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.courseName = courseName;
	}

	// Getter Methods
	public int getStudentId() {
		return studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public String getCourseName() {
		return courseName;
	}

	// Setter Method
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	@Override
	public String toString() {
		return "Student Id : " + studentId +
			   ", Student Name : " + studentName +
			   ", Course Name : " + courseName;
	}
}