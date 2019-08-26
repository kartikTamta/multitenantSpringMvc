package com.domain.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.domain.dao.EmployeeDao;
import com.domain.model.Employee;

@Component
public class EmployeeDAOImpl implements EmployeeDao {
	
	    @Autowired
	    SessionFactory sessionFactory;
	    
	    @Override
	    public void save(Employee employee) {
	        sessionFactory.getCurrentSession().save(employee);
	    }
	    @Override
	    public List<Employee> list() {
	        return sessionFactory.getCurrentSession().createCriteria(Employee.class).list();

}
}