package com.variables.variables01.proyecto1;

import java.util.ArrayList;
import java.util.List;

public class Customer extends Person {
    private String email;
    private String address;
    private String creaditCardInfo;
    private Double balanceAccount;
    private List<Order> orders;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCreaditCardInfo() {
        return creaditCardInfo;
    }

    public void setCreaditCardInfo(String creaditCardInfo) {
        this.creaditCardInfo = creaditCardInfo;
    }

    public Double getBalanceAccount() {
        return balanceAccount;
    }

    public void setBalanceAccount(Double balanceAccount) {
        this.balanceAccount = balanceAccount;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void addOrder(Order order) {
        if (orders == null) {
            orders = new ArrayList<>();
            return;
        }
        orders.add(order);
    }
}
