package com.kodewala.oopspractice.encap;

class Person
{
	// encapsulation
	private String name;
	private int age;
	
	// constructor 
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	// getter method 
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
	
}


class Student extends Person
{
	private int marks;

	public Student(String name, int age, int marks) {
		super(name, age);
		this.marks = marks;
		
	}
	public  void display()
	{
		System.out.println("name: "+ getName());
		System.out.println("Age: "+ getAge());
		System.out.println("Marks: "+ marks);
	}
}
public class Main {

	public static void main(String[] args) {
		Student student = new Student("Rahul", 23, 85);
		//student.display();
		student.getName();

	}

}
