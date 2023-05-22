package com.example.swalayan.repository;

import com.example.swalayan.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeService extends JpaRepository<Employee, Integer> {

}
