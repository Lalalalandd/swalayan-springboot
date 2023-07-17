package com.example.swalayan.repository;

import com.example.swalayan.model.Employee;
import com.example.swalayan.model.EmployeeDTO;
import com.example.swalayan.response.Response;
import jakarta.annotation.security.RolesAllowed;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.Optional;

@Service
@Transactional

public class EmployeeService {
    @Autowired
    public EmployeeRepository employeeRepository;
    private RestTemplate restTemplate;

    @RolesAllowed({"ROLE_EDITOR", "ROLE_ADMIN"})
    public void deleteEmployee(Long NIP) {
        employeeRepository.deleteById(NIP);
    }

    @RolesAllowed({"ROLE_EDITOR", "ROLE_ADMIN"})
    public String save(EmployeeDTO employeeDTO) {
        try {
            BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
            employeeDTO.setPassword(encoder.encode(employeeDTO.getPassword()));
            ModelMapper modelMapper = new ModelMapper();
            Employee employee = modelMapper.map(employeeDTO, Employee.class);
            employeeRepository.save(employee);
            return "Berhasil tambah data !";
        } catch (Exception e) {
            return e.getMessage();
        }
    }
    @RolesAllowed({"ROLE_EDITOR", "ROLE_ADMIN"})
    public String update(EmployeeDTO employeeDTO) {
        try {
            Optional<Employee> employee = employeeRepository.findById(employeeDTO.getNip());
            if (employee.isEmpty()) {
                return "Maaf employee tidak ditemukan!";
            }

            Employee update_employee = employee.get();
            update_employee.setName(employeeDTO.getName());
            update_employee.setAddress(employeeDTO.getAddress());
            update_employee.setNumber_phone(employeeDTO.getNumber_phone());
            update_employee.setDept_name(employeeDTO.getDept_name());
            update_employee.setPosition(employeeDTO.getPosition());

            if (employeeDTO.getUsername() != null) {
                update_employee.setUsername(employeeDTO.getUsername());
            }
            if (employeeDTO.getPassword() != null) {
                BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
                update_employee.setPassword(encoder.encode(employeeDTO.getPassword()));
            }
            employeeRepository.save(update_employee);
            return "Berhasil update data !";
        } catch (Exception e) {
            return e.getMessage();
        }
    }

    @RolesAllowed({"ROLE_CUSTOMER", "ROLE_ADMIN"})
    public Response findEmployee(Long NIP) {
//        return new Employee();
        Response response = new Response<Employee>();
        try {
            Optional<Employee> employee = employeeRepository.findById(NIP);
            if (!employee.isEmpty()) {
                response.data = employee.get();
                response.message = "Employee ditemukan !";
                return response;
            }
            response.data = null;
            response.message = "Data tidak ditemukan !";
        } catch (Exception e) {
            response.data = null;
            response.message = e.getMessage();
        }
        return response;
    }
    @RolesAllowed({"ROLE_CUSTOMER", "ROLE_ADMIN"})
    public Iterable<Employee> findAll() {
        return employeeRepository.findAll();
    }


}
