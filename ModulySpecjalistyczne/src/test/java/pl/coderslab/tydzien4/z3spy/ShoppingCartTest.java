package pl.coderslab.tydzien4.z3spy;

import org.assertj.core.api.MapAssert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class ShoppingCartTest {

    @Spy
    ShoppingCart shoppingCart;

    @Test
    void updateProductQuantity() {
        shoppingCart.addProduct("3", 2);
        assertThat(shoppingCart.getProductQuantity("3")).isEqualTo(2);
        shoppingCart.updateProductQuantity("3", 3);
        assertThat(shoppingCart.getProductQuantity("3")).isEqualTo(3);
        assertThatExceptionOfType(IllegalArgumentException.class).isThrownBy(() -> shoppingCart.updateProductQuantity("1",2));
        assertThatThrownBy(() ->shoppingCart.updateProductQuantity("1",1)).isInstanceOf(IllegalArgumentException.class);
        assertThatException().isThrownBy(()->shoppingCart.updateProductQuantity("1",1));
    }
}