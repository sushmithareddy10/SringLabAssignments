package com.cg.sbuemployeexmlbased.model;

public class Employee {
	private int employeeId;
	private String employeeName;
	private double salary;
	private SBU businessUnit;
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
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public SBU getBusinessUnit() {
		return businessUnit;
	}
	public void setBusinessUnit(SBU businessUnit) {
		this.businessUnit = businessUnit;
	}
	
	public SBU getSbuDetails() {
		return businessUnit;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", salary=" + salary
				+"\n"+getSbuDetails()+ "]";
	}
	
	
	

}
