package com.example.swalayan.model;

import jakarta.persistence.Id;

public class TransactionItems {

    @Id
    int idProd;
    int idTrans;
    int quantity;
    int subTotalAmount;

    public TransactionItems() {
    }

    public TransactionItems(int idProd, int idTrans, int quantity, int subTotalAmount) {
        this.idProd = idProd;
        this.idTrans = idTrans;
        this.quantity = quantity;
        this.subTotalAmount = subTotalAmount;
    }

    public int getIdProd() {
        return idProd;
    }

    public void setIdProd(int idProd) {
        this.idProd = idProd;
    }

    public int getIdTrans() {
        return idTrans;
    }

    public void setIdTrans(int idTrans) {
        this.idTrans = idTrans;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getSubTotalAmount() {
        return subTotalAmount;
    }

    public void setSubTotalAmount(int subTotalAmount) {
        this.subTotalAmount = subTotalAmount;
    }

    @Override
    public String toString() {
        return "TransactionItems{" +
                "idProd=" + idProd +
                ", idTrans=" + idTrans +
                '}';
    }
}
