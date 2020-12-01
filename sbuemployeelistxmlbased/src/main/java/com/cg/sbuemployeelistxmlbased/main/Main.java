package com.cg.sbuemployeelistxmlbased.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.sbuemployeelistxmlbased.model.Employee;
import com.cg.sbuemployeelistxmlbased.model.SBU;

public class Main {

	public void startApp() {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		SBU sbu = (SBU) context.getBean("sbu");
		List<Employee> employeeList = sbu.getEmployeeList();
		System.out.println("--------SBU Details------");
		System.out.println("sbuCode = "+sbu.getSbuCode()+" sbuHead = "+sbu.getSbuHead()+" sbuName = "+sbu.getSbuName());
		System.out.println("---------Employee Details-----------");
		System.out.println(employeeList);
		
	}
	

}
