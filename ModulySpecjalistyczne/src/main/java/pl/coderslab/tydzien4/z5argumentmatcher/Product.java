package pl.coderslab.tydzien4.z5argumentmatcher;

import lombok.Data;

@Data

public class Product {
    private String id;
    private String name;
    private double price;
    private String category;

    public Product(String id, String name, double price, String category){
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
    }
}