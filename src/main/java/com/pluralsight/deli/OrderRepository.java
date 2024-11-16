package com.pluralsight.deli;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface OrderRepository extends MongoRepository<Order, ObjectId> {

    //Automatic query to find an Order based on property orderId
    Optional<Order> findOrderByOrderId(int orderId);
}
