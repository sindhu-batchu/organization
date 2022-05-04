package com.poc.organization.data;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Entity
@Table(name="EMPLOYEE", schema="ORGANIZATION")
public class Employee implements Serializable {
    @Id
    @Column(name="EMPCODE")
    private String empCode;
}
