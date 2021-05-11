package com.ibm;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

@SuppressWarnings("deprecation")
public class ClientLogic {
    
    public static void main(String[] args)
    {
        Resource res = new ClassPathResource("app.xml");
        BeanFactory factory = new XmlBeanFactory(res);
        
        Object o = factory.getBean("id1");
        Categories wb = (Categories)o;
        
        wb.show();
        
    }

}