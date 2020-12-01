package com.cg.employeeannotationxmlbased.dao;

import java.util.List;

import com.cg.employeeannotationxmlbased.model.Employee;

public interface EmployeeDAO {

	public void addEmployee(Employee employee);
	
	public Employee displayEmployee(int employeeID);
	
	public List<Employee> showAllEmployees();
}
