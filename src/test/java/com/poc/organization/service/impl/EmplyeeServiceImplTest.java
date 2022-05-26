package com.poc.organization.service.impl;

import com.poc.organization.data.Employee;
import com.poc.organization.repository.EmployeeRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.*;

import java.util.Optional;

public class EmplyeeServiceImplTest {

    @InjectMocks
    EmployeeServiceImpl employeeServiceImpl;

    @Mock
    EmployeeRepository employeeRepository;

    @Before
    public void init(){
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testEmployeeById() {
        Mockito.when(employeeRepository.findById(ArgumentMatchers.anyString())).thenReturn(getMockEmployee());
        Employee empReturned = employeeServiceImpl.findById(ArgumentMatchers.anyString());
        Assert.assertNotNull(empReturned);
        Assert.assertEquals("E10001", empReturned.getEmpCode());
    }

    @Test
    public void testNotEmployeeById() {
        Mockito.when(employeeRepository.findById(ArgumentMatchers.anyString())).thenReturn(getMockEmployee());
        Employee empReturned = employeeServiceImpl.findById(ArgumentMatchers.anyString());
        Assert.assertNotNull(empReturned);
        Assert.assertNotEquals("E0002", empReturned.getEmpCode());
    }

    Optional<Employee> getMockEmployee() {
        Employee emp = new Employee();
        emp.setEmpCode("E10001");
        return Optional.of(emp);
    }
}
