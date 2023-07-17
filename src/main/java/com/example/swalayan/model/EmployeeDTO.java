package com.example.swalayan.model;

import lombok.Data;

@Data
public class EmployeeDTO {
    public Long nip;
    public String username;
    public String password;
    public String name;
    private String address;
    private String number_phone;
    private String dept_name;
    private String position;
}
