package com.rk.SuperAndFinal;

//if GoldenEagle is given as final then not possible to inherit by any class
public final class GoldenEagle extends Eagle{

	@Override
	void fly() {
		System.out.println("Golden Eagle can fly very very high......");
	}
	
	/*
	          We are declared Eagle class method eat() as final so,  
	//ERROR : Cannot override the final method from Eagle
	          
	@Override
	 void eat() {
		System.out.println("Eagle eats........");
	}
	*/
}
