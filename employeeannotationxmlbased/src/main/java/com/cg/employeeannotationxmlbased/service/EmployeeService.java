package com.cg.employeeannotationxmlbased.service;

import java.util.List;

import com.cg.employeeannotationxmlbased.model.Employee;

public interface EmployeeService {
	

	public void addEmployee(Employee employee);
	
	public Employee displayEmployee(int employeeID);
	
	public List<Employee> showAllEmployees();
	
}