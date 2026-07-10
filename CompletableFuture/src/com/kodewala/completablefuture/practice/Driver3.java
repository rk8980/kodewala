package com.kodewala.completablefuture.practice;

import java.util.concurrent.CompletableFuture;

public class Driver3 {

	public static void main(String[] args) {
		CompletableFuture cf = CompletableFuture.supplyAsync(() -> {
			String name = "kodewala";
			
			return name;
			
		}).thenAccept(a -> System.out.println(" Hello "));
		
		System.out.println("  Response :: " + cf.join());
	}

}
