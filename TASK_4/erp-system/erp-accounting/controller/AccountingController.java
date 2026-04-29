package com.erp.accounting.controller;

import com.erp.accounting.entity.Transaction;
import com.erp.accounting.service.AccountingService;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/accounting")
public class AccountingController {

    private final AccountingService service;

    public AccountingController(AccountingService service) {
        this.service = service;
    }

    @PostMapping("/transactions")
    public Transaction add(@RequestBody Transaction transaction) {
        return service.addTransaction(transaction);
    }

    @GetMapping("/transactions")
    public List<Transaction> getAll() {
        return service.getAllTransactions();
    }

    @GetMapping("/summary")
    public Map<String, Double> getSummary() {

        Map<String, Double> summary = new HashMap<>();

        summary.put("totalIncome", service.getTotalIncome());
        summary.put("totalExpense", service.getTotalExpense());
        summary.put("balance", service.getBalance());

        return summary;
    }
}