package com.kodewala.interfacemultipleinheritance1;
interface SquareRoot
{
	double find(double num);
}
public class Main {

	public static void main(String[] args) {
		 SquareRoot sr = (num) -> {
	            double x = num;
	            double y = 1;
	            double error = 0.000001;

	            while (x - y > error) {
	                x = (x + y) / 2;
	                y = num / x;
	            }
	            return x;
	        };
		
		int result = (int) sr.find(16.00);
		String num;
		System.out.println("SquareRoot of   is = " + result);

	}

}
