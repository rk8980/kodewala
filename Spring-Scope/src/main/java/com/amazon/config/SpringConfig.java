package com.amazon.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.amazon.bean.Payment;

@Configuration
public class SpringConfig {
	
	@Bean("pay1")
	
	@Scope("prototype")
	public Payment payment()
	{
		
		Payment payment = new Payment();
		payment.setRefID("REF423");
		return payment;
	}

}
