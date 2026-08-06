package com.amazon.account.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.amazon.account.beans.Account;

@Configuration // this (@Configuration) tells that this class is source of bean definition.

public class SpringConfig {
	
	// How do we define the bean?
	@Bean("acc1")
	public Account createAccount1()
	{
		Account account = new Account();
		account.setAccountHolderName("Batch 9th March");
		account.setIfscCode("sbin0028");
		account.setAccountNumber("123456");
		
		return account;
	}
	
	@Bean("acc2")
	public Account createAccount2()
	{
		Account account = new Account();
		account.setAccountHolderName("Batch 9th March");
		account.setIfscCode("ifsc0028");
		account.setAccountNumber("12345689");
		
		return account;
	}

}
