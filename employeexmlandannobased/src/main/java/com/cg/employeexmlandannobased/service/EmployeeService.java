package com.cg.employeexmlandannobased.service;

import java.util.List;

import com.cg.employeexmlandannobased.model.Employee;

public interface EmployeeService {
	
	public void addEmployee(Employee employee);
	
	public List<Employee> getEmployeeList();
	
	public void deleteDetails(int id);
	
	public void updateDetails(Employee employee);

}
