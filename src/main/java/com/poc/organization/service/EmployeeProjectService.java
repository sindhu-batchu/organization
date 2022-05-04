package com.poc.organization.service;

import com.poc.organization.data.EmployeeProject;
import com.poc.organization.request.DisassociateEmployee;

import java.util.List;

public interface EmployeeProjectService {
    List<EmployeeProject> findAll();
    void disassociateEmployee(DisassociateEmployee disEmp);
}
