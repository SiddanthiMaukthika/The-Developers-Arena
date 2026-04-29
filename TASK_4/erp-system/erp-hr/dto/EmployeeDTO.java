package com.erp.hr.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDTO {

    private String name;
    private String email;
    private String department;
    private Double salary;
}