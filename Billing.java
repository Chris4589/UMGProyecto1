package com.variables.variables01.proyecto1;

import java.util.Date;

public class Billing {
    private String addressBilling;
    private String issuer;
    private Date billingDate;
    private  Integer billingId;
    private Double totalAmount;

    public String getAddressBilling() {
        return addressBilling;
    }

    public void setAddressBilling(String addressBilling) {
        this.addressBilling = addressBilling;
    }

    public String getIssuer() {
        return issuer;
    }

    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    public Date getBillingDate() {
        return billingDate;
    }

    public void setBillingDate(Date billingDate) {
        this.billingDate = billingDate;
    }

    public Integer getBillingId() {
        return billingId;
    }

    public void setBillingId(Integer billingId) {
        this.billingId = billingId;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }
}
