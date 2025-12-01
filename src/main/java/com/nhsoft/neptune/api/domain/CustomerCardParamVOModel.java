package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * CustomerCardParamVO模型
 * 客户卡片参数VO
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CustomerCardParamVOModel extends ApiCloudObject {

    @ApiCloudField(value="最低控制金额", example="10.0")
    private BigDecimal lowestMoney;
    @ApiCloudField(value="默认续卡费用", example="10.0")
    private BigDecimal relateCardFee;
    @ApiCloudField(value="是否可更改续卡费用", example="true")
    private Boolean changeRelateCardFee;
    @ApiCloudField(value="默认换卡费用", example="10.0")
    private BigDecimal changeCardFeeMoney;
    @ApiCloudField(value="是否可更改换卡费用", example="true")
    private Boolean isChangeCardFee;
    @ApiCloudField(value="兑换积分", example="100.0")
    private BigDecimal exchangePoint;
    @ApiCloudField(value="换取储值", example="1.0")
    private BigDecimal exchangeMoney;
}
