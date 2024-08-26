package com.variables.variables01.proyecto1;

public class Product {
    private String productName;
    private Integer productAmount;
    private Integer productId;
    private Boolean isImported;
    private Boolean isLocalProduct;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getProductAmount() {
        return productAmount;
    }

    public void setProductAmount(Integer productAmount) {
        this.productAmount = productAmount;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Boolean getImported() {
        return isImported;
    }

    public void setImported(Boolean imported) {
        isImported = imported;
    }

    public Boolean getLocalProduct() {
        return isLocalProduct;
    }

    public void setLocalProduct(Boolean localProduct) {
        isLocalProduct = localProduct;
    }
}
