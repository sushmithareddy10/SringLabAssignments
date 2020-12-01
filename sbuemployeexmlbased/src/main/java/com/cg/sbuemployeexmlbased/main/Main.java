package com.cg.sbuemployeexmlbased.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

import com.cg.sbuemployeexmlbased.model.Employee;
import com.cg.sbuemployeexmlbased.model.SBU;

public class Main {

	public void stratApp() {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		Employee employee = (Employee) context.getBean("employee");
		System.out.println("-----Employee Details-----");
		System.out.println(employee);
		
	}

}
