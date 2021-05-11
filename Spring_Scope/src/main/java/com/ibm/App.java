package com.ibm;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("app.xml");
        Employee emp1=(Employee) context.getBean("emp");
        emp1.setName("Rewanth");
        emp1.setSalary(23457);
        
        Employee emp2=(Employee) context.getBean("emp");
        emp1.setName("Rewanth Sai");
        emp1.setSalary(234578);
        
        Employee emp3=(Employee) context.getBean("emp");
        emp1.setName("Rewanth Sai Simha");
        emp1.setSalary(2345790);
        
        System.out.println(emp1+"\n"+emp2+"\n"+emp3);
        
        ((ClassPathXmlApplicationContext) context).close();
    }
}
