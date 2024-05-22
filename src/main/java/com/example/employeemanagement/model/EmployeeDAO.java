package com.example.employeemanagement.model;

import com.example.employeemanagement.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    void addEmployee(Employee employee);
    List<Employee> getAllEmployees();
}
