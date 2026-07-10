package com.kodewala.exceptionspractice;

public class Driver4 {

    public static void main(String[] args) {

        try {

            int num = Integer.parseInt("abc");

            System.out.println(num);
        }

        catch(Exception e) {

            System.out.println("Number Format Exception Handled");

            //e.printStackTrace();
        }

       // System.out.println("Program Continues");
    }
}