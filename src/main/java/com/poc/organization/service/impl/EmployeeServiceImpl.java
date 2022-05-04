package com.poc.organization.service.impl;

import com.poc.organization.data.Employee;
import com.poc.organization.repository.EmployeeRepository;
import com.poc.organization.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    @Transactional(Transactional.TxType.SUPPORTS)
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Transactional(Transactional.TxType.SUPPORTS)
    public Employee findById(String id) {
        return employeeRepository.findById(id).orElse(new Employee());
    }
}
