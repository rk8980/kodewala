// print all even number from list
package com.kodewala.streamapipractice;

import java.util.Arrays;
import java.util.List;

public class PrintAllNumbers {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
		list.stream().filter((n) -> n % 2 == 0).forEach(v -> System.out.println());

	}

}
