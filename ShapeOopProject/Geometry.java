package com.rk.ShapeOopProject;

public class Geometry {

	public void accept(Shape ref) {
		ref.takeinput();
		ref.calculateArea();
		ref.displayArea();
	}
}
