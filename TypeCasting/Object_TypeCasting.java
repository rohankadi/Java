package com.object.typeCasting;

public class Object_TypeCasting {

	public static void main(String[] args) {
		
		/*
		 ************* OBJECT TYPE CASTING ***************
		 => It is have 03-Basic rules
		 
		 1) COMPILE TIME CHECKING - I
		  => TYPE-CASTING check
		 * ex:
		 * Object o = new String("durga");
		 * StringBuffer sb = (StringBuffer) o;
		 *    A          b =   ( C ) d ;
		 *    
		 *    The type 'C' and 'd' must have some relationship 
		 *    
		 *    'd' is parent of 'C',
		 *    'C' is parent of 'd',
		 *    'd' and 'C' both same;
		 *    
		 2) COMPILE TIME CHECKING - II  
		  => ASSIGNMENT check 
		 * ex:   
		 * StringBuffer sb = (StringBuffer) o;
		 *    A          b =   ( C )        d ;
		 *    
		 *    'C' = 'A';
		 *    'C' child of 'A'
		 *  
		 * ===> These 02 checking is taken care by 'COMPILER'
		 *  
		 3) RUNTIME TIME CHECKING    
		 =>  RUNTIME OBJECT
		 *  
		 *  'd' child of 'C'
		 *  'd' = 'C'
		 *  
		 * ===> This 01 checking is taken care by 'JVM'
		 *  Otherwise we will get runtime exception saying :=> ClassCast Exception
		 * */
		
	     /*//01
	    //java.lang.String cannot be cast to class java.lang.StringBuffer
	  
	    Object o = new String("durga");
	
	    StringBuffer sb = (StringBuffer) o;

	    System.out.println(sb);
	    */
	
	   /* 
	     //02 Cannot cast from String to StringBuffer
		   String s = new String("durga");
		
		   StringBuffer sb = (StringBuffer) s;
	    */	
	
	 //03 
	
	Object o = new String("durga");
	String s = (String) o;
	
	System.out.println(s);
		
		
		
	}
}
