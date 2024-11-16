package com.pluralsight.deli;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.aggregation.BooleanOperators;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class OrderService {
    @Autowired
    private TestConnection connection = new TestConnection();
    @Autowired
    private OrderRepository orderRepository;

    @EventListener(ApplicationReadyEvent.class)
    public void logStartup() {
        System.out.println("OrderService is ready");
        connection.manualTest();

        testFetchOrders();
    }

    public List<Order> allOrders(){
        return orderRepository.findAll();
    }

    public void testFetchOrders() {
        List<Order> orders = orderRepository.findAll();
        System.out.println("Fetched Orders: " + orders);
    }
}
