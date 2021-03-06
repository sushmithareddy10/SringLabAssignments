package com.cg.employeexmlandannobased.serviceimpl;

import java.util.List;

import com.cg.employeexmlandannobased.dao.EmployeeDAO;
import com.cg.employeexmlandannobased.daoimpl.EmployeeDAOImpl;
import com.cg.employeexmlandannobased.model.Employee;
import com.cg.employeexmlandannobased.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {
	private EmployeeDAO employeeDAO;
	
	public void setEmployeeDAO(EmployeeDAO employeeDAO) {
		this.employeeDAO = employeeDAO;
	}
	@Override
	public void addEmployee(Employee employee) {
		employeeDAO.save(employee);
	}

	@Override
	public List<Employee> getEmployeeList() {
		List<Employee> list = employeeDAO.getDetails();
		return list;
	}

	@Override
	public void deleteDetails(int id) {
		employeeDAO.delete(id);
		
	}

	@Override
	public void updateDetails(Employee employee) {
		employeeDAO.update(employee);
		
	}
	
	

}
