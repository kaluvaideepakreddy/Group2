package com.multiplex.publish.PublishDetails.Validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MovieValidator implements ConstraintValidator<ValidMovie,String> {
    private Pattern pattern;
    private Matcher matcher;
    private static final String MOVIE_PATTERN = "^[_A-Za-z0-9-+]+(.[_A-Za-z0-9-]$)";
    @Override
    public void initialize(ValidMovie constraintAnnotation) {
    }
    @Override
    public boolean isValid(String MovieName, ConstraintValidatorContext context){
        return (validateEmail(MovieName));
    }
    private boolean validateEmail(String MovieName) {
        pattern = Pattern.compile(MOVIE_PATTERN);
        matcher = pattern.matcher(MovieName);
        return matcher.matches();
    }
}