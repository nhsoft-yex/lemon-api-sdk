package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PayableOrderDetailSaveDTO模型
 * 应付订单明细
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PayableOrderDetailSaveDTOModel extends ApiCloudObject {

    @ApiCloudField(value="金额", example="20.0", required=true)
    private BigDecimal amount;
    @ApiCloudField(value="商品名称", example="苹果", required=true)
    private String itemName;
    @ApiCloudField(value="商品编码", example="43440001", required=true)
    private String itemNum;
    @ApiCloudField(value="基本数量", example="1", required=true)
    private BigDecimal itemQuantity;
    @ApiCloudField(value="基本单位", example="公斤", required=true)
    private String itemUnit;
    @ApiCloudField(value="常用数量", example="1", required=true)
    private BigDecimal itemUseQuantity;
    @ApiCloudField(value="常用单位", example="箱", required=true)
    private String itemUseUnit;
    @ApiCloudField(value="税额", example="10.0", required=true)
    private BigDecimal taxAmount;
    @ApiCloudField(value="税率", example="0.1", required=true)
    private BigDecimal taxRate;
}
