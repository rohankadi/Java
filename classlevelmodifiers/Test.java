package com.classlevelmodifiers;

public class Test {
	
	/*
     1) if class is public then we can access it from anywhere(outside or inside package) 
            no restriction at all
     2) if class is default then we can access it inside same package)
         => class Test{}

	 3) if class is abstract => object/instance creation is not possible 
	 		=> abstract class Test {}
	 
	 4) class is not abstract => object/instance creation is possible 
	 
	 5) if class is final => child class creation is not possible
	      => final class Test {}
	 */
	
	/*
	 ****************************** TOP LEVEL CLASSES ************************************
	 *public
	 *default
	 *final
	 *abstract
	 *strictfp => strict floating point
	 *
	 ********************* FOR INNER CLASS ************************
	 => These modifiers are applicable only for inner classes not Top classes
	 *protected
	 *private
	 *static
	 */
	
}
