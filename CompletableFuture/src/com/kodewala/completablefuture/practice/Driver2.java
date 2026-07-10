package com.kodewala.completablefuture.practice;

import java.util.concurrent.CompletableFuture;

import javax.net.ssl.CertPathTrustManagerParameters;

public class Driver2 {

	public static void main(String[] args) {
		// Write a program to return String in upper case
		
		CompletableFuture cf = CompletableFuture.supplyAsync(() -> {
			String name = "Kodewala";
			
			return name;
		}).thenApply(name -> name.toUpperCase());
		
		System.out.println("response :: " + cf.join());

	}

}
