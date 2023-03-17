package org.tnsif.literals;

public class BMWEngine  implements IEngine{
	private String company;
	private double cost;
	
	public double cost()
	{
		
		return cost;
	}
	public String display() 
	{
	
		return "Itely";
		}
	
	//getters and setters
	public String getCompany() 
	{
		return company;
	}
	
	public void setCompany(String company)
	{
		this.company = company;
	}
	
	public double getCost() 
	{
		return cost;
	}
	public void setCost(double cost) 
	{
		this.cost = cost;
	}
	
	//tostring
	@Override
	public String toString() {
		return "origin of company:" + company +"   "+fuel;
	}
	//constructor
	public BMWEngine(String company, double cost) {
		super();
		this.company = company;
		this.cost = cost;
	}
	

}