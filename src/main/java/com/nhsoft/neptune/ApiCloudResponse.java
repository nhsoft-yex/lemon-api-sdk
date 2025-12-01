package com.nhsoft.neptune;

import java.io.Serializable;

/**
 * @auther nhsoft.yex
 */
public class ApiCloudResponse<T> implements Serializable {

    private Integer code;

    private String msg;

    private T result;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Boolean isSuccess() {
        return code == 0;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }
}
