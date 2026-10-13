package com.example.product.kafka;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ProductProducer {

    private KafkaTemplate<String, String> kafkaTemplate;

    public ProductProducer(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(String message) {

        kafkaTemplate.send("product-topic", message);

        System.out.println("Message sent to Kafka: " + message);
    }
}