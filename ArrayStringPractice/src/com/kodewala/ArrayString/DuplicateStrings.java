package com.kodewala.ArrayString;

public class DuplicateStrings {
	void getDuplicateStrings()
	{
		String[] arr = {"java", "code", "java", "test"};
		
		for(int i= 0; i <= arr.length-1; i++)
		{
			for(int j = i +1; j <= arr.length-1; j++)
			{
				if(arr[i].equals(arr[j]))
				{
					System.out.println("duplicate in string array is : "+arr[i]);
				}
			}
		}
	}
	
	
	public static void main(String[] args) {
		DuplicateStrings duplicateStrings = new DuplicateStrings();
		duplicateStrings.getDuplicateStrings();

	}

}
