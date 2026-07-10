package com.kodewala.setpractice;

class Employee
{
	String firstName;
	String lastName;
	int age;
	public Employee(String firstName, String lastName, int age) {
		//super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;    
	}
	@Override
	public boolean equals(Object obj)
	{
		Employee e2 = (Employee) obj;
		return this.firstName.equals(e2.firstName) & this.lastName.equals(e2.lastName) && this.age == e2.age;
		
	}
	//@Override
	public int hasCode()
	{
		
		return (this.firstName + this.lastName).hashCode();
		
	}
	
}
public class Driver {

	public static void main(String[] args) {
		
		Employee e1 = new Employee("kodewala", "Academy",33);
		Employee e2 = new Employee("kodewala", "Academy",33);
		System.out.println(e1 == e2);
		System.out.println(e1.equals(e2));
		System.out.println(e1.hasCode());
		System.out.println(e2.hasCode());
	}

}