package com.productDetails.domain;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {
    @Id
    private int productId;
    private String productName;
    private String productInformation;
    private String productDescription;
    private float productPrice;

    public Product() {
    }

    public Product(int productId, String productName, String productInformation, String productDescription, float productPrice) {
        this.productId = productId;
        this.productName = productName;
        this.productInformation = productInformation;
        this.productDescription = productDescription;
        this.productPrice = productPrice;
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

    public String getProductInformation() {
        return productInformation;
    }

    public void setProductInformation(String productInformation) {
        this.productInformation = productInformation;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public float getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(float productPrice) {
        this.productPrice = productPrice;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", productInformation='" + productInformation + '\'' +
                ", productDescription='" + productDescription + '\'' +
                ", productPrice=" + productPrice +
                '}';
    }
}
