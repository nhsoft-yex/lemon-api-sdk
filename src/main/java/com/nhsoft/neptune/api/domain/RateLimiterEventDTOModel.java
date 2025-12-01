package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * RateLimiterEventDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class RateLimiterEventDTOModel extends ApiCloudObject {

    @ApiCloudField(value="events")
    private List<DistributeRateLimiterEventDTOModel> events;
    @ApiCloudField(value="event_type")
    private String eventType;
}
