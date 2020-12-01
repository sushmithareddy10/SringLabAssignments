package com.cg.employeejavaconfig.SpringConfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.cg.employeejavaconfig.model.Employee;

@Configuration
@ComponentScan("com.cg.employeejavaconfig")
public class SpringConfig {
	
	public Employee employee() {
		return new Employee();
	}

}
