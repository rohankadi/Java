package com.rk.CompositionAndAggregation;

public class Mobile {
	//Composition always present inside the Enclosing object (OS is always inside Mobile only)
	OS os = new OS("Android", 32);
	
	//Aggregation is always outside of Enclosing object (Charger is always outside mobile only,
	//but, we have a port which connect each other
	
	public void port(Charger ref) {
		System.out.println("Charger " + ref.brand);
		System.out.println(ref.color + " is given to Mobile");
	}
	
	
}
