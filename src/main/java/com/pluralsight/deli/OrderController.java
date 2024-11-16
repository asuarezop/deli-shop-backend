package com.pluralsight.deli;

import org.bson.types.ObjectId;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping
    public ResponseEntity<List<Order>> getAllOrders() {
        System.out.println("GET /api/orders called");
        return new ResponseEntity<List<Order>>(orderService.allOrders(), HttpStatus.OK);
    }

    @GetMapping("/{orderId}")
    public ResponseEntity<Optional<Order>> getSingleOrder(@PathVariable int orderId) {
        System.out.println("GET /api/orders called");
        return new ResponseEntity<Optional<Order>>(orderService.singleOrder(orderId), HttpStatus.OK);
    }
}
