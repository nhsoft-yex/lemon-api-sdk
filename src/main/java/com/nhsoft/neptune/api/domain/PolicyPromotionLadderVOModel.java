package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PolicyPromotionLadderVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PolicyPromotionLadderVOModel extends ApiCloudObject {

    @ApiCloudField(value="层级", example="1")
    private Integer level;
    @ApiCloudField(value="限制金额", example="10.0")
    private BigDecimal limitAmount;
    @ApiCloudField(value="折扣率", example="0.9")
    private BigDecimal discount;
    @ApiCloudField(value="价格类型", example="0")
    private Integer priceType;
}
