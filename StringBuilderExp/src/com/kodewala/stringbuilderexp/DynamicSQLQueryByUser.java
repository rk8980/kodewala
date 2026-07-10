package com.kodewala.stringbuilderexp;

import java.util.Scanner;


public class DynamicSQLQueryByUser {
	void getDynamicSQLQuery()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the department : ");
		String department = sc.nextLine();
		
		System.out.println("enter the salary : ");
		int salary = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter the joining date : ");
		String joiningdate = sc.nextLine();
		
		StringBuffer query = new StringBuffer("SELECT * From employee where 1 = 1 ");
		
		// append filter
		
		if(department != null)
		{
			query.append(" AND department = '").append(department).append("'");
		}
		// salary filter
		if(salary > 0)
		{
			query.append(" AND salary = ").append(salary);
			
		}
		// joining date filter
		if(joiningdate != null)
		{
			query.append(" AND joiningdate = '").append(joiningdate).append("'");
		}
		System.out.println("Generate SQL query : ");
		System.out.println(query);
	}

	public static void main(String[] args) {
		DynamicSQLQueryByUser dynamicSQLQueryByUser = new DynamicSQLQueryByUser();
		dynamicSQLQueryByUser.getDynamicSQLQuery();

	}

}
