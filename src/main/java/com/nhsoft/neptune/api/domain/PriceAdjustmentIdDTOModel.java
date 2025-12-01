package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PriceAdjustmentIdDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PriceAdjustmentIdDTOModel extends ApiCloudObject {

    @ApiCloudField(value="调价申请单号", example="4344990001419", required=true)
    private String priceAdjustmentFid;
    @ApiCloudField(value="操作人", example="管理员", required=true)
    private String priceAdjustmentOperator;
}
