package com.kodewala.exceptionspractice;

import java.io.File;
import java.io.FileReader;

public class Driver7 {
    public static void main(String[] args) {

        try {
            File file = new File("data.txt");

            FileReader fr = new FileReader(file);

            System.out.println("File opened successfully");

        } catch (Exception e) {
            System.out.println("File not found");
            e.printStackTrace();
        }
    }
}
