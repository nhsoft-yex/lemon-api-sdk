package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * RequestUpdateStateWmsV2DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class RequestUpdateStateWmsV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="要货单号", example="YH4344010004756", required=true)
    private String requestOrderFid;
    @ApiCloudField(value="波次时间", example="2023-01-01 00:00:00", required=true)
    private String wavesTime;
}
