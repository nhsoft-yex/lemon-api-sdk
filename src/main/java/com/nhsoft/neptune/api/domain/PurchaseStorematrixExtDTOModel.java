package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PurchaseStorematrixExtDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PurchaseStorematrixExtDTOModel extends ApiCloudObject {

    @ApiCloudField(value="采购单位", example="箱")
    private String purchaseUnit;
    @ApiCloudField(value="采购单位换算率", example="5.0")
    private BigDecimal purchaseRate;
    @ApiCloudField(value="7天销量", example="1.5")
    private BigDecimal lastWeekSaleQty;
    @ApiCloudField(value="7天要货量", example="10.0")
    private BigDecimal lastWeekRequestQty;
    @ApiCloudField(value="28天销量", example="3.665")
    private BigDecimal fourWeekSaleQty;
    @ApiCloudField(value="28天要货量", example="28.0")
    private BigDecimal fourWeekRequestQty;
    @ApiCloudField(value="7天调出", example="4.0")
    private BigDecimal lastWeekOutQty;
    @ApiCloudField(value="28天调出", example="15.4")
    private BigDecimal fourWeekOutQty;
    @ApiCloudField(value="7天批发销量", example="0.0")
    private BigDecimal lastWeekWholesaleQty;
    @ApiCloudField(value="28天批发销量", example="510.0")
    private BigDecimal fourWeekWholesaleQty;
    @ApiCloudField(value="补货订购点", example="20.0")
    private BigDecimal recorderPoint;
    @ApiCloudField(value="补货订购量", example="5.0")
    private BigDecimal recorderQty;
    @ApiCloudField(value="库存上限", example="2.0")
    private BigDecimal upperStock;
    @ApiCloudField(value="基础库存", example="12.0")
    private BigDecimal baseStock;
    @ApiCloudField(value="在订量", example="0.0")
    private BigDecimal onLoadQty;
    @ApiCloudField(value="要货量", example="10.0")
    private BigDecimal requestQty;
    @ApiCloudField(value="最近收货日期", example="2022-08-03")
    private String receiveDate;
    @ApiCloudField(value="最新生产日期", example="2023-03-03")
    private String productDate;
}
