package com.company.constructor;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Aaa", 100L);
        Customer customer2 = new Customer("Bbb");
        Customer customer3 = new Customer("Ccc");

        Customers customers = new Customers();
        customers.addCustomer(customer1, 0);
        customers.addCustomer(customer2, 1);
        customers.addCustomer(customer3, 2);

        customers.sort();
        customers.print();
        customers.printSomeNumbers(-1, 0);
    }
}

class Customers {
    private Customer[] customers = new Customer[3];

    public void addCustomer(Customer customer, int index) {
        customers[index] = customer;
    }

    public void sort() {
        Comparator<Customer> comparator = (o1, o2) -> o1.getSurname().compareTo(o2.getSurname());
        Arrays.sort(customers, comparator);
    }

    public void print() {
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }

    public void printSomeNumbers(long begin, long end) {
        for (Customer customer : customers) {
            if (customer.getNumber() >= begin && customer.getNumber() <= end) {
                System.out.println(customer);
            }
        }
    }
}
