package com.kn.statickeyword;

public class Demo {
 /*
  * Static block and method can access static variables 
  * Static block and method cannot access instance variables  
  * Instance block and method can access Instance variable as well as static variables 
 */
	
	
	//static variables
	static int x;
	static int y;
	static int z;
	
	//static block
	static {
		x = 10;
		y = 20;
		z = 30;
	}
	
	//static method
	 static void display1(){
		 System.out.println(x);
		 System.out.println(y);
		 System.out.println(z);	
	}
	 

	 //instance/non-static variables
	 int a, b, c;
	 
	 //instance/non-static block
	 {
		 a = 8;
		 b = 88;
		 c = 888;
		 x = 9;
		 y = 99; 
		 z = 999;
	 }
	 
	 //instance/non-static method
	 void display2() {
		 System.out.println(a);
		 System.out.println(b);
		 System.out.println(c);
		 System.out.println(x);
		 System.out.println(y);
		 System.out.println(z);
	 }
	 
}
