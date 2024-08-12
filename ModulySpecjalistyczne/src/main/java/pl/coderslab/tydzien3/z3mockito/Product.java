package pl.coderslab.tydzien3.z3mockito;

import lombok.Data;

@Data
public class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
}