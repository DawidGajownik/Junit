package pl.coderslab.tydzien3.z3mockito;

import lombok.Data;

import java.util.List;
@Data
public class Order {
    private List<Product> products;

    public Order(List<Product> products) {
        this.products = products;
    }

}