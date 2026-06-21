package Opgave03;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        Product product1 = new Product(1, "", 10);
        Product product2 = new Product(2, "", 20);
        Product product3 = new Product(3, "", 30);
        Product product4 = new Product(4, "", 40);
        Product product5 = new Product(5, "", 50);
        Customer customer1 = new Customer("1", LocalDate.of(1999, 12, 12));
        Customer customer2 = new Customer("2", LocalDate.of(1999, 12, 12));

        customer1.addOrder(new Order(1));
        customer1.addOrder(new Order(2));
        for (int index = 0; index < customer1.getOrders().size() - 1; index++) {
            Order currentOrder = customer1.getOrders().get(index);
            currentOrder.createOrderLine(1, product1);
            currentOrder.createOrderLine(2, product2);
        }

        for (int index = 0; index < 4; index++) {
           customer2.addOrder(new Order(index));
            Order currentOrder = customer2.getOrders().get(index);
            currentOrder.createOrderLine(3, product3);
            currentOrder.createOrderLine(4, product4);
            currentOrder.createOrderLine(5, product5);
        }


        System.out.println("Customer 1");
        System.out.println(customer1.totalBuy());
        System.out.println(customer1.totalBuyWithDiscount());
        System.out.println("Customer 2");
        System.out.println(customer2.totalBuy());
        System.out.println(customer2.totalBuyWithDiscount());


        customer1.setDiscount(new PercentDiscount(15));
        customer2.setDiscount(new FixedDiscount(250, 1000));

        System.out.println("Customer 1");
        System.out.println(customer1.totalBuy());
        System.out.println(customer1.totalBuyWithDiscount());
        System.out.println("Customer 2");
        System.out.println(customer2.totalBuy());
        System.out.println(customer2.totalBuyWithDiscount());


    }
}
