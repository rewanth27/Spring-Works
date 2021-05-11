package com.ibm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
	public static void main(String[] args) 
	{
       ApplicationContext context= new ClassPathXmlApplicationContext("app.xml");
        
        Employee employee=(Employee) context.getBean("emp");
        
        System.out.println(employee);
        System.out.println("");
        
        Address add=(Address) context.getBean("address1");
        System.out.println(add);
        
        ((ClassPathXmlApplicationContext) context).close();	
	}
}