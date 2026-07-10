package com.kodewala.arraylistpractice;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Driver2 {

	public static void main(String[] args) {
		ArrayList<Integer> numberList = new ArrayList<Integer>();
		
		numberList.add(10);
		numberList.add(20);
		numberList.add(30);
		numberList.add(40);
		numberList.add(50);
		numberList.add(60);
		numberList.add(70);
		
		System.out.println(numberList);
		
		numberList.add(4, 45);
		System.out.println("After Adding , New Number List : ");
		System.out.println(numberList);
		
		numberList.remove(3);
		System.out.println("After removing , New Number List : ");
		
		System.out.println(numberList);
		

	}

}
