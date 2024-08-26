package com.variables.variables01.proyecto1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private Integer orderId;
    private Date orderDate;
    private Date shippedDate;

    private String status;
    private List<Product> products;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Date getShippedDate() {
        return shippedDate;
    }

    public void setShippedDate(Date shippedDate) {
        this.shippedDate = shippedDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public void addProduct(Product product) {
        if (products == null) {
            products = new ArrayList<>();
        }
        products.add(product);
    }

    public void dispatch() {
        products.forEach(product -> {
            System.out.println("product: "+ product.getProductName());
            if (product.getImported()) {
                System.out.println("The imported product: " + product.getProductName() + " was dispatched.");
            } else {
                System.out.println("The local product: " + product.getProductName() + " was dispatched.");
            }
            System.out.println("The product amount is: " + product.getProductAmount());
            System.out.println("The product id is: " + product.getProductId());
            System.out.println("The product was dispatched on: " + new Date());
        });
    }
}
