package com.erp.reporting.controller;

import com.erp.reporting.dto.DashboardDTO;
import com.erp.reporting.service.ReportService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/reports")
public class ReportController {

    private final ReportService service;

    public ReportController(ReportService service) {
        this.service = service;
    }

    @GetMapping("/dashboard")
    public DashboardDTO dashboard() {
        return service.getDashboardData();
    }
}