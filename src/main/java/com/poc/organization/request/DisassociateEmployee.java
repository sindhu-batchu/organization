package com.poc.organization.request;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class DisassociateEmployee implements Serializable {
    private String empCode;
    private String projCode;
    private String deptCode;
}
