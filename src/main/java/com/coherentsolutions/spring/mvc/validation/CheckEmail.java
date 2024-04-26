package com.coherentsolutions.spring.mvc.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = CheckEmailValidator.class)
public @interface CheckMail {
    public String value() default "coherentsolutions.com";
    public String message() default "email must end with @coherentsolutions.com";

    public Class<?>[] groups() default {};
    public Class<? extends Payload> [] payload() default {};
}
