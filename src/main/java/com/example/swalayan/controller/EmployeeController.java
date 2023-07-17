package com.example.swalayan.controller;

import com.example.swalayan.jwt.JwtTokenUtil;
import com.example.swalayan.model.Employee;
import com.example.swalayan.model.EmployeeDTO;
import com.example.swalayan.repository.EmployeeRepository;
import com.example.swalayan.repository.EmployeeService;
import com.example.swalayan.response.Response;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.ws.rs.core.Context;
import jakarta.ws.rs.core.HttpHeaders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("api/employee")
public class EmployeeController {

    private final EmployeeService employeeService;
    @Autowired
    public EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeController(EmployeeService employeeService){
        this.employeeService = employeeService;
    }


    @GetMapping
    public Iterable<Employee> findAllEmployee(){
        return employeeService.findAll();
    }

    @GetMapping("/{nip}")
    public Response findEmployee(@PathVariable("nip") Long nip){
        return employeeService.findEmployee(nip);
    }

    @PostMapping
    public String addEmployee(@RequestBody EmployeeDTO employeeDTO){
        return employeeService.save(employeeDTO);
    }

    @PutMapping
    public String updateEmployee(@RequestBody EmployeeDTO employeeDTO){
        return employeeService.update(employeeDTO);
    }

    @DeleteMapping("/{NIP}")
    public void deleteEmployee(@PathVariable("NIP")Long NIP){
        employeeService.deleteEmployee(NIP);
    }
}
