package com.ibm;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanTest {
   public static void main(String[] args) {
      AbstractApplicationContext context = new ClassPathXmlApplicationContext("application.xml");

      BeanLifeCycleExample obj = (BeanLifeCycleExample) context.getBean("bes");
      obj.getMessage();
      context.registerShutdownHook();
      context.close();
   }
}
