package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * LocalTime模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class LocalTimeModel extends ApiCloudObject {

    @ApiCloudField(value="hour")
    private Integer hour;
    @ApiCloudField(value="minute")
    private Integer minute;
    @ApiCloudField(value="second")
    private Integer second;
    @ApiCloudField(value="nano")
    private Integer nano;
}
