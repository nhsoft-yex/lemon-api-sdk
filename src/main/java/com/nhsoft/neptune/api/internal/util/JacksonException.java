//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.nhsoft.neptune.api.internal.util;

public class JacksonException extends RuntimeException {

    public JacksonException(String message) {
        super(message);
    }

    public JacksonException(Throwable cause) {
        super("Json序列化异常", cause);
    }
}
