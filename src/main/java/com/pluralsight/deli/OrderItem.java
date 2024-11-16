package com.pluralsight.deli;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class OrderItem {
    @Autowired
    private String size;
    private String bread;
    private Boolean isToasted;
    private Boolean extraToppings;
    private List<String> toppings;
    private String type;
    private String flavor;
}
