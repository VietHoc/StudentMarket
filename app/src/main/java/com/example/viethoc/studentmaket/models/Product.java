package com.example.viethoc.studentmaket.models;

/**
 * Created by viethoc on 28/01/2018.
 */

public class Product {
    private int productId;
    private String productName;
    private int cost;
    private String address;
    private int userId;
    private int typeId;
    public Product(int productId, String productName, int cost, String address, int userId, int typeId) {
        super();
        this.productId = productId;
        this.productName = productName;
        this.cost = cost;
        this.address = address;
        this.userId = userId;
        this.typeId = typeId;
    }
    public int getProductId() {
        return productId;
    }
    public void setProductId(int productId) {
        this.productId = productId;
    }
    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public int getCost() {
        return cost;
    }
    public void setCost(int cost) {
        this.cost = cost;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public int getUserId() {
        return userId;
    }
    public void setUserId(int userId) {
        this.userId = userId;
    }
    public int getTypeId() {
        return typeId;
    }
    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }
    @Override
    public String toString() {
        return "Product [productId=" + productId + ", productName=" + productName + ", cost=" + cost + ", address="
                + address + ", userId=" + userId + ", typeId=" + typeId + "]";
    }

}
