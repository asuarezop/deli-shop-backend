package com.pluralsight.deli;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import org.springframework.stereotype.Component;

@Component
public class TestConnection {
    String uri = "mongodb+srv://asuarezop:KWwLIRfH4tBq9UC7@dev-deli-shop-app.mwv6l.mongodb.net";

    public void manualTest() {
        MongoClient mongoClient = MongoClients.create(uri);
        MongoDatabase database = mongoClient.getDatabase("deli-shop-db");
        database.listCollectionNames().forEach(System.out::println);
    }
}


