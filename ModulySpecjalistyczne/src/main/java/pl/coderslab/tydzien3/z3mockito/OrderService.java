package pl.coderslab.tydzien3.z3mockito;


public class OrderService {
    public double calculateTotalPrice(Order order) {
        double totalPrice = 0;
        for (Product product : order.getProducts()) {
            totalPrice += product.getPrice();
        }
        return totalPrice;
    }
}