package com.object.typeCasting;

class Base1 {}
class Base2 {}

class Der1 extends Base1{}
class Der2 extends Base1{}

class Der3 extends Base2{}
class Der4 extends Base2{}
 

class Tutorial{
   public static void main(String[] args) {
	   Base2 b = new Der4();
	   /*
	   //01
	   Der4 d = (Der4)b; //Successful object typeCasting
	  */
	   
	   /*
	   //02
	    * there is no relation between Base1 and Base2 => rule 1 only failed
	   Base1 b1 = (Base1) b; //Error : Cannot cast from Base2 to Base1	
	   */
	   
	   //03 //Successful object typeCasting
	   Base2 b2 = (Base2) b;
	  
	   
	   /* //04
	   Object o = (Der3)b;
	   //1st and 2nd rule is accepted
	   //3rd rule ie. during runtime => ClassCast exception error will get (cz, 'd' is not Child or same as 'C')
	   
	   System.out.println(o);
	   */
	   
	   /* Compilation error => cannot convert from Base1 to Base2
	   Base2 b3 = (Base1)b;
	   */
	   
   }
}