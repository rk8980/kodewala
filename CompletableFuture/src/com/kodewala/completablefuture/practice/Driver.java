package com.kodewala.completablefuture.practice;

import java.util.concurrent.CompletableFuture;

public class Driver {

	public static void main(String[] args) {
		System.out.println("Driver.main() START");
		CompletableFuture completableFuture = CompletableFuture.runAsync(() -> { System.out.println("This is from runAsync");});
		System.out.println(completableFuture.join());
		
		System.out.println("Driver.main() END");
	}

}
