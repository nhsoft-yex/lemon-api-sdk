package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * GiftCardValueVO模型
 * 礼品卡面值
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class GiftCardValueVOModel extends ApiCloudObject {

    @ApiCloudField(value="面值id", example="1", required=true)
    private Integer valueId;
    @ApiCloudField(value="面值", example="17644219987", required=true)
    private BigDecimal value;
    @ApiCloudField(value="购买金额", example="17644219987", required=true)
    private BigDecimal purchaseMoney;
}
