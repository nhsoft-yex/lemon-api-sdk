package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PolicyPromotionDetailVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PolicyPromotionDetailVOModel extends ApiCloudObject {

    @ApiCloudField(value="商品编码")
    private Integer itemNum;
    @ApiCloudField(value="分级商品编码", example="431134623")
    private Integer itemGradeNum;
    @ApiCloudField(value="标准售价", example="20.0")
    private BigDecimal itemRegularPrice;
    @ApiCloudField(value="特价价格", example="15.0")
    private BigDecimal itemSpecialPrice;
    @ApiCloudField(value="每单限量", example="5")
    private BigDecimal itemBillLimit;
    @ApiCloudField(value="促销特价明细备注", example="备注信息")
    private String itemMemo;
    @ApiCloudField(value="联营商品扣率%")
    private BigDecimal itemGross;
    @ApiCloudField(value="促销进价")
    private BigDecimal itemPolicyCost;
    @ApiCloudField(value="是否扣补", example="false")
    private Boolean makeUp;
}
