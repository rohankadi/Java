package com.rk.ShapeOopProject;

public class ShapeApp {
	public static void main(String[] args) {
		Geometry geometry = new Geometry();
		
		/*
		Shape ref;
		//parent reference to child object
		ref = new Circle();
		geometry.accept(ref);
		*/
		//or
		
		geometry.accept(new Circle());
		geometry.accept(new Square());
		geometry.accept(new Rectangle());
	}
}
