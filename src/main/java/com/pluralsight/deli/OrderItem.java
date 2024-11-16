package com.pluralsight.deli;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "items")
public class OrderItem {
    public OrderItem() {
    }

    @Autowired
    private String size;
    private String bread;
    private Boolean isToasted;
    private Boolean extraToppings;
    private List<String> toppings;
    private String type;
    private String flavor;
}
