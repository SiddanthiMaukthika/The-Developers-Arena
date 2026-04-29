public class EmployeeService {
    
}
package com.erp.hr.service;

import com.erp.hr.entity.Employee;
import com.erp.hr.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    private final EmployeeRepository repository;

    public EmployeeService(EmployeeRepository repository) {
        this.repository = repository;
    }

    public Employee createEmployee(Employee employee) {
        return repository.save(employee);
    }

    public List<Employee> getAllEmployees() {
        return repository.findAll();
    }

    public Employee getEmployeeById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Employee not found"));
    }

    public Employee updateEmployee(Long id, Employee updated) {
        Employee emp = getEmployeeById(id);
        emp.setName(updated.getName());
        emp.setEmail(updated.getEmail());
        emp.setDepartment(updated.getDepartment());
        emp.setSalary(updated.getSalary());
        return repository.save(emp);
    }

    public void deleteEmployee(Long id) {
        repository.deleteById(id);
    }
}