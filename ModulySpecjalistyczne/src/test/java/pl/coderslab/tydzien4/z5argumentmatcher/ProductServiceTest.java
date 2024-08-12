package pl.coderslab.tydzien4.z5argumentmatcher;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentMatcher;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.ArgumentMatchers.argThat;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class ProductServiceTest {

    @Mock
    ProductRepository productRepository;

    @InjectMocks
    ProductService productService;

    @Test
    void calculateDiscount() {

        Product product = new Product("1","name",50,"elektronika");
        Product product2 = new Product("1","name",60,"nieelektonika");

        double discount = productService.calculateDiscount(product);
        double discount2 = productService.calculateDiscount(product2);

        //opcja 1
        verify(productRepository, never()).addProduct(argThat(product1 -> product1.getPrice() > 1000 && product1.getPrice() < 2000 && product1.getCategory().equals("elektronika")));

        //opcja 2
        verify(productRepository, never()).addProduct(argThat(new ProductMatcher()));
    }
}