package com.example.swalayan.model;

import jakarta.persistence.Id;
import org.springframework.context.annotation.Bean;


public class Product {
    @Id
    int idProd;
    String prodName;
    int price;
    int stock;
    String desc;
    String shopName;

    public Product() {
    }

    public Product(int idProd, String prodName, int price, int stock, String desc, String shopName) {
        this.idProd = idProd;
        this.prodName = prodName;
        this.price = price;
        this.stock = stock;
        this.desc = desc;
        this.shopName = shopName;
    }

    public int getIdProd() {
        return idProd;
    }

    public void setIdProd(int idProd) {
        this.idProd = idProd;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    @Override
    public String toString() {
        return "Product{" +
                "idProd=" + idProd +
                ", prodName='" + prodName + '\'' +
                ", desc='" + desc + '\'' +
                ", shopName='" + shopName + '\'' +
                '}';
    }
}
