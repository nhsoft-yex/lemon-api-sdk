package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * SaleOrderReadV2DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class SaleOrderReadV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="订单编号", example="1", required=true)
    private String orderId;
}
