package com.custom.validtor;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class NameValidator implements ConstraintValidator<Validator, String>
{

private	String listOfNames;

	@Override
	public boolean isValid(String studentName, ConstraintValidatorContext arg1) {
		/*if(studentName.matches("ravi|rama|sita"))
		{
			return true;
		}*/
		if(studentName.matches(listOfNames))
		{
			return true;
		}
		return false;
	}

	@Override
	public void initialize(Validator validator) {
		this.listOfNames=validator.message();
		
	}

}
