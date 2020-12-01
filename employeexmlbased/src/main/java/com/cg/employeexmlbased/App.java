package com.cg.employeexmlbased;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

import com.cg.employeexmlbased.model.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	FileSystemResource resource = new FileSystemResource("bean.xml");
    	BeanFactory beanFactory = new XmlBeanFactory(resource);
    	Employee employee = (Employee) beanFactory.getBean("employee");
    	System.out.println("Employee Id : "+employee.getEmployeeId());
    	System.out.println("Employee Name : "+employee.getEmployeeName());
    	System.out.println("Employee Salary : "+employee.getSalary());
    	System.out.println("Employee BU : "+employee.getBusinessUnit());
    	System.out.println("Employee Age : "+employee.getAge());
    }
}
