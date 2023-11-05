package com.kn.polymorphism2;

public class Geometry2 {

	public void doActivity2(Shape sh) {
		sh.draw();
		System.out.println("Area = " + sh.calculateArea());
		
		
		if(sh instanceof Circle) {
			System.out.println("Perimiter of circle = " + ((Circle)(sh)).calculatePerimeter());			
		}else if(sh instanceof Rectangle) {
			System.out.println("Perimiter of rectangle = " + ((Rectangle)(sh)).calculatePerimeter());			
		}else if(sh instanceof Square){
			System.out.println("Perimiter of square = " + ((Square)(sh)).calculatePerimeter());			
		}
		
		System.out.println("=========================");
	}
}
