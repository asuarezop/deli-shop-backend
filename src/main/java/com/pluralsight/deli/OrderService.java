package com.pluralsight.deli;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    //Getting all orders
    public List<Order> allOrders() {
        return orderRepository.findAll();
    }

    //Getting a single order by unique id
    public Optional<Order> singleOrder(int orderId) {
        return orderRepository.findOrderByOrderId(orderId);/*
    * Method returns Optional<Order>
        -Optional is a container object that can return either a null or non-null value
        * Why we need to specify it in this method is because an Order may contain an id that doesn't exist
        * The compiler would return null if the id doesn't exist on the Order
    * */
    }

    public void testFetchOrders() {
        List<Order> orders = orderRepository.findAll();
        System.out.println("Fetched Orders: " + orders);
    }
}
