package com.pluralsight.deli;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
@ComponentScan(basePackages = {"com.pluralsight.deli"})
public class DeliShopApp {

    @GetMapping("/")
    public String printResponse() {
        return "Hello from backend!";
    }

    public static void main(String[] args) {
        SpringApplication.run(DeliShopApp.class, args);
    }
}
