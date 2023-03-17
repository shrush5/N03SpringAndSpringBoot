package org.tnsif.usingautowirednotations;

public class Employee {
	private String e_name;
	private float salary;
	public String getE_name() {
		return e_name;
	}
	public void setE_name(String e_name) {
		this.e_name = e_name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public Employee(String e_name, float salary) {
		super();
		System.out.println("Default constructor for employee");
	}
	public void power()
	{
		System.out.println("Employee name is"+e_name);
		System.out.println("Employee salary is"+salary);
	}

}
