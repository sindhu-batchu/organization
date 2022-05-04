package com.poc.organization.controller;

import com.poc.organization.data.EmployeeProject;
import com.poc.organization.exception.RecordNotFoundException;
import com.poc.organization.request.DisassociateEmployee;
import com.poc.organization.service.EmployeeProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Controller with APIs for connecting to EMPLOYEE_PROJECT table
 */
@RestController
@RequestMapping("/employeeProject")
public class EmployeeProjectController {

    @Autowired
    EmployeeProjectService employeeProjectService;

    @GetMapping("/getEmployeesProjects")
    private ResponseEntity<?> getAllEmployeesProjects() {
        List<EmployeeProject> empProjList = employeeProjectService.findAll();
        if (empProjList.size() == 0) {
            throw new RecordNotFoundException();
        }
        return new ResponseEntity<>(empProjList, HttpStatus.OK);
    }

    @PostMapping("/disassociateEmployee")
    public ResponseEntity<?> disassociateEmployee(@RequestBody DisassociateEmployee disEmp) {
        employeeProjectService.disassociateEmployee(disEmp);
        return new ResponseEntity<>("Employee Disassociated Successfully", HttpStatus.OK);
    }
}
