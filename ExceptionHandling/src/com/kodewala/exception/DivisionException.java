
/*3. Division Exception
Question

Write a Java program to:

divide two numbers
handle ArithmeticException
print "Cannot divide by zero"
*/

package com.kodewala.exception;

public class DivisionException {

	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		
		try {
			int result = a / b;
			System.out.println("Result = " + result);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Cannot divide by Zero");
		}

	}

}
