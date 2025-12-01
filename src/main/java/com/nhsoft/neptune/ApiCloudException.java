package com.nhsoft.neptune;

import lombok.Data;

/**
 * @auther nhsoft.yex
 */
@Data
public class ApiCloudException extends RuntimeException {

    private int code;

    public ApiCloudException(String message) {
        super(message);
        this.code = 500;
    }

    public ApiCloudException(ApiCloudErrorEnum errorEnum) {
        super(errorEnum.getErrorMsg());
        this.code = errorEnum.getErrorCode();
    }

    public ApiCloudException(int code, String message) {
        super(message);
        this.code = code;
    }
}
