package org.tnsif.diintheformofobject;


public class Charger {

	Charger charger;

	//DI using setters
	public void setCharger(Charger charger) {
		this.charger = charger;
	}
	
	//injecting the object of Charger class
	public void accept()
	{
		charger.power();
	}
}
