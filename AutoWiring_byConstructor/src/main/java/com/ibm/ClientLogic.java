package com.ibm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class ClientLogic 
{

	public static void main(String[] args)
	{
		/*
		 * Resource res = new ClassPathResource("app.xml"); BeanFactory factory = new
		 * XmlBeanFactory(res);
		 * 
		 * Object o = factory.getBean("id1"); Categories wb = (Categories)o;
		 * 
		 * wb.show();
		 */
		
		ApplicationContext context= new ClassPathXmlApplicationContext("app.xml");
		Categories cat=(Categories) context.getBean("id1");
		cat.show();
		
	    ((ClassPathXmlApplicationContext) context).close();	
	}

}
