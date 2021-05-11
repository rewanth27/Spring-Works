package com.ibm;

import org.springframework.beans.factory.annotation.Value;

public class Department 
{
  @Value("CSE")
  private String name;
  
  public String getName()
  {
	  return name;
  }
  @Override
  public String toString()
  {
	  return "Dept name: "+name;
  }
  
}
