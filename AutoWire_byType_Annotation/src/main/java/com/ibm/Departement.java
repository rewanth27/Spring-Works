package com.ibm;

public class Departement 
{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Departement [name=" + name + "]";
	}

}
