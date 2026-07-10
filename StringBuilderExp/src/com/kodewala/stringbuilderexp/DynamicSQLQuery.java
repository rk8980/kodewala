package com.kodewala.stringbuilderexp;

public class DynamicSQLQuery {
	void getDynamicSqlQuery()
	{
		String name = "Rahul";
		int age = 23;
		String city = "Daltonganj";
		// Create base query
		StringBuffer query = new StringBuffer("SELECT * FROM users WHERE 1=1");
		
		// add conditions dynamically
		if(name != null)
		{
			query.append(" AND name = '").append(name).append("'");
			
		}
		//age
		if(age > 0)
		{
			query.append(" AND Age = ").append(age);			
		}
		// city filter
		
		if(city != null)
		{
			query.append("AND city = '").append(city).append("'");	
		}
		System.out.println("Generate sql query");
		System.out.println(query);
	}

	public static void main(String[] args) {
		DynamicSQLQuery dynamicSQLQuery = new DynamicSQLQuery();
		dynamicSQLQuery.getDynamicSqlQuery();

	}

}
