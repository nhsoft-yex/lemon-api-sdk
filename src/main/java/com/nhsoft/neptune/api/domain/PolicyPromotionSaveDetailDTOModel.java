package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PolicyPromotionSaveDetailDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PolicyPromotionSaveDetailDTOModel extends ApiCloudObject {

    @ApiCloudField(value="商品编码", example="110050001", required=true)
    private Integer itemNum;
    @ApiCloudField(value="分级商品编码", example="431134623")
    private Integer itemGradeNum;
    @ApiCloudField(value="标准售价（该字段废弃）", example="5.0")
    private BigDecimal itemRegularPrice;
    @ApiCloudField(value="特价价格(单品特价时必填)", example="5.0")
    private BigDecimal itemSpecialPrice;
    @ApiCloudField(value="每单限量(不限制传0)", example="5", required=true)
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
