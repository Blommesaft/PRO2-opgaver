package Opgave02;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) {

        Customer[] customers = new Customer[3];
        customers[0] = new Customer("Per", "Jensen", 19);
        customers[2] = new Customer("Har", "Ej", 21);
        customers[1] = new Customer("Hansen", "Ej", 81);

        System.out.println(lastCustomer(customers));
        System.out.println(Arrays.toString(afterCustomer(customers, customers[1])));
    }

    public static Customer lastCustomer(Customer[] customers) {
        /*
        Customer last = customers[0];
        for (int index = 0; index < customers.length - 1; index++) {
            if (customers[index].compareTo(customers[index+1]) < 0) {
                last = customers[index+1];
            }
        }
        return last;

         */
        List<Customer> customerSorted = Arrays.asList(customers);
        Collections.sort(customerSorted);
        return customerSorted.getLast();
    }


    public static Customer[] afterCustomer(Customer[] customers, Customer customer) {

        Customer[] nextCustomers = new Customer[customers.length];
        int j = 0;

        for (int index = 0; index < customers.length; index++) {
            if (customer.compareTo(customers[index]) < 0) {
                nextCustomers[j] = customers[index];
                j++;
            }
        }


        return nextCustomers;
    }
}