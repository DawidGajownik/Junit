package pl.coderslab.tydzien3.z3mockito;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class OrderServiceTest {

    @Test
    void calculateTotalPrice() {
        Order order = mock(Order.class);
        OrderService orderService = new OrderService();
        when(order.getProducts()).thenReturn(List.of(new Product("pr", 22.2), new Product("qw",11.1)));
        assertEquals(33.3, orderService.calculateTotalPrice(order));
    }
}