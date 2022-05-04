package com.poc.organization.service;

import com.poc.organization.data.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAll();
    Employee findById(String id);
}
