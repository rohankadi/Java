package com.rk.CompositionAndAggregation;

public class CompAggExample {
	public static void main(String[] args) {
		//Enclosing Object
		Mobile mobile = new Mobile();
		//OS is inside the mobile which has composition bonding
		System.out.println(mobile.os.name);
		System.out.println(mobile.os.type);
		
		
		Charger ch = new Charger("XIAOMI", "White");
		mobile.port(ch);
		
		/*
		//if Enclosing object (mobile) is destroyed then we cannot access the Composition Object
		mobile = null;
		System.out.println("Mobile Destroyed");
		System.out.println(mobile.os.name);
		System.out.println(mobile.os.type);
		
		//ERROR :  Cannot read field "os" because "mobile" is null
		 */
		
		/*
		//but, even Enclosing object (mobile) is destroyed, we can access the Aggregation object(Charger)
		
		mobile = null;
		System.out.println(ch.brand);
		System.out.println(ch.color);
		*/
	}
}
