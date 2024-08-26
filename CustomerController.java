package com.variables.variables01.proyecto1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class CustomerController implements ICustomerController {
    @Override
    public Customer register() {
        var scanner = new Scanner(System.in);
        System.out.println("Enter the customer's name: ");
        var name = scanner.nextLine();
        System.out.println("Enter the customer's lastname: ");
        var lastname = scanner.nextLine();
        System.out.println("Enter the customer's DPI: ");
        var DPI = scanner.nextLine();
        System.out.println("Enter the customer's email: ");
        var email = scanner.nextLine();
        System.out.println("Enter the customer's address: ");
        var address = scanner.nextLine();
        System.out.println("Enter the customer's credit card info: ");
        var creditCardInfo = scanner.nextLine();
        System.out.println("Enter the customer's balance account: ");
        var balanceAccount = scanner.nextDouble();

        var customer = new Customer();
        customer.setName(name);
        customer.setLastname(lastname);
        customer.setDPI(DPI);
        customer.setEmail(email);
        customer.setAddress(address);
        customer.setCreaditCardInfo(creditCardInfo);
        customer.setBalanceAccount(balanceAccount);
        return customer;
    }

    @Override
    public Integer login(Scanner scanner) {
        System.out.println("Enter the customer's email: ");
        var email = scanner.nextLine();

        var mock = new Mock();
        return mock.findCustomerByEmail(email);
    }

    @Override
    public void createOrders(Integer customerId, Scanner scanner) {
        var customers = new Mock();
        var customer = customers.getCustomer(customerId);

        var order = new Order();

        System.out.println("Enter the number of orders that you want: ");
        var numberOfOrders = scanner.nextInt();

        for (int i = 0; i < numberOfOrders; i++) {
            System.out.println("Enter the number of products that you want: ");
            var numberOfProducts = scanner.nextInt();
            for (int j = 0; j < numberOfProducts; j++) {
                var product = new Product();

                System.out.println("Enter the product name: ");
                var productName = scanner.next();
                System.out.println("Enter the product amount: ");
                var productAmount = scanner.nextInt();
                System.out.println("Enter the product id: ");
                var productId = scanner.nextInt();
                System.out.println("Is the product imported? (true/false): ");
                var isImported = scanner.nextBoolean();
                System.out.println("Is the product local? (true/false): ");
                var isLocalProduct = scanner.nextBoolean();

                product.setProductName(productName);
                product.setProductAmount(productAmount);
                product.setProductId(productId);
                product.setImported(isImported);
                product.setLocalProduct(isLocalProduct);

                order.addProduct(product);
            }
            order.setOrderId(i);
            order.setStatus("CREATED");
            order.setOrderDate(new Date());
            order.setShippedDate(new Date());

            customer.addOrder(order);
            order.dispatch();
        }
    }
}
