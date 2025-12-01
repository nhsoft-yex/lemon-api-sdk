package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PosOrderSummaryVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PosOrderSummaryVOModel extends ApiCloudObject {

    @ApiCloudField(value="门店编码", example="1")
    private Integer branchNum;
    @ApiCloudField(value="商品编码", example="43440001")
    private Integer itemNum;
    @ApiCloudField(value="营业日", example="20200101")
    private String shiftTableBizday;
    @ApiCloudField(value="销售金额（小数点两位）", example="1.0")
    private BigDecimal paymentMoney;
    @ApiCloudField(value="销售数量（小数点三位）", example="1.0")
    private BigDecimal amount;
    @ApiCloudField(value="折扣金额（小数点两位）", example="1.0")
    private BigDecimal discountMoney;
    @ApiCloudField(value="分摊金额（小数点两位）", example="1.0")
    private BigDecimal shareDiscountMoney;
    @ApiCloudField(value="成本单价（小数点两位）", example="1.0")
    private BigDecimal costMoney;
    @ApiCloudField(value="券售价分摊（小数点两位）", example="1.0")
    private BigDecimal couponSaleShareDiscount;
    @ApiCloudField(value="成本金额（小数点两位）", example="1.0")
    private BigDecimal costTotalMoney;
    @ApiCloudField(value="客单量", example="1")
    private Integer orderCount;
}
