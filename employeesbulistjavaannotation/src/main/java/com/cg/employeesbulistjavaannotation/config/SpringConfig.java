package com.cg.employeesbulistjavaannotation.config;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.cg.employeesbulistjavaannotation.model.Employee;

@Configuration
@ComponentScan("com.cg.employeesbulistjavaannotation")
public class SpringConfig {
	
	@Bean(name = "empList")
	public ArrayList<Employee> getEmpList() {
		Employee employee1 = new Employee(101,"Sush",3000.0);
		Employee employee2 = new Employee(102,"Aishu",40000.0);
		ArrayList<Employee> empList = new ArrayList<>();
		empList.add(employee1);
		empList.add(employee2);
		return empList;
		
	}

}
