package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ReportApiInOutSummaryDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ReportApiInOutSummaryDTOModel extends ApiCloudObject {

    @ApiCloudField(value="商品编码", example="43440001")
    private Integer itemNum;
    @ApiCloudField(value="采购订货数量", example="100")
    private BigDecimal purchaseQty;
    @ApiCloudField(value="采购订货金额", example="10")
    private BigDecimal purchaseMoney;
    @ApiCloudField(value="采购收货数量", example="100")
    private BigDecimal receiveQty;
    @ApiCloudField(value="采购收货金额", example="10")
    private BigDecimal receiveMoney;
    @ApiCloudField(value="采购退货数量", example="100")
    private BigDecimal returnQty;
    @ApiCloudField(value="采购退货金额", example="10")
    private BigDecimal returnMoney;
    @ApiCloudField(value="配送要货数量", example="100")
    private BigDecimal requestQty;
    @ApiCloudField(value="配送要货金额", example="10")
    private BigDecimal requestMoney;
    @ApiCloudField(value="配送调入数量", example="100")
    private BigDecimal transferInQty;
    @ApiCloudField(value="配送调入金额", example="10")
    private BigDecimal transferInMoney;
    @ApiCloudField(value="配送调出数量", example="100")
    private BigDecimal transferOutQty;
    @ApiCloudField(value="配送调出金额", example="10")
    private BigDecimal transferOutMoney;
    @ApiCloudField(value="批发订货数量", example="100")
    private BigDecimal wholesaleBookQty;
    @ApiCloudField(value="批发订货金额", example="10")
    private BigDecimal wholesaleBookMoney;
    @ApiCloudField(value="批发销售数量", example="100")
    private BigDecimal wholesaleOrderQty;
    @ApiCloudField(value="批发销售金额", example="10")
    private BigDecimal wholesaleOrderMoney;
    @ApiCloudField(value="批发退货数量", example="100")
    private BigDecimal wholesaleReturnQty;
    @ApiCloudField(value="批发退货金额", example="10")
    private BigDecimal wholesaleReturnMoney;
    @ApiCloudField(value="盘盈盘亏数量", example="100")
    private BigDecimal checkOrderQty;
    @ApiCloudField(value="盘盈盘亏金额", example="10")
    private BigDecimal checkOrderMoney;
    @ApiCloudField(value="库存调整数量", example="100")
    private BigDecimal adjustOrderQty;
    @ApiCloudField(value="库存调整金额", example="10")
    private BigDecimal adjustOrderMoney;
}
