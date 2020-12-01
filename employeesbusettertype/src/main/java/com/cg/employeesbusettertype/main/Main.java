package com.cg.employeesbusettertype.main;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.employeesbusettertype.model.Employee;
import com.cg.employeesbusettertype.model.SBU;

public class Main {

	public void startApp() {
		Scanner sc = new Scanner(System.in);
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		SBU sbu = (SBU) context.getBean("sbu");
		List<Employee> empList = sbu.getEmpList();
		System.out.println("Enter the Id: ");
		int id = sc.nextInt();
		for(Employee e: empList) {
			if(e.getEmployeeId() == id)  {
				System.out.println("Employee ID : "+e.getEmployeeId());
				System.out.println("Employee Name : "+e.getEmployeeName());
				System.out.println("Employee Salary : "+e.getEmployeeSalary());
			}
		}
		
		
	}

}
