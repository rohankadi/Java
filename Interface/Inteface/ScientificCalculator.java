package com.rk.Inteface;

import com.inteface.Calculator;

public class ScientificCalculator extends RohanCalculator implements Calculator {

	@Override
	public int modulus(int firstNumber, int secondNumber) {
		if (secondNumber == 0) {
			System.out.println("Idiot number cannot be divided by 0");
			return -1;
		} else {
			return firstNumber % secondNumber;
		}
	}

	@Override
	public int multiplication(int firstNumber, int secondNumber) {
		return firstNumber * secondNumber;
	}

	@Override
	public int square(int number) {
		if (number == 0 || number == 1) {
			System.out.println("Ahahha... for this you need calculator..?");
		} else {
			return number * number;
		}
		return 0;
	}
}
