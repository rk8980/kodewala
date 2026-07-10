package com.kodewala.str;

public class Driver {

	public static void main(String[] args) {
		
//		String s2 = new String("kodewala");
//		String s = "Abhishek";
//		String s3 = "kodewala";
//		String s1 = new String("kodewala");
//		System.out.println(s1 == s3);
//		System.out.println(s.equals(s1));
//		System.out.println(s == s1);
//		System.out.println(s1.equals(s2));
//		System.out.println(s1 == s2);
//		
//		String s4 = s.concat(" Ranjan");
//		System.out.println(s4);
//		String s5 = s3.concat(" Academy");
//		//System.out.println(s5);
//		String s6 = "java";
//		String s7 = s6.concat(" World");
//		String s8 = "java World";
//		System.out.println(s6);
//		System.out.println(s7);
//		
//		System.out.println("check the string is in same address or not :  "+ (s7 == s8));
//		
//		String s9 = "Sumit" + " kumar" +" jha";
//		System.out.println(s9);
//		String s10 = "Sumit kumar jha";
//		System.out.println(s9 == s10);
		
		String s11 = "Hello " + "World"; // scp
		
		String s12 = "Kodewala";
		String s13 = "acadeny";
		
		String s14 = s12 + s13;
		
		String s15 = s14.intern(); // copy objejct (s14) from heap tp scp
		System.out.println(s14 == s15); // true(scp)
		
		
		
	}

}

//final class Account 
//{
//	
//}

