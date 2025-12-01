package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PaymentTypeV2DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PaymentTypeV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="支付方式", example="银联会员卡")
    private String paymentType;
    @ApiCloudField(value="金额", example="5.0")
    private BigDecimal paymentMoney;
}
