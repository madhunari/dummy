package com.admin.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private String description;

    private double price;

    private int stockQuantity;

    @ManyToOne
    @JoinColumn(name = "seller_id", nullable = false)
    private User seller;
}
