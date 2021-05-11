package com.ibm;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee
{
	private String fullname;

	@Autowired
	private Departement departement;

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	@Override
	public String toString() {
		return "Employee [fullname=" + fullname + ", departement=" + departement + "]";
	}

	public Departement getDepartement() {
		return departement;
	}

	public void setDepartement(Departement departement) {
		this.departement = departement;
	}


}
