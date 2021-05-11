package com.ibm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class Employee
{
	@Value("Rewanth Sai Simha")
	private String fullname;

	@Autowired
	private Department department;
	

	public String getFullname() {
		return fullname;
	}


	public void setFullname(String fullname) {
		this.fullname = fullname;
	}


	public Department getDepartment() {
		return department;
	}

	public void getDepartment(Department department) {
		this.department=department;
	}


	public void setDepartment(Department department) {
		this.department = department;
	}


	public String getFullName()
	{
		return fullname;
	}


	@Override
	public String toString() {
		return "Employee [fullname=" + fullname + ", department=" + department + "]";
	}


}
