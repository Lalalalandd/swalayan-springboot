package com.example.swalayan.model;

import jakarta.persistence.Id;

public class Shop {

    @Id
    String shopName;
    String address;
    int contactNumb;

    public Shop() {
    }

    public Shop(String shopName, String address, int contactNumb) {
        this.shopName = shopName;
        this.address = address;
        this.contactNumb = contactNumb;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getContactNumb() {
        return contactNumb;
    }

    public void setContactNumb(int contactNumb) {
        this.contactNumb = contactNumb;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "shopName='" + shopName + '\'' +
                ", address='" + address + '\'' +
                ", contactNumb=" + contactNumb +
                '}';
    }
}
