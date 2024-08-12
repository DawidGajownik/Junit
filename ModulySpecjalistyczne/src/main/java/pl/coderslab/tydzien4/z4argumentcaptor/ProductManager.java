package pl.coderslab.tydzien4.z4argumentcaptor;

import pl.coderslab.tydzien3.z3mockito.Product;

import java.util.List;

public class ProductManager {
    private ProductRepository productRepository;

    public ProductManager(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public void addProducts(List<Product> products) {
        for (Product product : products) {
            productRepository.addProduct(product);
        }
    }
}
