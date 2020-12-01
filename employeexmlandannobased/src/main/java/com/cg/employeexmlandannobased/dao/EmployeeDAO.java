package com.cg.employeexmlandannobased.dao;

import java.util.List;

import com.cg.employeexmlandannobased.model.Employee;

public interface EmployeeDAO {
	
	public void save(Employee employee);
	
	public List<Employee> getDetails();
	
	public void delete(int id);
	
	public void update(Employee employee);
	

}
