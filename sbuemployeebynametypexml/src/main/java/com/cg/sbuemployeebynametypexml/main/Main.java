package com.cg.sbuemployeebynametypexml.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.sbuemployeebynametypexml.model.SBU;

public class Main {

	public void startApp() {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		SBU sbu = (SBU) context.getBean("sbu");
		
		System.out.println(sbu);
		
	}

}
