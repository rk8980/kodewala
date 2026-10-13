package com.example.product.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ProductConsumer {

	@KafkaListener(topics = "product - topic", groupId = "product - group")
	public void ConsumeMessage(String message)
	{
		System.out.println("Message received from kafka:" + message);;
	}
}
