package org.tnsif.springmvc;

import org.springframework.stereotype.Component;

@Component
public class Employee {
	//private data members

	private int empid;
	private String empname;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	
	public void print()
	{
		System.out.println("Employees are belong to IT Department");
		System.out.println("Emp ID: "+empid+" "+"Employee Name: "+empname);
	}
	

}
