package com.vinsys.app;

import org.apache.wicket.validation.CompoundValidator;
import org.apache.wicket.validation.validator.PatternValidator;

public class UserValidator extends CompoundValidator {
	public UserValidator() {
		// TODO Auto-generated constructor stub
	add(PatternValidator.minimumLength(8));
	}

}
