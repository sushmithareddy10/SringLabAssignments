package com.cg.employeeannotationxmlbased.main;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.employeeannotationxmlbased.model.Employee;
import com.cg.employeeannotationxmlbased.service.EmployeeService;
import com.cg.employeeannotationxmlbased.serviceImpl.EmployeeServivceImpl;



public class Main {
	
	public void starApp() {
			ApplicationContext ctx=new ClassPathXmlApplicationContext("bean.xml");
			EmployeeService employeeService = (EmployeeService) ctx.getBean("employeeServivceImpl");
			startApp(employeeService);

		}
		
		private static void startApp(EmployeeService employeeService) {
			Scanner sc = new Scanner(System.in);
			int choice =0;
			int count=0;
			while(count==0)
			{
				showMenu();
				choice = sc.nextInt();
				switch(choice)
				{
				case 1: 
					System.out.println("Enter employee details as employeeID,employeeName,salary,businessUnit,age");
					String input = sc.next();
					String[] arr = input.split(",");
					Employee employee = new Employee();
					employee.setEmployeeID(Integer.parseInt(arr[0]));
					employee.setEmployeeName(arr[1]);
					employee.setSalary(Double.parseDouble(arr[2]));
					employee.setBusinessUnit(arr[3]);
					employee.setAge(Integer.parseInt(arr[4]));
					employeeService.addEmployee(employee);
					System.out.println("Employee added");
					break;
					
				case 2:
					System.out.println("Enter Employee ID");
					int id = sc.nextInt();
					Employee displayEmployee = employeeService.displayEmployee(id);
					System.out.println(displayEmployee);
					break;
					
				case 3:
					System.out.println(employeeService.showAllEmployees());
					break;
					
				case 4:
					count++;
					break;
					
				default:
					System.out.println("Wrong choice");
				}
			}
			
		}

		private static void showMenu() {
			System.out.println("1. Add Employee");
			System.out.println("2. Display Employee Details");
			System.out.println("3. Display All Employees");
			System.out.println("4. Exit");
			
		}
}