package com.ibm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context= new ClassPathXmlApplicationContext("app-context.xml");
		Employee emp=(Employee) context.getBean("employee");
		System.out.println(emp);
		
	    ((ClassPathXmlApplicationContext) context).close();	
    }
}
