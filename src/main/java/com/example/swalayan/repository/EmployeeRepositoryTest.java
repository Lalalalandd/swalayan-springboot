package com.example.swalayan.repository;

import com.example.swalayan.model.Employee;
import com.example.swalayan.model.Role;
import jakarta.transaction.Transactional;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(false)
public class EmployeeRepositoryTest {
    @Autowired
    public EmployeeRepository employeeRepository;

    @Test
    public void createTestUser(){
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String password = passwordEncoder.encode("MencobaTest!");
        Employee newEmployee = new Employee("test123", password);
        Employee savedEmployee = employeeRepository.save(newEmployee);
        assertNotNull(savedEmployee);
        assertTrue(savedEmployee.getNip() > 0);

    }

    @Test
    public void testAssignRoleToUser() {
        Integer nip = 2;
        Employee employee = employeeRepository.findById(nip.longValue()).get();
        employee.addRole(new Role(1));
        employee.addRole(new Role(2));


        Employee updatedEmployee = employeeRepository.save(employee);
        assertTrue(updatedEmployee.getRoles().size() == 2);

    }

}
