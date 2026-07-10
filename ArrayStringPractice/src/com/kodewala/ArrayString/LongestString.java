package com.kodewala.ArrayString;

public class LongestString {
	void getLongestString()
	{
		String[] arr = {"Rahul", "Sumit", "Abhishek"};
		String longest = arr[0];
		
		for(int i = 1; i <= arr.length-1; i++)
		{
			if(arr[i].length() > longest.length())
			{
				longest = arr[i];
			}
		}
		System.out.println(longest);
	}
	

	public static void main(String[] args) {
		LongestString longestString = new LongestString();
		longestString.getLongestString();

	}

}
