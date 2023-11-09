package com.method.overloading;

public class AutomatedPromotion_in_OverloadingDemo {
	public static void main(String[] args) {
		
	//object creation
	AutomatedPromotion_in_Overloading a = new AutomatedPromotion_in_Overloading();
	
	a.m1(10); //int-arg type
	a.m1(10.5f); //float-arg type
	System.out.println("===================================");
	
	/*1. ******************** AUTOMATED PROMOTION *******************
	 * Overloading => Same method with different arguments(dataType)
	 *In OVERLOADING
	 below method is 'char' type 
	 but, compiler will not give compilation error directly, 
	 first it promotes the given method argument to next dataType 
	 ie.
	 
	 1. byte=> short => int => float => double 
	 2.		char => int => float => double
	 
	 therefore below arg contains CHAR dataType, that converted to INT first, 
	 then it checks the method again, if int arg method presents output will come
	 otherwise COMPILATION ERROR occurs.
	*/
	
	a.m1('a'); //promoted to => int-arg type
	a.m1(10l); //long promoted to => float-arg type
	System.out.println("===================================");
	
	//a.m1(10.5); //compile time error cz, method with double arg not present and it is not promoted also. 
	}
}
