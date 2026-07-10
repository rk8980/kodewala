package com.kodewala.str;

public class WordCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountWord countWord = new CountWord();
		countWord.getCount();
	}

}

class CountWord
{
	void getCount()
	{
		String str = "Hello World";
		int count = 1;
		
		for(int i = 0; i<= str.length()-1; i++)
		{
			if(str.charAt(i) == ' ')
			count++;
		}
		System.out.println("word : "+count);
	}
}