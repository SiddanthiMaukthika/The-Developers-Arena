package com.erp.accounting.service;

import com.erp.accounting.entity.Transaction;
import com.erp.accounting.repository.TransactionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountingService {

    private final TransactionRepository repository;

    public AccountingService(TransactionRepository repository) {
        this.repository = repository;
    }

    public Transaction addTransaction(Transaction transaction) {
        return repository.save(transaction);
    }

    public List<Transaction> getAllTransactions() {
        return repository.findAll();
    }

    public Double getTotalIncome() {
        return repository.findAll().stream()
                .filter(t -> "INCOME".equalsIgnoreCase(t.getType()))
                .mapToDouble(Transaction::getAmount)
                .sum();
    }

    public Double getTotalExpense() {
        return repository.findAll().stream()
                .filter(t -> "EXPENSE".equalsIgnoreCase(t.getType()))
                .mapToDouble(Transaction::getAmount)
                .sum();
    }

    public Double getBalance() {
        return getTotalIncome() - getTotalExpense();
    }
}