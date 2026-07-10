package com.kodewala.str;

public class PrintChars {
	void getchars()
	{
		String str = "Rahul Kumar";
		for(int i = 0; i <= str.length()-1; i++)
		{
			System.out.println(str.charAt(i));
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintChars printChars = new PrintChars();
		printChars.getchars();
	}

}
