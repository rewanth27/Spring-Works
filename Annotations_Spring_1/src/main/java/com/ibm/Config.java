package com.ibm;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.PropertySource;

@Configuration
/* @PropertySource("classpath: department.properties") */
public class Config
{
   @Bean("employee")
   public Employee getEmployee()
   {
	   return new Employee();
   }
   
   @Bean
   public Department getDepartment()
   {
	   return new Department();
   }
}
