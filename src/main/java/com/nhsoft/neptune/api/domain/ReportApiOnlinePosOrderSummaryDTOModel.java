package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ReportApiOnlinePosOrderSummaryDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ReportApiOnlinePosOrderSummaryDTOModel extends ApiCloudObject {

    @ApiCloudField(value="实际收款金额", example="1")
    private BigDecimal actualMoney;
    @ApiCloudField(value="客单量", example="1")
    private Long orderCount;
    @ApiCloudField(value="消费卷抵扣金额", example="1")
    private BigDecimal couponTotalMoney;
    @ApiCloudField(value="会员-实际收款金额", example="1")
    private BigDecimal memberActualMoney;
    @ApiCloudField(value="会员-客单量", example="1")
    private Long memberOrderCount;
    @ApiCloudField(value="会员-消费卷抵扣金额", example="1")
    private BigDecimal memberCouponTotalMoney;
    @ApiCloudField(value="连带率", example="1.6")
    private BigDecimal relatRate;
    @ApiCloudField(value="订单件数", example="1")
    private Long itemCount;
    @ApiCloudField(value="连带单据数", example="2")
    private Long validOrderNo;
    @ApiCloudField(value="线上-自有商城订单总数", example="10")
    private Long ownSaleOrderCount;
    @ApiCloudField(value="线上-自有商城订单金额", example="10")
    private BigDecimal ownSaleReceiptMoney;
    @ApiCloudField(value="线上-自有商城退单总数", example="10")
    private Long ownReturnOrderCount;
    @ApiCloudField(value="线上-自有商城退单金额", example="10")
    private BigDecimal ownReturnReceiptMoney;
    @ApiCloudField(value="线上-外卖平台订单总数", example="10")
    private Long takeoutSaleOrderCount;
    @ApiCloudField(value="线上-外卖平台订单金额", example="10")
    private BigDecimal takeoutSaleReceiptMoney;
    @ApiCloudField(value="线上-外卖平台退单总数", example="10")
    private Long takeoutReturnOrderCount;
    @ApiCloudField(value="线上-外卖平台退单金额", example="10")
    private BigDecimal takeoutReturnReceiptMoney;
}
