package com.kodewala.ArrayString;

public class SortStringsAlphabetically {
	void getSortString()
	{
		String[] name = {"Rahul", "Abhishek", "Sumit"};
		
		for(int i = 0; i<= name.length-1;i++)
		{
			for(int j = i + 1; j <= name.length-1; j++)
			{
				if(name[i].compareTo(name[j] ) > 0)
				{
					String temp = name[i];
					name[i] = name[j];
					name[j] = temp;
				}
			}
		}
		for(int i = 0; i <= name.length-1; i++)
		{
			System.out.println(name[i]);
		}
	}

	public static void main(String[] args) {
		SortStringsAlphabetically sortStringsAlphabetically = new SortStringsAlphabetically();
		sortStringsAlphabetically.getSortString();

	}

}
