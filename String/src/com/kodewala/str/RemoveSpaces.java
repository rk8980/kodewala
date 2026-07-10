package com.kodewala.str;

public class RemoveSpaces {
	void getRemoveSpaces()
	{
		String str = "Rahul Kumar";
		String result = "";
		
		for(int i = 0; i <= str.length()-1; i++)
		{
			if(str.charAt(i) != ' ')
			{
				result = result + str.charAt(i);
			}
		}
		System.out.println(result);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoveSpaces removeSpaces = new RemoveSpaces();
		removeSpaces.getRemoveSpaces();
	}

}
