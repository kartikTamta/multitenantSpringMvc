package com.domain.serviceImpl;

import com.domain.dao.EmployeeDao;

import com.domain.model.Employee;
import com.domain.service.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
public class EmployeeServiceImpl implements EmployeeService {
    
	@Autowired
	private EmployeeDao employeeDAO;
    
    @Override
    @Transactional
    public void save(Employee employee) {
        employeeDAO.save(employee);
    }
    @Override
    @Transactional
    public List<Employee> list() {
        return employeeDAO.list();
    }
}