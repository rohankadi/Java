package com.rk.rulesOfInterface;

public class MathOperations {
		//for flexibility
	public void accept(Calculator ref) {
		ref.add();
		ref.sub();
		ref.mul();
		ref.div();
	}
}
