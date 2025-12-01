package com.nhsoft.neptune.msg;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @auther nhsoft.yex
 * @description 消息监听器
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface MsgListener {

    /**
     * @return 监听的topic
     */
    String topic();

    /**
     * @return 监听的线程数
     */
    int consumeThreads() default 1;
}
