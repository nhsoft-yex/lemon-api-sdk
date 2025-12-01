package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ReportApiPosOrderSummaryDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ReportApiPosOrderSummaryDTOModel extends ApiCloudObject {

    @ApiCloudField(value="商品档案编号", example="43440001")
    private Integer itemNum;
    @ApiCloudField(value="营业日", example="20220101")
    private String shiftTableBizday;
    @ApiCloudField(value="商品销售金额（销售）", example="10")
    private BigDecimal totalSaleMoney;
    @ApiCloudField(value="商品销售数量（销售）", example="2")
    private BigDecimal totalSaleAmount;
    @ApiCloudField(value="商品销售金额（退货）", example="5")
    private BigDecimal totalReturnMoney;
    @ApiCloudField(value="商品销售数量（退货）", example="1")
    private BigDecimal totalReturnAmount;
    @ApiCloudField(value="商品分摊金额", example="1")
    private BigDecimal totalShareDiscount;
    @ApiCloudField(value="商品折扣金额", example="1")
    private BigDecimal totalDiscount;
    @ApiCloudField(value="商品赠送金额", example="2")
    private BigDecimal totalPresentMoney;
    @ApiCloudField(value="商品赠送数量", example="1")
    private BigDecimal totalPresentAmount;
    @ApiCloudField(value="商品销售次数", example="2")
    private BigDecimal itemNumCount;
    @ApiCloudField(value="商品销售成本", example="1")
    private BigDecimal totalCostMoney;
    @ApiCloudField(value="商品销售毛利", example="1")
    private BigDecimal totalProfitMoney;
    @ApiCloudField(value="会员-商品销售金额（销售）", example="1")
    private BigDecimal totalMemberSaleMoney;
    @ApiCloudField(value="会员-商品销售金额（退货）", example="1")
    private BigDecimal totalMemberReturnMoney;
    @ApiCloudField(value="会员-商品赠送金额", example="1")
    private BigDecimal totalMemberPresetMoney;
    @ApiCloudField(value="配送金额", example="10.0")
    private BigDecimal transferOrderMoney;
    @ApiCloudField(value="调入金额", example="10.0")
    private BigDecimal transferInOrderMoney;
    @ApiCloudField(value="调出金额", example="10.0")
    private BigDecimal transferOutOrderMoney;
}
