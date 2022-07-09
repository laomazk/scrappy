package com.magic.scrappy.annotation;

import com.magic.scrappy.enums.LimitType;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author mzk
 * @create 2022-07-04 10:56
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface RateLimiter {

    String key() default "rate_limit:";

    int time() default 60;

    int count() default 100;

    LimitType limitType() default LimitType.DEFAULT;
}
