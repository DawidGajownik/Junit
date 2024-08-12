package pl.coderslab.tydzien4.z6refaktoryzacja;

import org.junit.jupiter.api.Test;
import pl.coderslab.tydzien4.z5argumentmatcher.Product;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OrderTest {

    @Test
    void calculateTotalPrice() {
        Order order = new Order();
        var products = List.of(
                        new Product("1","name",50,"elektronika"),
                        new Product("1","name",60,"nieelektonika")
                );
        double sum = order.calculateTotalPrice(products);
        assertEquals(sum, 110);
    }
}