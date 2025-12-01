package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * TransportLineVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class TransportLineVOModel extends ApiCloudObject {

    @ApiCloudField(value="客户名称", example="门店1")
    private String clientName;
    @ApiCloudField(value="客户代码", example="001")
    private String clientCode;
    @ApiCloudField(value="线路名称", example="线路1")
    private String lineName;
    @ApiCloudField(value="线路代码", example="001")
    private String lineCode;
    @ApiCloudField(value="线路顺序", example="1")
    private String lineSequence;
    @ApiCloudField(value="波次", example="波次一")
    private String wavePlan;
}
