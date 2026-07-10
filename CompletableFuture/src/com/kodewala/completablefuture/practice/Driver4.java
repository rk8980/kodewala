package com.kodewala.completablefuture.practice;

import java.util.concurrent.CompletableFuture;

public class Driver4 {

	public static void main(String[] args) {
		CompletableFuture<Integer> future1 = CompletableFuture.supplyAsync(() -> 20);
		CompletableFuture<Integer> future2 = CompletableFuture.supplyAsync(() -> 30);
		
		CompletableFuture<Integer> finalFuture = future1.thenCombine(future2, (n1, n2) -> n1 + n2);
		
		System.out.println(finalFuture.join());
		
	}

}
