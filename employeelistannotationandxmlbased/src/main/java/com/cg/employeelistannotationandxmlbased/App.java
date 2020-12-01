package com.cg.employeelistannotationandxmlbased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.employeelistannotationandxmlbased.model.SBU;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");
        SBU sbu = (SBU) ctx.getBean("sbu");
        System.out.println(sbu);
        
    }
}
