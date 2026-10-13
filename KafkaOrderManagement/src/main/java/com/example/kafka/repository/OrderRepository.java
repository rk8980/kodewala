package com.example.kafka.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.kafka.entity.Order;

public interface OrderRepository extends JpaRepository<Order,Long> {

}
