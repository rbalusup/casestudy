package com.myretail.dao;

import java.util.List;

import com.myretail.entity.Employee;

public interface  EmployeeDao {
	public Employee createEmployee(Employee employee);

	
	public Employee getEmployee(int id);

	public Employee updateEmployee(Employee employee);

	public void deleteEmployee(int id);

	public List<Employee> getAllEmployees();
}