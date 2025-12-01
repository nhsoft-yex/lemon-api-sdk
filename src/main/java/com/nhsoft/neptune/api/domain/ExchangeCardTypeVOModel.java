package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ExchangeCardTypeVO模型
 * 次卡卡类型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ExchangeCardTypeVOModel extends ApiCloudObject {

    @ApiCloudField(value="次卡类型ID", example="1")
    private Long id;
    @ApiCloudField(value="次卡类型名称", example="可乐兑换次卡")
    private String name;
    @ApiCloudField(value="购买结算比例", example="1.0")
    private BigDecimal purchaseSettlementRatio;
    @ApiCloudField(value="消费结算比例", example="1.0")
    private BigDecimal settlementRatio;
}
