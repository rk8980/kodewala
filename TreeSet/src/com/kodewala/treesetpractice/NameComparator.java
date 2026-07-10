package com.kodewala.treesetpractice;

import java.util.Comparator;

public class NameComparator implements Comparator<Employee1>
{

	@Override
	public int compare(Employee1 e1, Employee1 e2) {
		
		return e1.firstName.compareTo(e2.firstName) ;// & e1.lastName.compareTo(e2.lastName);
	}

}
