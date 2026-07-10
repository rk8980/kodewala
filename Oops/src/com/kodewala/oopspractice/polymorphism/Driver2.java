package com.kodewala.oopspractice.polymorphism;

class Employee1
{
	public void EmployeeType(String name, String type)
	{
		System.out.println("Full time employee : ");
	}
	public void EmployeeType(String name,String type,int duration)
	{
		System.out.println("Employes do part time work ");
		
	}
	
	public void EmployeeType(String name)
	{
		System.out.println("Doing work from home");
	}
}
public class Driver2 {

	public static void main(String[] args) {
		Employee1 emp = new Employee1();
		emp.EmployeeType("Sumit");

	}

}
