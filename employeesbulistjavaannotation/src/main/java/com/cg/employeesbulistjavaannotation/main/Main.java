package com.cg.employeesbulistjavaannotation.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cg.employeesbulistjavaannotation.config.SpringConfig;
import com.cg.employeesbulistjavaannotation.model.SBU;

public class Main {

	public void startApp() {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
		SBU sbu = ctx.getBean(SBU.class);
		System.out.println(sbu);
		
		
	}

}
