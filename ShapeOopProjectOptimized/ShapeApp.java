package com.rk.ShapeOopProjectOptimized;

public class ShapeApp {
	public static void main(String[] args) {
		
		Geometry geometry = new Geometry();
		
		/*
		Shape ref;
		ref = new Circle();
		geometry.access(ref);
		*/
		
		//or (Aggregation)
		geometry.access(new Circle());
		geometry.access(new Square());
		geometry.access(new Rectangle());
		
	}
}
