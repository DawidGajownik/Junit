package pl.coderslab;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class ProductRepositoryTest {

    @Autowired
    private TestEntityManager entityManager;
    @Autowired
    private ProductRepository productRepository;

    @Test
    void findOneByName() {
        Product product = new Product();
        product.setName("jogurt");
        entityManager.persist(product);
        Optional <Product> productOptional = productRepository.findOneByName("jogurt");
        assertEquals(productOptional.get(), product);
        assertEquals(productOptional.get().getName(), product.getName());
    }

    @Test
    void findByAvailableIsTrue() {
        Product product1 = new Product();
        Product product2 = new Product();
        Product product3 = new Product();
        Product product4 = new Product();
        Product product5 = new Product();
        product1.setAvailable(true);
        product2.setAvailable(false);
        product3.setAvailable(true);
        product4.setAvailable(false);
        product5.setAvailable(true);
        entityManager.persist(product1);
        entityManager.persist(product2);
        entityManager.persist(product3);
        entityManager.persist(product4);
        entityManager.persist(product5);
        var result = productRepository.findByAvailableIsTrue();
        assertThat(result).containsExactly(product1, product3, product5);
    }
}