package pl.coderslab.tydzien4.z5argumentmatcher;

import org.mockito.ArgumentMatcher;

public class ProductMatcher implements ArgumentMatcher<Product> {
    @Override
    public boolean matches(Product product) {
        return product.getPrice() > 1000 && product.getPrice() < 2000 && product.getCategory().equals("elektronika");
    }
}