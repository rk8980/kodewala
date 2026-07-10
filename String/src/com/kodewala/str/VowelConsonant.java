package com.kodewala.str;

public class VowelConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		consonantVowel consonantVowel = new consonantVowel();
		consonantVowel.getconstantandVowel();
	}

}

class consonantVowel
{
	void getconstantandVowel()
	{
		String str = "Rahul";
		int vowel = 0;
		int consonant = 0;
		
		for(int i = 0; i<= str.length()-1; i++)
			
		{
			char ch = str.charAt(i);
			
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
			{
				vowel++;
				//System.out.println("");
			}
			else
			{
				consonant++;
			}
		}
		System.out.println("vowel in " + str + " is = "+vowel);
		System.out.println("consonant in " + str + " is = "+consonant);
	}

}