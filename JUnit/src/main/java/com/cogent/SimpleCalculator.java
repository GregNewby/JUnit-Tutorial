package com.cogent;

public class SimpleCalculator {
	
	CalculatorService service = null;

	public SimpleCalculator(CalculatorService cs) {
		super();
		this.service = cs;
	}

	public int add(int num1, int num2) {
		return num1 + num2;
	}
	
	public int multiplyThenAddNum1(int num1, int num2) {
		return service.multiply(num1, num2) + num1;
	}
}
