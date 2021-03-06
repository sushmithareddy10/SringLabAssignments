package com.cg.employeesbuobjectxmlandannotation.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.cg.employeesbuobjectxmlandannotation.model.Employee;

@Repository
public class EmployeeDAO {
	private List<Employee> empList;
	
	public EmployeeDAO() {
		empList = new ArrayList<Employee>();
	}
	
	public void addEmployee(Employee employee) {
		empList.add(employee);
	}
	
	public List<Employee> findAll() {
		return empList;
	}
	
	public void deleteEmployee(int id) {
		empList.remove(id);
	}
	
	public void updateEmployee(int id , String name) {
		for(Employee l: empList) {
			if(l.getEmployeeId()== id) {
				l.setEmployeeName(name);
			}
		}
	}
	
	
}
