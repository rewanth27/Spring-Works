package com.ibm;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee 
{
	private String fullname;
	private Department department;

	@Autowired
	public Employee(Department department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [fullname=" + fullname + ", department=" + department + "]";
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

}
