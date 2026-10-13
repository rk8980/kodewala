package com.example.kafka.service;

import org.springframework.stereotype.Service;

import com.example.kafka.entity.Order;
import com.example.kafka.repository.OrderRepository;

@Service
public class OrderService {

    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public Order saveOrder(Order order) {

        return orderRepository.save(order);
    }
}