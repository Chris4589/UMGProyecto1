package com.variables.variables01.proyecto1;

import java.util.Scanner;

public interface ICustomerController {
    Customer register();
    Integer login(Scanner scanner);
    void createOrders(Integer index, Scanner scanner);
}
