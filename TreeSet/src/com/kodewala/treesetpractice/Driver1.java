package com.kodewala.treesetpractice;

import java.util.TreeSet;

public class Driver1 {

	public static void main(String[] args) {
		Employee1 e1 = new Employee1("Rahul", "Kumar");
		Employee1 e2 = new Employee1("Abhishek", "Ranjan");
		Employee1 e3 = new Employee1("Sumit", "Jha");
		Employee1 e4 = new Employee1("Piyush", "Sharma");
		
		TreeSet<Employee1> ts = new TreeSet<Employee1>(new NameComparator());
	
		ts.add(e1);
		ts.add(e2);
		ts.add(e3);
		ts.add(e4);
		
		for (Employee1 e : ts)
		{
			System.out.println(e.firstName + " " + e.lastName);
		}

	}

}
