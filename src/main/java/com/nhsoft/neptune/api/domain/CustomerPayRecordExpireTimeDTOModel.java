package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * CustomerPayRecordExpireTimeDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CustomerPayRecordExpireTimeDTOModel extends ApiCloudObject {

    @ApiCloudField(value="customer_id", example="9965800000126", required=true)
    private Long customerId;
    @ApiCloudField(value="start_time", required=true)
    private String startTime;
    @ApiCloudField(value="operator", example="admin", required=true)
    private String operator;
}
