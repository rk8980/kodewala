package com.kodewala.interfacemultipleinheritance;
interface Verifiable
{
	
}
class Employee
{
	String name;
	public Employee(String name)
	{
		super();
		this.name = name;
	}
}

class Student implements Verifiable
{
	String name;
	
	Student(String name)
	{
		this.name = name;
	}
	
}


public class Main1 {

	public static void main(String[] args) {
		Student s = new Student("Sumit");
		Employee e = new Employee("Abhishek");
		checkVerifiable(e);
		checkVerifiable(s);

	}
	
	public static void checkVerifiable(Object obj)
	{
		if(obj instanceof Verifiable)
		{
			System.out.println("This object is eligible for verification ");
		}
		else
		{
			System.out.println("This object is not eligible for verification  ");
		}
	}

}
