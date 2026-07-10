package com.kodewala.str;

public class LowerToUpper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UpperToLower upperToLower = new UpperToLower();
		upperToLower.getResult();
		
		LowerUpper lowerUpper = new LowerUpper();
		lowerUpper.getCaseResult();
	}

}
class UpperToLower
{
	void getResult()
	{
	String str = "rahul";
	String result = "";
	
	for(int i = 0; i <= str.length()-1; i++)
		{
			char ch = str.charAt(i);
			
			if(ch >= 'a' && ch <= 'z')
			{
				ch = (char)(ch - 32);
			}
			result = result + ch;
		}
			System.out.println(result);
	}
}


class LowerUpper
{
	void getCaseResult()
	{
		String str = "RAHUL";
		String result = "";
		
		for(int i = 0; i<= str.length()-1;i++)
		{
			char ch = str.charAt(i);
			
			if(ch >= 'a' && ch <= 'z')
			{
				ch = (char)(ch - 32);
			}
			result = result + ch;
			
		}
		System.out.println("lower case " + str + " converted to upper  case  : "+ result);
	}
}