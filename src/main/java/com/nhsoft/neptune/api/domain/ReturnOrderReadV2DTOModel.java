package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ReturnOrderReadV2DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ReturnOrderReadV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="退货订单号", example="RO2072010000002", required=true)
    private String returnOrderFid;
}
