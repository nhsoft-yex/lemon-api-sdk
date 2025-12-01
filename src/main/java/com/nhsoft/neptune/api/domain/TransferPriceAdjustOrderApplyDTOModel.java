package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * TransferPriceAdjustOrderApplyDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class TransferPriceAdjustOrderApplyDTOModel extends ApiCloudObject {

    @ApiCloudField(value="配送价调整单号", example="4344990000318", required=true)
    private List<String> priceAdjustmentFids;
    @ApiCloudField(value="操作人", example="管理员", required=true)
    private String priceAdjustmentOperator;
}
