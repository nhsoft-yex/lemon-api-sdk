package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PayablePlanRequestDTO模型
 * 应收单/应付单计划
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PayablePlanRequestDTOModel extends ApiCloudObject {

    @ApiCloudField(value="应付金额", example="20.0", required=true)
    private BigDecimal amount;
    @ApiCloudField(value="截止时间", example="2022-01-01 10:00:00", required=true)
    private String deadline;
}
