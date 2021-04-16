package com.calculator.model;

public class CalModelOutput {
	private String operator;
	private double operand1;
	private double operand2;
	private double output;
	public CalModelOutput() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CalModelOutput(String operator, double operand1, double operand2, double output) {
		super();
		this.operator = operator;
		this.operand1 = operand1;
		this.operand2 = operand2;
		this.output = output;
	}
	public String getOperator() {
		return operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}
	public double getOperand1() {
		return operand1;
	}
	public void setOperand1(double operand1) {
		this.operand1 = operand1;
	}
	public double getOperand2() {
		return operand2;
	}
	public void setOperand2(double operand2) {
		this.operand2 = operand2;
	}
	public double getOutput() {
		return output;
	}
	public void setOutput(double output) {
		this.output = output;
	}

}
