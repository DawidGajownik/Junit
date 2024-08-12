package pl.coderslab.tydzien3.z3mockito;

import org.junit.jupiter.api.Test;

import javax.persistence.EntityManager;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class CustomerReaderTest {

    @Test
    public void happyPathScenario(){
        Customer sampleCustomer = new Customer();
        sampleCustomer.setFirstName("Susan");
        sampleCustomer.setLastName("Ivanova");

        // Symulacja EntityManager
        EntityManager entityManager = mock(EntityManager.class);
        when(entityManager.find(Customer.class,1L)).thenReturn(sampleCustomer);

        // Tworzenie instancji CustomerReader z symulowanym EntityManager
        CustomerReader customerReader = new CustomerReader(entityManager);

        String fullName = customerReader.findFullName(1L);
        assertEquals("Susan Ivanova", fullName);
    }

    @Test
    void findFullName() {
    }
}