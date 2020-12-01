package com.cg.employeeannotationxmlbased.daoImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.cg.employeeannotationxmlbased.dao.EmployeeDAO;
import com.cg.employeeannotationxmlbased.model.Employee;
@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

	List<Employee> employeeRepository;
	
	public EmployeeDAOImpl()
	{
		employeeRepository  = new ArrayList<Employee>();
	}

	@Override
	public void addEmployee(Employee employee) {
		employeeRepository.add(employee);
	}

	@Override
	public Employee displayEmployee(int employeeID) {
		for(Employee e : employeeRepository)
		{
			if(e.getEmployeeID() == employeeID)
			{
				return e;
			}
		}
		return null;
	}

	@Override
	public List<Employee> showAllEmployees() {
		return employeeRepository;
	}


}

