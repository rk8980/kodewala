package com.kodewala.streamapipractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class Employee
{
	String name;
	int salary;
	Employee(String _name, int _salary)
	{
		this.name = _name;
		this.salary = _salary;
	}
	@Override
	public int hashCode()
	{
		return Objects.hash(name, salary);
	}
	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
		{	
			return true;
		}
		if (obj == null || getClass() != obj.getClass())
		{
			return false;
			
			
		}
		Employee other = (Employee) obj;
		
		return salary == other.salary && Objects.equals(name, other.name);
	}
	
	
}
public class Driver8 {

	public static void main(String[] args) {
		Employee e1 = new Employee("Rahul", 100000);
		Employee e2 = new Employee("Abhishek", 1500000);
		Employee e3 = new Employee("Sumit", 1600000);
		Employee e4 = new Employee("Ganpat", 65000);
		Employee e5 = new Employee("Aman", 234500);
		Employee e6 = new Employee("Rahul", 100000);
		
		List<Employee> emp = new ArrayList<Employee>();
		
		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		emp.add(e4);
		emp.add(e5);
		emp.add(e6);
		
		Employee output = emp.stream().sorted((a, b) -> b.salary - a.salary).skip(1).findFirst().get();
		
		System.out.println(output.name + " " + output.salary);
		
		System.out.println(emp.stream().distinct().count());
	}

}
