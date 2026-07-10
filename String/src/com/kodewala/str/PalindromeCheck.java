package com.kodewala.str;

public class PalindromeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckPallindrome checkPallindrome = new CheckPallindrome();
		checkPallindrome.getString();
	}

}

class CheckPallindrome
{
	void getString()
	{
		String str = "madam";
		String rev = "";
		
		for(int i = str.length()-1; i >= 0; i--)
		{
			rev = rev + str.charAt(i);
		}
		if(rev.equals(str))
		{
			System.out.println("this string is pallindrome ");
		}else
		{
			System.out.println("this string is not pallindrome");
		}
	}
}