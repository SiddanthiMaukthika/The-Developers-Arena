package com.erp.reporting.service;

import com.erp.reporting.dto.DashboardDTO;
import org.springframework.stereotype.Service;

@Service
public class ReportService {

    public DashboardDTO getDashboardData() {

        // Dummy values (since modules are separated)
        // In real system → fetch from repositories

        DashboardDTO dto = new DashboardDTO();

        dto.setTotalEmployees(50L);
        dto.setTotalProducts(120L);
        dto.setTotalCustomers(75L);

        dto.setTotalIncome(50000.0);
        dto.setTotalExpense(30000.0);
        dto.setBalance(20000.0);

        return dto;
    }
}