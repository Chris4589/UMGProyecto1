package com.variables.variables01.proyecto1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        var scanner = new Scanner(System.in);
        CustomerController customerController = new CustomerController();
        Mock mock = new Mock();

        System.out.println("Welcome to the store");
        System.out.println("Please register to continue");
        var customer = customerController.register();
        mock.createCustomer(customer);

        System.out.println("Please login to continue");
        var index = customerController.login(scanner);
        if (index == null) {
            System.out.println("The email is not registered");
            return;
        }

        System.out.println("Please create an order to continue");
        customerController.createOrders(index, scanner);

        scanner.close();
    }
}
