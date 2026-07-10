package com.kodewala.ArrayString;

public class CountTotalCharacters {
	void getTotalCharacter()
	{
		String[] arr = {"Rahul", "Sumit"};
		int total = 0;
		
		for(int i = 0; i <= arr.length-1; i++)
		{
			total = total + arr[i].length();
			
			
		}
		System.out.println("total character is : "+ total);
	}

	public static void main(String[] args) {
		CountTotalCharacters countTotalCharacters = new CountTotalCharacters();
		countTotalCharacters.getTotalCharacter();

	}

}
