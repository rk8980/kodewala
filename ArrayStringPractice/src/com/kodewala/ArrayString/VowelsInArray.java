package com.kodewala.ArrayString;

public class VowelsInArray {
	void getVowelsInArray()
	{
		
		String[] arr = {"Rahul", "Sumit"};
		
		for(int i = 0; i < arr.length; i++ )
		{
			int count = 0;
			for(int j = 0; j < arr[i].length(); j++)
			{
				char ch = arr[i].charAt(j);
				if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o'|| ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' )
					{
						count++;
						
					}
				
				
			}
			System.out.println(arr[i] + " -> " +count);
		}
		
	}

	public static void main(String[] args) {
		VowelsInArray vowelsInArray = new VowelsInArray();
		vowelsInArray.getVowelsInArray();

	}

}
