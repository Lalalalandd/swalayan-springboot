package com.example.swalayan.model;

import jakarta.persistence.Id;

public class Employee {

    @Id
    int NIP;
    String empName;
    int salary;
    int phoneNo;
    String position;
    String shopName;

    public Employee() {
    }

    public Employee(int NIP, String empName, int salary, int phoneNo, String position, String shopName) {
        this.NIP = NIP;
        this.empName = empName;
        this.salary = salary;
        this.phoneNo = phoneNo;
        this.position = position;
        this.shopName = shopName;
    }

    public int getNIP() {
        return NIP;
    }

    public void setNIP(int NIP) {
        this.NIP = NIP;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(int phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "NIP=" + NIP +
                ", empName='" + empName + '\'' +
                ", phoneNo=" + phoneNo +
                ", shopName='" + shopName + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}
