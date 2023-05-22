package com.example.swalayan.controller;

import com.example.swalayan.model.Employee;
import com.example.swalayan.repository.EmployeeService;
import org.hibernate.annotations.NotFound;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/Employee")
public class EmployeeController {
    private final EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService){
        this.employeeService = employeeService;
    }

    @GetMapping
    public List<Employee> getAllEmployee(){
        return employeeService.findAll();
    }

    @PostMapping
    public Employee addEmploye(@RequestBody Employee employee){
        return employeeService.save(employee);
    }

    @PutMapping("/{NIP}")
    public Employee updateEmployee(@PathVariable Integer NIP, @RequestBody Employee employeeRequest) throws ChangeSetPersister.NotFoundException {
        return employeeService.findById(NIP)
                .map(employee -> {
                    employee.setEmpName(employeeRequest.getEmpName());
                    employee.setSalary(employeeRequest.getSalary());
                    employee.setPhoneNo(employeeRequest.getPhoneNo());
                    employee.setShopName(employeeRequest.getShopName());
                    employee.setPosition(employeeRequest.getPosition());
                    return employeeService.save(employee);
                })
                .orElseThrow(() -> new ChangeSetPersister.NotFoundException());
    }
}
