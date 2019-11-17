package com.vinsys.app;

import org.apache.wicket.validation.IValidatable;
import org.apache.wicket.validation.IValidator;
import org.apache.wicket.validation.ValidationError;

public class UserNameValidator implements IValidator<String> {

	@Override
	public void validate(IValidatable<String> validatable) {
		System.out.println("error");
ValidationError error= new ValidationError();
error.setMessage("error is error");
validatable.error(error);
	}

}
