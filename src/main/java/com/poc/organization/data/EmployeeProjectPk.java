package com.poc.organization.data;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * Dao for composite primary key of EMPLOYEE_PROJECT table
 */
@Embeddable
@Data
public class EmployeeProjectPk implements Serializable {
    @Column(name = "EMPCODE", nullable = false)
    private String empCode;

    @Column(name = "PROJCODE", nullable = false)
    private String projCode;

    @Column(name = "DEPTCODE", nullable = false)
    private String deptCode;
}
