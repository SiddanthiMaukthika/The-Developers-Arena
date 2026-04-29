package com.erp.reporting.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DashboardDTO {

    private Long totalEmployees;
    private Long totalProducts;
    private Long totalCustomers;

    private Double totalIncome;
    private Double totalExpense;
    private Double balance;
}