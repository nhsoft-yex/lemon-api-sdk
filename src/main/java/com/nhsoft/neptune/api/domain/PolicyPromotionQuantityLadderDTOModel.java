package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PolicyPromotionQuantityLadderDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PolicyPromotionQuantityLadderDTOModel extends ApiCloudObject {

    @ApiCloudField(value="阶梯编号")
    private Integer level;
    @ApiCloudField(value="起始数量")
    private BigDecimal limitAmount;
    @ApiCloudField(value="折扣率")
    private BigDecimal discount;
    @ApiCloudField(value="商品特价0:自定义 1:门店标准售价")
    private Integer priceType;
}
