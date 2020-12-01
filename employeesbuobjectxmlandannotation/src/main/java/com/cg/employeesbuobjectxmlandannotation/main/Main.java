package com.cg.employeesbuobjectxmlandannotation.main;

import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.employeesbuobjectxmlandannotation.model.Employee;
import com.cg.employeesbuobjectxmlandannotation.model.SBU;
import com.cg.employeesbuobjectxmlandannotation.service.EmployeeService;

public class Main {

	public void startApp() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");
		EmployeeService employeeService = ctx.getBean(EmployeeService.class);
		start(employeeService);
		
		
	}

	private void start(EmployeeService employeeService) {
		Scanner sc = new Scanner(System.in);
		String menuChoice="Yes";
		do {
			System.out.println("1. Add Employee");
			System.out.println("2. View Employee");
			System.out.println("3. Delete Employee");
			System.out.println("4. Update Employee");
			int choice = sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter the employee Id: ");
				int empId = sc.nextInt(); sc.nextLine();
				System.out.println("Enter the employee name: ");
				String empName= sc.next();
				System.out.println("Enter the employee salary: ");
				double salary = sc.nextDouble();
				System.out.println("Enter the SBU Id: ");
				int sbuId = sc.nextInt(); sc.nextLine();
				System.out.println("Enter the SBU Name: ");
				String sbuName = sc.next(); sc.nextLine();
				System.out.println("Enter the SBU Head: ");
				String sbuHead = sc.next();
				SBU sbu = new SBU(sbuId, sbuName,sbuHead);
				Employee employee = new Employee(empId, empName, salary,sbu);
				employeeService.add(employee);
				break;
			case 2:
				ArrayList<Employee> list = (ArrayList<Employee>) employeeService.find();
				System.out.println(list);
				break;
			case 3:
				System.out.println("Enter the employee id: ");
				int id = sc.nextInt();	
				employeeService.delete(id);
				break;
			case 4:
			  System.out.println("Enter the employee id to update: ");
			  int updateId = sc.nextInt(); sc.nextLine();
			  System.out.println("Enter the employee name: ");
			  String name = sc.next();
			employeeService.update(updateId, name);
				
			}
			
		}while(menuChoice.equalsIgnoreCase("Yes"));
		
	}

}
