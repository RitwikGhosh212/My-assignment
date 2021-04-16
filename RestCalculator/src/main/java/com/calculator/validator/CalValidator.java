package com.calculator.validator;

import com.calculator.model.CalModelInput;
import com.calculator.model.CalModelOutput;
import com.calculator.service.CalService;

public class CalValidator {
	public CalModelOutput calValidation(CalModelInput input) {
		CalService service = new CalService();
		CalModelOutput output=new CalModelOutput();
		switch (input.getOperator()) {
		case "SUM":
			output.setOperator(input.getOperator());
			output.setOperand1(input.getOperand1());
			output.setOperand2(input.getOperand2());
			output.setOutput(service.addNumber(input.getOperand1(),input.getOperand2()));
			break;
		case "SUBTRACT":
			output.setOperator(input.getOperator());
			output.setOperand1(input.getOperand1());
			output.setOperand2(input.getOperand2());
			output.setOutput(service.subNumber(input.getOperand1(),input.getOperand2()));
			break;
		case "DIVIDE":
			output.setOperator(input.getOperator());
			output.setOperand1(input.getOperand1());
			output.setOperand2(input.getOperand2());
			output.setOutput(service.divNumber(input.getOperand1(),input.getOperand2()));
			break;
		case "MULTIPLY":
			output.setOperator(input.getOperator());
			output.setOperand1(input.getOperand1());
			output.setOperand2(input.getOperand2());
			output.setOutput(service.mulNumber(input.getOperand1(),input.getOperand2()));
			break;
		case "ROOT":
			output.setOperator(input.getOperator());
			output.setOperand1(input.getOperand1());
			output.setOutput(service.sqrt(input.getOperand1()));
			break;
		case "SQUARE":
			output.setOperator(input.getOperator());
			output.setOperand1(input.getOperand1());
			output.setOutput(service.square(input.getOperand1()));
			break;
		case "MIN":
			output.setOperator(input.getOperator());
			output.setOperand1(input.getOperand1());
			output.setOperand2(input.getOperand2());
			output.setOutput(service.minNumber(input.getOperand1(),input.getOperand2()));
			break;
		case "MAX":
			output.setOperator(input.getOperator());
			output.setOperand1(input.getOperand1());
			output.setOperand2(input.getOperand2());
			output.setOutput(service.maxNumber(input.getOperand1(),input.getOperand2()));
			break;
		case "ABSOLUTE_DIFFERENCE":
			output.setOperator(input.getOperator());
			output.setOperand1(input.getOperand1());
			output.setOperand2(input.getOperand2());
			output.setOutput(service.absdiff(input.getOperand1(),input.getOperand2()));
			break;
		default:
			//outputString = service.def();
			break;
		}
		return output;
	}
}
