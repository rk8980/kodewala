package com.kodewala.ArrayString;

public class ReverseEach {
	void getReverseEach()
	{
		String[] arr = {"Rahul", "Sumit"};
		
		for(int i = 0; i < arr.length; i++)
		{
			String rev = "";
			
			for(int j = arr[i].length()-1; j >= 0; j--)
			{
				rev = rev + arr[i].charAt(j);
				
			}
			System.out.println(rev);
		}
	}
	public static void main(String[] args) {
		ReverseEach reverseEach = new ReverseEach();
		reverseEach.getReverseEach();

	}

}
