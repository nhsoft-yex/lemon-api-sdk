package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PolicyQuantityDetailVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PolicyQuantityDetailVOModel extends ApiCloudObject {

    @ApiCloudField(value="商品编码", example="434403926")
    private Integer itemNum;
    @ApiCloudField(value="分级商品编码")
    private Integer itemGradeNum;
    @ApiCloudField(value="特价价格", example="3.5")
    private BigDecimal itemSpecialPrice;
    @ApiCloudField(value="起始数量", example="0")
    private BigDecimal itemMinAmount;
    @ApiCloudField(value="明细备注", example="备注信息")
    private String itemMemo;
    @ApiCloudField(value="阶梯价1")
    private BigDecimal itemLadderPrice1;
    @ApiCloudField(value="阶梯价2")
    private BigDecimal itemLadderPrice2;
    @ApiCloudField(value="阶梯价3")
    private BigDecimal itemLadderPrice3;
    @ApiCloudField(value="是否单品中止", example="false")
    private Boolean itemCancel;
    @ApiCloudField(value="中止操作人", example="")
    private String itemCancelOperator;
    @ApiCloudField(value="中止操作时间", example="")
    private String itemCancelTime;
    @ApiCloudField(value="联营商品扣率")
    private BigDecimal itemGross;
    @ApiCloudField(value="进价")
    private BigDecimal itemCost;
    @ApiCloudField(value="促销进价")
    private BigDecimal itemPolicyCost;
    @ApiCloudField(value="换算率")
    private BigDecimal itemUseRate;
    @ApiCloudField(value="每单限量")
    private BigDecimal itemBillLimit;
}
