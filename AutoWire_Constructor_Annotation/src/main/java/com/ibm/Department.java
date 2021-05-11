package com.ibm;

import org.springframework.beans.factory.annotation.Value;

public class Department
{
	@Value("Computer Science Engineering")
	private String deptname;

	public String getDeptname() {
		return deptname;
	}

	/*
	 * public void setDeptname(String deptname) { this.deptname = deptname; }
	 */

	@Override
	public String toString() {
		return "Department [deptname=" + deptname + "]";
	}

}
