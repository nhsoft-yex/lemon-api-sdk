package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PosOrderKitDetailVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PosOrderKitDetailVOModel extends ApiCloudObject {

    @ApiCloudField(value="商品编码")
    private Integer itemNum;
    @ApiCloudField(value="明细编号", example="1")
    private Integer detailNum;
    @ApiCloudField(value="商品标准售价（小数点4位）", example="50.0")
    private BigDecimal orderKitDetailStdPrice;
    @ApiCloudField(value="商品实际价格（小数点4位）", example="30.0")
    private BigDecimal orderKitDetailPrice;
    @ApiCloudField(value="商品数量（小数点3位）", example="1.0")
    private BigDecimal orderKitDetailAmount;
    @ApiCloudField(value="商品折扣金额", example="20.0")
    private BigDecimal orderKitDetailDiscount;
    @ApiCloudField(value="商品支付金额（小数点2位）", example="30.0")
    private BigDecimal orderKitDetailPaymentMoney;
    @ApiCloudField(value="分摊金额（小数点2位）", example="3.9")
    private BigDecimal orderKitDetailShareDiscount;
    @ApiCloudField(value="成本价（小数点4位）", example="10.0")
    private BigDecimal orderKitDetailCost;
    @ApiCloudField(value="税额（小数点2位）", example="30.0")
    private BigDecimal orderKitDetailTax;
    @ApiCloudField(value="销售毛利（小数点2位）", example="30.0")
    private BigDecimal orderKitDetailGrossProfit;
    @ApiCloudField(value="商品券销售分摊金额", example="0.04")
    private BigDecimal orderKitDetailCouponSaleShareDiscount;
    @ApiCloudField(value="经营方式", example="购销")
    private String managementStyleType;
    @ApiCloudField(value="成本金额（小数点2位）", example="10.0")
    private BigDecimal orderKitDetailCostMoney;
}
