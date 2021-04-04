package com.devsec.research.mvc.ozark.validators;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PrefixValidator implements ConstraintValidator<Prefix, String> {

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		Pattern pattern = Pattern.compile("^(Mr[s\\s]*)$");
		Matcher matcher;
		try {
			
			if ( value == null ) {
	            return true;
	        }
			
			matcher = pattern.matcher(value);
			
			boolean isValid = false;
			String message = value;
			
			if (!matcher.matches()) {
				isValid = false;
				message += "is not the right prefix";
			} else {
				isValid = true;
				message += "is right prefix";
			}
			
			if ( !isValid ) {
				context.disableDefaultConstraintViolation();
				context.buildConstraintViolationWithTemplate(message)
	            .addConstraintViolation();
	        }
			
			return isValid;
			
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public void initialize(Prefix constraintAnnotation) {
	}

}
