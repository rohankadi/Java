package com.kn.polymorphism2;

public class ShapeAppDemo2 {
	public static void main(String[] args) {

		//Shape sh;

		Geometry2 g2 = new Geometry2();
		//01
		/*
		// create object of child class and assign it to parent reference
		sh = new Rectangle();
		g2.doActivity2(sh);

		
		// create object of child class and assign it to parent reference
	    sh = new Circle();
	    g2.doActivity2(sh);


	    // create object of child class and assign it to parent reference
	    sh = new Square();
	    g2.doActivity2(sh);
	    
	    */
		
		//02
		Circle c = new Circle();
		Square s = new Square();
		Rectangle r = new Rectangle();
		
		g2.doActivity2(c);
		g2.doActivity2(s);
		g2.doActivity2(r);
	    
	    
	}
}
