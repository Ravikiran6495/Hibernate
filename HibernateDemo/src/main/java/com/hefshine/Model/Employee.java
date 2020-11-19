package com.hefshine.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	
	@Id 
	int reg_number;
	String name;
	String Department;
	
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}


	public Employee(int reg_number, String name, String department) {
		super();
		this.reg_number = reg_number;
		this.name = name;
		Department = department;
	}


	public int getReg_number() {
		return reg_number;
	}


	public void setReg_number(int reg_number) {
		this.reg_number = reg_number;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDepartment() {
		return Department;
	}


	public void setDepartment(String department) {
		Department = department;
	}


	@Override
	public String toString() {
		return "Employee [reg_number=" + reg_number + ", name=" + name + ", Department=" + Department
				+ ", getReg_number()=" + getReg_number() + ", getName()=" + getName() + ", getDepartment()="
				+ getDepartment() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	
	
	

}
