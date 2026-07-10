package com.kodewala.arraylistpracticehome;

import java.util.ArrayList;

public class Driver4 {

	public static void main(String[] args) {

		ArrayList<Integer> employeeIdList = new ArrayList<Integer>();

		// Adding Employee IDs
		employeeIdList.add(101);
		employeeIdList.add(102);
		employeeIdList.add(103);
		employeeIdList.add(104);
		employeeIdList.add(105);
		employeeIdList.add(106);

		System.out.println(employeeIdList);

		// Adding New Employee ID
		employeeIdList.add(3, 200);

		System.out.println("After Adding New Employee ID : ");
		System.out.println(employeeIdList);

		// Removing Employee ID
		employeeIdList.remove(2);

		System.out.println("After Removing Employee ID : ");
		System.out.println(employeeIdList);
	}
}