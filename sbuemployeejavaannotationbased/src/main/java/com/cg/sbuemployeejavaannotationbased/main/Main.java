package com.cg.sbuemployeejavaannotationbased.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cg.sbuemployeejavaannotationbased.config.SpringConfig;
import com.cg.sbuemployeejavaannotationbased.model.Employee;
import com.cg.sbuemployeejavaannotationbased.model.SBU;

public class Main {
	
	public void starApp() {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
		Employee employee = ctx.getBean(Employee.class);
		employee.setEmployeeId(101);
		employee.setEmployeeName("Harriet");
		employee.setSalary(2000);
		SBU sbu = ctx.getBean(SBU.class);
		sbu.setSbuId(1001);
		sbu.setSbuName("Harry");
		sbu.setSbuHead("Stephen");
		employee.setBusinessUnit(sbu);
		System.out.println(employee);
		
		
	}
	

}
