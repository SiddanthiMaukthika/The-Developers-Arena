package com.erp.sales.service;

import com.erp.sales.entity.Customer;
import com.erp.sales.entity.Order;
import com.erp.sales.repository.CustomerRepository;
import com.erp.sales.repository.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalesService {

    private final CustomerRepository customerRepo;
    private final OrderRepository orderRepo;

    public SalesService(CustomerRepository customerRepo, OrderRepository orderRepo) {
        this.customerRepo = customerRepo;
        this.orderRepo = orderRepo;
    }

    // CUSTOMER
    public Customer addCustomer(Customer customer) {
        return customerRepo.save(customer);
    }

    public List<Customer> getAllCustomers() {
        return customerRepo.findAll();
    }

    // ORDER
    public Order createOrder(Order order) {
        return orderRepo.save(order);
    }

    public List<Order> getAllOrders() {
        return orderRepo.findAll();
    }

    public Order updateOrderStatus(Long id, String status) {
        Order order = orderRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Order not found"));
        order.setStatus(status);
        return orderRepo.save(order);
    }
}