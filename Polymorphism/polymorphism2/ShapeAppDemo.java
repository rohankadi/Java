package com.kn.polymorphism2;

public class ShapeAppDemo {

	public static void main(String[] args) {
		// create reference of parent class
		Shape sh;

		Geometry g = new Geometry();
		
		// create object of child class and assign it to parent reference
		sh = new Circle();
		/*
		sh.draw(); // inherited method
		System.out.println("Circle Area = " + sh.calculateArea()); // overridden method
        */
		g.doActivity(sh);
		
		// ERROR :- child specific methods can't be called using Parent reference(ie. sh)
		// System.out.println("Circle Perimeter = " +  sh.calculatePerimeter());
		
		//DownCasting to circle class to call child specific methods
		 System.out.println("Circle Perimeter = " + ((Circle)(sh)).calculatePerimeter());

		 System.out.println("****************************");
		 
		// create object of child class and assign it to parent reference
		//upCasting rectangle to shape
		sh = new Rectangle();
		g.doActivity(sh);
		System.out.println("Rectangle Perimeter = " + ((Rectangle)(sh)).calculatePerimeter());

		System.out.println("****************************");

		// create object of child class and assign it to parent reference
		sh = new Square();
		g.doActivity(sh);
		System.out.println("Square Perimeter = " + ((Square)(sh)).calculatePerimeter());
	}

}
