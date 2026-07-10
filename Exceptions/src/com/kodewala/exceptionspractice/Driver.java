package com.kodewala.exceptionspractice;

public class Driver {

    public static void main(String[] args) {

        try {

            int arr[] = new int[3];

            arr[5] = 100;

            int a = 10 / 0;
        }

        catch(ArrayIndexOutOfBoundsException e) {

            System.out.println("Array Exception");
            e.printStackTrace();
        }

        catch(ArithmeticException e) {

            System.out.println("Arithmetic Exception");
        }
    }
}