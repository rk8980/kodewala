package com.kodewala.completablefuture.practice;

import java.util.concurrent.CompletableFuture;

public class Driver1 {

	public static void main(String[] args) {
		System.out.println("Driver1.main()");
		
		CompletableFuture completableFuture = CompletableFuture.supplyAsync(() -> {System.out.println("I am from supply async");
		return "Success";
		});
		
		System.out.println(" completableFuture's response from supply async : " + completableFuture.join());

	}

}
