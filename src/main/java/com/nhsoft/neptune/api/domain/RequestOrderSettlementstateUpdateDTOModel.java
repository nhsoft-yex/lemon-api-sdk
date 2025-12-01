package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * RequestOrderSettlementstateUpdateDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class RequestOrderSettlementstateUpdateDTOModel extends ApiCloudObject {

    @ApiCloudField(value="要货单号", example="YH4344010004311", required=true)
    private String requestOrderFid;
    @ApiCloudField(value="结算方式（0-待结算，2-已结算）", example="0", required=true)
    private Integer settlementState;
    @ApiCloudField(value="操作人", example="管理员")
    private String operator;
}
