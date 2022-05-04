package com.poc.organization.controller;

import com.poc.organization.data.Employee;
import com.poc.organization.exception.RecordNotFoundException;
import com.poc.organization.service.impl.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Controller with APIs for connecting to EMPLOYEE table
 */
@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    EmployeeServiceImpl employeeService;

    @GetMapping("/getEmployees")
    private ResponseEntity<?> getAllEmployees() {
        List<Employee> empList = employeeService.findAll();
        if (empList.size() == 0) {
            throw new RecordNotFoundException();
        }
        return new ResponseEntity<>(empList, HttpStatus.OK);
    }

    @GetMapping("/getEmployee/{id}")
    public ResponseEntity<?> getEmployee(@PathVariable String id) {
        Employee emp = employeeService.findById(id);
        if(ObjectUtils.isEmpty(emp.getEmpCode())) {
            throw new RecordNotFoundException();
        }
        return new ResponseEntity<>(emp, HttpStatus.OK);
    }
}
