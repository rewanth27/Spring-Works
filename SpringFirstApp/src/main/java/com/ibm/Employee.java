package com.ibm;

public class Employee
{
	private int id;  
	private String name;  
	private Address address;//Aggregation  
	  
	  
	public Employee(int id, String name, Address address) 
	{    
	    this.id = id;  
	    this.name = name;  
	    this.address = address;  
	}  
	  
	public void display()
	{  
	    System.out.println("Details of Employee: "+id+" "+name);  
	    System.out.println(address);  
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + "]";
	}  
	
	
}
