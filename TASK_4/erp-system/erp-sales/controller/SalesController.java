package com.erp.sales.controller;

import com.erp.sales.entity.Customer;
import com.erp.sales.entity.Order;
import com.erp.sales.service.SalesService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/sales")
public class SalesController {

    private final SalesService service;

    public SalesController(SalesService service) {
        this.service = service;
    }

    // CUSTOMER APIs
    @PostMapping("/customers")
    public Customer addCustomer(@RequestBody Customer customer) {
        return service.addCustomer(customer);
    }

    @GetMapping("/customers")
    public List<Customer> getCustomers() {
        return service.getAllCustomers();
    }

    // ORDER APIs
    @PostMapping("/orders")
    public Order createOrder(@RequestBody Order order) {
        return service.createOrder(order);
    }

    @GetMapping("/orders")
    public List<Order> getOrders() {
        return service.getAllOrders();
    }

    @PutMapping("/orders/{id}")
    public Order updateStatus(@PathVariable Long id, @RequestParam String status) {
        return service.updateOrderStatus(id, status);
    }
}