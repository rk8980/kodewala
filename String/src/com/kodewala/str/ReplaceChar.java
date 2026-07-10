package com.kodewala.str;

public class ReplaceChar {
	void getreplace()
	{
		String str = "Hello";
		String result = "";
		
		for(int i = 0; i <= str.length()-1; i++)
		{
			char ch = str.charAt(i);
			if(str.charAt(i) == 'l')
			{
				result = result + 'x';
			}
			else
			{
				result = result + ch;
			}
		}
		System.out.println(result);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReplaceChar replaceChar = new ReplaceChar();
		replaceChar.getreplace();
	}

}
