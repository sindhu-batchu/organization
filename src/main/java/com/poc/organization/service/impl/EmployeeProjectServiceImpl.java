package com.poc.organization.service.impl;

import com.poc.organization.data.EmployeeProject;
import com.poc.organization.data.EmployeeProjectPk;
import com.poc.organization.repository.EmployeeProjectRepository;
import com.poc.organization.request.DisassociateEmployee;
import com.poc.organization.service.EmployeeProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class EmployeeProjectServiceImpl implements EmployeeProjectService {
    @Autowired
    EmployeeProjectRepository employeeProjectRepository;

    public List<EmployeeProject> findAll() {
        return employeeProjectRepository.findAll();
    }

    @Transactional(Transactional.TxType.REQUIRED)
    public void disassociateEmployee(DisassociateEmployee disEmp) {
        EmployeeProjectPk employeeProjectPk = new EmployeeProjectPk();
        employeeProjectPk.setEmpCode(disEmp.getEmpCode());
        employeeProjectPk.setProjCode(disEmp.getProjCode());
        employeeProjectPk.setDeptCode(disEmp.getDeptCode());
        employeeProjectRepository.deleteById(employeeProjectPk);
    }
}
