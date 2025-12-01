package com.nhsoft.neptune;

import lombok.Data;


/**
 * @auther nhsoft.yex
 */
@Data
public class ApiCloudObject {


    /**
     * 请求开始时间
     */
    private Long startTimestamp;

    /**
     * 请求结束时间
     */
    private Long endTimestamp;
}
