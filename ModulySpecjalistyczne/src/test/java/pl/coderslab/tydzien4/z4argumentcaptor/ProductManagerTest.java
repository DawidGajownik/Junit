package pl.coderslab.tydzien4.z4argumentcaptor;

import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import pl.coderslab.tydzien3.z3mockito.Product;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.*;
import static org.assertj.core.api.Assertions.*;

public class ProductManagerTest {

    @Test
    public void testAddProducts() {

        ProductRepository mockProductRepository = mock(ProductRepository.class);

        ProductManager productManager = new ProductManager(mockProductRepository);

        List<Product> productsToAdd = Arrays.asList(
                new Product("Laptop", 1500),
                new Product("Smartphone", 800)
        );

        productManager.addProducts(productsToAdd);

        ArgumentCaptor<Product> productArgumentCaptor = ArgumentCaptor.forClass(Product.class);

        verify(mockProductRepository, times(2)).addProduct(productArgumentCaptor.capture());

        var products = productArgumentCaptor.getAllValues();

        assertThat(products.size()==2).isTrue();
        for (int i = 0; i<productsToAdd.size(); i++) {
            assertThat(productsToAdd.get(i).getName().equals(products.get(i).getName())).isTrue();
            assertThat(productsToAdd.get(i).getPrice()==products.get(i).getPrice()).isTrue();
        }

    }
}
