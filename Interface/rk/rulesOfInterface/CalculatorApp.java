package com.rk.rulesOfInterface;

public class CalculatorApp {
	public static void main(String[] args) {
		MathOperations mathOper = new MathOperations();
		
		mathOper.accept(new SimpleCalculator());
		mathOper.accept(new ScientificCalculator());
	}
}
