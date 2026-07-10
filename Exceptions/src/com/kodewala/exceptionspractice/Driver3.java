package com.kodewala.exceptionspractice;

public class Driver3 {

    public static void main(String[] args) {

        try {

            int arr[] = new int[3];

            arr[5] = 100;
        }

        catch(Exception e) {

            System.out.println("Array Exception Handled");

            e.printStackTrace();
        }

        System.out.println("Program Continues");
    }
}
