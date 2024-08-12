package pl.coderslab.tydzien4.z6refaktoryzacja;


import pl.coderslab.tydzien4.z5argumentmatcher.Product;

import java.util.List;

public class Order {

    public double calculateTotalPrice(List<Product> products) {
        return products.stream().mapToDouble(Product::getPrice).sum();
    }
}