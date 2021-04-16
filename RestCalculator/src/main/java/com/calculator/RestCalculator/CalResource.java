package com.calculator.RestCalculator;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import com.calculator.model.CalModelInput;
import com.calculator.model.CalModelOutput;
import com.calculator.validator.CalValidator;

@Path("myresource")
public class CalResource {
	CalValidator validate = new CalValidator();

	@POST
	//@Path("*")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public CalModelOutput cal(CalModelInput input) throws Exception {
		return validate.calValidation(input);
	}


}