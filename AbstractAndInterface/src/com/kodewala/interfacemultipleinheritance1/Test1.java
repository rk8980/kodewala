package com.kodewala.interfacemultipleinheritance1;
interface UpperCase
{
	String toConvert(String str);
}
public class Test1 {

	public static void main(String[] args) {
		UpperCase u = (str) -> str.toUpperCase();
		
		String result = u.toConvert("lamda");
		System.out.println(result);

	}

}
