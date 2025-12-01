package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * CardConditionV2DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CardConditionV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="卡类型", example="会员卡")
    private String cardUserTypeName;
    @ApiCloudField(value="发卡量", example="1")
    private Integer sendCardCount;
    @ApiCloudField(value="卡回收数量", example="1")
    private Integer returnCardCount;
    @ApiCloudField(value="付款金额", example="5.0")
    private BigDecimal paymentMoney;
    @ApiCloudField(value="存款金额", example="5.0")
    private BigDecimal depositMoney;
    @ApiCloudField(value="消费金额", example="5.0")
    private BigDecimal consumeMoney;
    @ApiCloudField(value="老会员转卡金额", example="5.0")
    private BigDecimal oriDepositMoney;
}
