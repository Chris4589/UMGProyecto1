package com.variables.variables01.proyecto1;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Mock {
    private static List<Customer> customers;
    public Mock() {
        Mock.createInstance();
    }

    private static void createInstance() {
        if (Mock.customers == null) {
            Mock.customers = new ArrayList<>();
        }
    }

    public void createCustomer(Customer customer) {
        Mock.createInstance();
        Mock.customers.add(customer);
    }
    public Integer findCustomerByEmail(String email) {
        AtomicInteger index = new AtomicInteger();
        for (Customer customer : Mock.customers) {
            if (customer.getEmail().equalsIgnoreCase(email)) {
                return index.get();
            }
            index.set(index.get() + 1);
        }
        return null;
    }

    public Customer getCustomer(Integer index) {
        return Mock.customers.get(index);
    }
}
