package com.calculator.service;

import java.lang.Math;

public class CalService {

	// Add
	public double addNumber(double a, double b) {
		return a + b;
	}

	// Sub
	public double subNumber(double a, double b) {
		return a - b;
	}

	// Div
	public double divNumber(double a, double b) {
		return a / b;
	}

	// Mul
	public double mulNumber(double a, double b) {
		return a * b;
	}

	// SQRT
	public double sqrt(double a) {
		return Math.sqrt(a);
	}
	
	// SQUARE
	public double square(double a) {
		return a*a;
	}
	
	// Min
	public double minNumber(double a, double b) {
		return Math.min(a, b);
	}
	
	// Max
	public double maxNumber(double a, double b) {
		return Math.max(a, b);
	}
	
	// Absolute difference
	public double absdiff(double a, double b) {
		double result=a-b;
		return Math.abs(result);
	}

	public String def() {
		return "only these 9 services are applicable";
	}

}