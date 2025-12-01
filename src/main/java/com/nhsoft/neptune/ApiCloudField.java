package com.nhsoft.neptune;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @auther nhsoft.yex
 */
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface ApiCloudField {

    /**
     * 接口描述
     *
     * @return
     */
    String value();

    /**
     * 是否必填
     *
     * @return
     */
    boolean required() default false;

    /**
     * 示例
     *
     * @return
     */
    String example() default "";
}
