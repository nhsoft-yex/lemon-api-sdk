package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PolicyDiscountLadderDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PolicyDiscountLadderDTOModel extends ApiCloudObject {

    @ApiCloudField(value="消费金额 ")
    private BigDecimal consumeMoney;
    @ApiCloudField(value="减免金额")
    private BigDecimal discountMoney;
}
