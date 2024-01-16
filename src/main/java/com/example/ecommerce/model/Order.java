package com.example.ecommerce.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "orders")
public class Order {

    @Id
    private String id;
    private String userId;
    private List<String> productIds;
    public Order() {
        // Default constructor
    }

    public Order(String userId, List<String> productIds) {
        this.userId = userId;
        this.productIds = productIds;
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public List<String> getProductIds() {
        return productIds;
    }

    public void setProductIds(List<String> productIds) {
        this.productIds = productIds;
    }

    // Additional methods if needed...

    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                ", userId='" + userId + '\'' +
                ", productIds=" + productIds +
                '}';
    }
}
