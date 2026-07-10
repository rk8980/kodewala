package com.kodewala.str;

public class ReverseString {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseTheString reverseTheString = new ReverseTheString();
		reverseTheString.getString();
	}

}

class ReverseTheString
{
	void  getString()
	{
		String str = "Hello";
		String rev = "";
		
		for(int i = str.length()-1; i >= 0;i--)
		{
			rev = rev + str.charAt(i);
		}
		System.out.println("reverse string is : "+rev);
	}
}
