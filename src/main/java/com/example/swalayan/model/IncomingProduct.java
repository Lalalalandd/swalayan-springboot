package com.example.swalayan.model;

import jakarta.persistence.Id;

import java.util.Date;

public class IncomingProduct {

    @Id
    int idIncomingProd;
    int quantity;
    Date date;
    int idProd;

    public IncomingProduct() {
    }

    public IncomingProduct(int idIncomingProd, int quantity, Date date, int idProd) {
        this.idIncomingProd = idIncomingProd;
        this.quantity = quantity;
        this.date = date;
        this.idProd = idProd;
    }

    public int getIdIncomingProd() {
        return idIncomingProd;
    }

    public void setIdIncomingProd(int idIncomingProd) {
        this.idIncomingProd = idIncomingProd;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getIdProd() {
        return idProd;
    }

    public void setIdProd(int idProd) {
        this.idProd = idProd;
    }

    @Override
    public String toString() {
        return "IncomingProduct{" +
                "idIncomingProd=" + idIncomingProd +
                ", idProd=" + idProd +
                '}';
    }
}
