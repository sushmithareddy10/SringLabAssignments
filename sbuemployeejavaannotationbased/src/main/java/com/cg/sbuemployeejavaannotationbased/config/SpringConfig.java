package com.cg.sbuemployeejavaannotationbased.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.cg.sbuemployeejavaannotationbased.model.Employee;
import com.cg.sbuemployeejavaannotationbased.model.SBU;

@Configuration
@ComponentScan("com.cg.sbuemployeejavaannotationbased")
public class SpringConfig {
	
	@Bean
	public Employee employee() {
		return new Employee();
	}
	
	@Bean
	public SBU Sbu() {
		return new SBU();
	}

}
