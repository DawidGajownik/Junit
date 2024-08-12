package pl.coderslab.tydzien3.z3mockito;

import javax.persistence.EntityManager;


public class CustomerReader {

    EntityManager entityManager;

    public CustomerReader(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public String findFullName(Long customerID){
        Customer customer = entityManager.find(Customer.class, customerID);
        return customer.getFirstName() +" "+customer.getLastName();
    }

}
