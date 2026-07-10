package com.kodewala.treesetpractice;

import java.util.TreeMap;
import java.util.TreeSet;

class Employee implements Comparable<Employee>
{
	String name;
	int salary;
	public char[] ts;
	public Employee(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	@Override
	public int compareTo(Employee e2) 
	{
		 int nameResult = this.name.compareTo(e2.name);
		 if(nameResult != 0)
		    {
		        return nameResult;
		    }

		    return this.salary - e2.salary;
		
	}
	
}
public class Driver {

	public static void main(String[] args) {
		
		
		Employee e1 = new Employee("Sumit", 250000);
		Employee e2 = new Employee("Abhishek", 1230000);
		Employee e3 = new Employee("Piyush", 550000);
		Employee e4 = new Employee("Pawan", 670000);
		Employee e5 = new Employee("Abhishek", 870000);
		
		
		TreeSet<Employee> ts = new TreeSet<Employee>();
		
		ts.add(e1);
		ts.add(e2);
		ts.add(e3);
		ts.add(e4);
		ts.add(e5);
		
		// System.out.println(ts);
		
		
		for(Employee e : ts)
		{
			System.out.println(e.name + " and " + e.salary);
		}
	}

}
