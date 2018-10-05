package com.custom.validtor;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Documented
@Constraint(validatedBy=NameValidator.class)
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Validator 
{
	String message() default "Please enter correct name";
	
	Class<?>[] groups() default{};
	
	Class<? extends Payload>[] payload() default{};
	String values() default "RaviKumar | SunilKumar |RameshHamal";

}
