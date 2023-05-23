package com.example.swalayan.model;

import jakarta.persistence.Id;

import java.util.Date;

public class Transaction {

    @Id
    int idTrans;
    Date date;
    int totalAmount;
    int NIP;

    public Transaction() {
    }

    public Transaction(int idTrans, Date date, int totalAmount, int NIP) {
        this.idTrans = idTrans;
        this.date = date;
        this.totalAmount = totalAmount;
        this.NIP = NIP;
    }

    public int getIdTrans() {
        return idTrans;
    }

    public void setIdTrans(int idTrans) {
        this.idTrans = idTrans;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(int totalAmount) {
        this.totalAmount = totalAmount;
    }

    public int getNIP() {
        return NIP;
    }

    public void setNIP(int NIP) {
        this.NIP = NIP;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "idTrans=" + idTrans +
                ", NIP=" + NIP +
                '}';
    }
}
