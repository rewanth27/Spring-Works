package com.ibm;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.*;
/*import org.springframework.context.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;*/
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class App
{
	public static void main(String[] args) 
	{
	  Resource resource =new ClassPathResource("app.xml");
	  @SuppressWarnings("deprecation")
	BeanFactory factory=new XmlBeanFactory(resource);
	  
	  Employee employee1=(Employee) factory.getBean("emp1");
	  employee1.display();
		/*
		 * ApplicationContext context=new ClassPathXmlApplicationContext("app.xml");
		 * 
		 * Employee employee=(Employee) context.getBean("emp1");
		 * 
		 * //employee.display(); System.out.println(employee);
		 * 
		 * Address address1=(Address) context.getBean("address");
		 * 
		 * System.out.println(address1);
		 * 
		 * ((ClassPathXmlApplicationContext) context).close();
		 */
	}
}
