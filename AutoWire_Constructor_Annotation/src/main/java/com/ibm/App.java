package com.ibm;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("bean.xml");
    	Employee emp=(Employee)context.getBean("employee");
    	
    	System.out.println(emp);
    	
    	System.out.println("This is the dept name of "+emp.getFullname()+" : "+emp.getDepartment().getDeptname());
    	((ClassPathXmlApplicationContext) context).close();
    }
}
