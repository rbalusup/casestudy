package com.myretail.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myretail.dao.EmployeeDao;
import com.myretail.entity.Employee;
import com.myretail.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired 
	private EmployeeDao employeeDAO;

	/**
	* Default Constructor
	*/
	public EmployeeServiceImpl() {
	super(); 
	}

	@Override 
	public Employee createEmployee(Employee employee) { 
	return employeeDAO.createEmployee(employee);
	}

	@Override 
	public Employee getEmployee(int id) { 
	return employeeDAO.getEmployee(id);
	}

	@Override 
	public Employee updateEmployee(Employee employee) { 
	return employeeDAO.updateEmployee(employee);
	}

	@Override 
	public void deleteEmployee(int id) { 
	employeeDAO.deleteEmployee(id);
	}

	@Override 
	public List<Employee> getAllEmployees() { 
	return employeeDAO.getAllEmployees();
	}
}