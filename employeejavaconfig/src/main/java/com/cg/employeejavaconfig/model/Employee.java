package com.cg.employeejavaconfig.model;

import org.springframework.stereotype.Component;

@Component
public class Employee {
	private int employeeId;
	private String employeeName;
	private String salary;
	private String employeeBU;
	private String employeeAge;
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getEmployeeBU() {
		return employeeBU;
	}
	public void setEmployeeBU(String employeeBU) {
		this.employeeBU = employeeBU;
	}
	public String getEmployeeAge() {
		return employeeAge;
	}
	public void setEmployeeAge(String employeeAge) {
		this.employeeAge = employeeAge;
	}
	
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", salary=" + salary
				+ ", employeeBU=" + employeeBU + ", employeeAge=" + employeeAge + "]";
	}
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	
}
