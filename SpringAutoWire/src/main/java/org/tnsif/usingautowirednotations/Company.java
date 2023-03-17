package org.tnsif.usingautowirednotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Company {
	//DI using setters
	private Employee emp;
@Autowired
@Qualifier("e1")

	public void setEmp(Employee emp) {
		this.emp = emp;
	}

	public Company() {
		System.out.println("Default Constructor for Company");
		
	}
	public void accept()
	{
		emp.power();
	}

}
