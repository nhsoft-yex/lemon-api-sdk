package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * DistributeRateLimiterEventDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class DistributeRateLimiterEventDTOModel extends ApiCloudObject {

    @ApiCloudField(value="name")
    private String name;
    @ApiCloudField(value="rate")
    private Integer rate;
    @ApiCloudField(value="rate_interval")
    private Long rateInterval;
    @ApiCloudField(value="expire")
    private Long expire;
}
