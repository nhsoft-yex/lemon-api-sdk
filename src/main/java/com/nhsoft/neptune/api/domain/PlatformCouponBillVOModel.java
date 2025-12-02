package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PlatformCouponBillVO模型
 * 平台优惠券账单信息
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PlatformCouponBillVOModel extends ApiCloudObject {

    @ApiCloudField(value="ID")
    private Long id;
    @ApiCloudField(value="券平台", example="")
    private String platform;
    @ApiCloudField(value="券类型ID")
    private Long couponTypeId;
    @ApiCloudField(value="券类型名称", example="")
    private String couponTypeName;
    @ApiCloudField(value="券码", example="")
    private String identityCode;
    @ApiCloudField(value="券面值")
    private BigDecimal value;
    @ApiCloudField(value="实际抵扣金额")
    private BigDecimal money;
    @ApiCloudField(value="核销时间")
    private String consumeAt;
    @ApiCloudField(value="账单日期YYYY-MM-DD", example="")
    private String billDate;
    @ApiCloudField(value="线下核销门店ID")
    private Integer consumeBranchNum;
    @ApiCloudField(value="线下核销门店名称", example="")
    private String consumeBranchName;
    @ApiCloudField(value="关联单据号", example="")
    private String relateOrderNo;
    @ApiCloudField(value="券售价")
    private BigDecimal salePrice;
    @ApiCloudField(value="对账差额")
    private BigDecimal billDifference;
    @ApiCloudField(value="补贴金额")
    private BigDecimal subsidyMoney;
    @ApiCloudField(value="平台方核销门店ID", example="")
    private String platformConsumeBranchId;
    @ApiCloudField(value="平台方订单id", example="")
    private String platformOrderId;
    @ApiCloudField(value="原始金额，单位元")
    private BigDecimal original;
    @ApiCloudField(value="参与分账的总金额，单位元")
    private BigDecimal ledgerTotal;
    @ApiCloudField(value="商家货款，单位元")
    private BigDecimal goods;
    @ApiCloudField(value="购券分账差额;单位元")
    private BigDecimal balance;
    @ApiCloudField(value="手续费;单位元")
    private BigDecimal serviceCharge;
}
