package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PolicyPromotionQuantityKitDetailVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PolicyPromotionQuantityKitDetailVOModel extends ApiCloudObject {

    @ApiCloudField(value="促销数量明细编号")
    private Integer promotionQuantityDetailNum;
    @ApiCloudField(value="组合明细编号")
    private Integer promotionQuantityKitDetailNum;
    @ApiCloudField(value="商品系统编号")
    private Integer itemNum;
    @ApiCloudField(value="进价", example="0.0")
    private BigDecimal promotionQuantityKitDetailCost;
    @ApiCloudField(value="促销进价", example="0.0")
    private BigDecimal promotionQuantityKitDetailPolicyCost;
}
