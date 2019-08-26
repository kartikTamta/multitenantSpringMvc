package com.domain.dao;

import java.util.List;

import com.domain.model.Employee;

public interface EmployeeDao {

	public void save(Employee employee);
    public List<Employee> list();
}
