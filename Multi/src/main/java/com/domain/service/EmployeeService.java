package com.domain.service;

import com.domain.model.Employee;


import java.util.List;

public interface EmployeeService {
    public void save(Employee employee);
    public List<Employee> list();
}