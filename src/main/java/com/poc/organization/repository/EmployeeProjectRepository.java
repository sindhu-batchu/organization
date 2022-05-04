package com.poc.organization.repository;

import com.poc.organization.data.EmployeeProject;
import com.poc.organization.data.EmployeeProjectPk;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeProjectRepository extends JpaRepository<EmployeeProject, EmployeeProjectPk> {

}
