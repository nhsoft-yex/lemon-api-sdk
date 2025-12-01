package com.nhsoft.neptune;

import lombok.Getter;

/**
 * @author: xin.ye
 * @description:
 * @Date: 2025/11/6 20:25
 */
@Getter
public enum ApiCloudErrorEnum {
    TOKEN_INVALID(401, "token失效，请检查token！"),
    API_UNAUTHORIZED(400, "接口未授权，请联系管理员！"),
    API_TIME_OUT(504, "接口请求超时！"),
    SERVICE_UNAVAILABLE(503, "乐檬开放平台服务暂不可用，请联系管理员！"),
    TOO_MANY_REQUESTS(429, "请求次数过多，请稍后再试！");
    private final int errorCode;

    private final String errorMsg;

    ApiCloudErrorEnum(int errorCode, String errorMsg) {
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }
}
