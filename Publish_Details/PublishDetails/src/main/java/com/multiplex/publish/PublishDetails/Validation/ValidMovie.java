package com.multiplex.publish.PublishDetails.Validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({TYPE,FIELD, ANNOTATION_TYPE})
@Retention(RUNTIME)
@Constraint(validatedBy = MovieValidator.class)
@Documented
public @interface ValidMovie {
    String message() default "Invalid movie";
    Class<?>[] groups() default {};
    Class<?extends Payload> [] payload() default {};
}