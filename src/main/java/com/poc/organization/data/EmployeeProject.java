package com.poc.organization.data;

import lombok.Data;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Entity
@Table(name="EMPLOYEE_PROJECT", schema="ORGANIZATION")
public class EmployeeProject implements Serializable  {
    @EmbeddedId
    private EmployeeProjectPk pk;
}
