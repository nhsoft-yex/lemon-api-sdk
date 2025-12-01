package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PolicyPromotionQuantityDetailVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PolicyPromotionQuantityDetailVOModel extends ApiCloudObject {

    @ApiCloudField(value="促销数量明细编号")
    private Integer promotionQuantityDetailNum;
    @ApiCloudField(value="商品系统编号")
    private Integer itemNum;
    @ApiCloudField(value="基本单位标准价")
    private BigDecimal promotionQuantityDetailStdPrice;
    @ApiCloudField(value="基本单位特价")
    private BigDecimal promotionQuantityDetailSpecialPrice;
    @ApiCloudField(value="起始数量")
    private BigDecimal promotionQuantityDetailMinAmount;
    @ApiCloudField(value="进价")
    private BigDecimal promotionQuantityDetailCost;
    @ApiCloudField(value="备注", example="")
    private String promotionQuantityDetailMemo;
    @ApiCloudField(value="分级主键")
    private Integer itemGradeNum;
    @ApiCloudField(value="活动数量")
    private BigDecimal promotionQuantityDetailLimitAmount;
    @ApiCloudField(value="每单限量")
    private BigDecimal promotionQuantityDetailBillLimit;
    @ApiCloudField(value="销售数量")
    private BigDecimal promotionQuantityDetailSaleAmount;
    @ApiCloudField(value="批次号", example="")
    private String promotionQuantityLotNumber;
    @ApiCloudField(value="配送单位特价")
    private BigDecimal promotionQuantityDetailSpecialUsePrice;
    @ApiCloudField(value="销售数量")
    private BigDecimal promotionQuantityDetailUseRate;
    @ApiCloudField(value="配送单位", example="")
    private String promotionQuantityDetailUseUnit;
    @ApiCloudField(value="联营商品扣率%")
    private BigDecimal promotionQuantityDetailGross;
    @ApiCloudField(value="阶梯特价1")
    private BigDecimal promotionQuantityDetailLadderPrice1;
    @ApiCloudField(value="阶梯特价2")
    private BigDecimal promotionQuantityDetailLadderPrice2;
    @ApiCloudField(value="阶梯特价3")
    private BigDecimal promotionQuantityDetailLadderPrice3;
    @ApiCloudField(value="商品中止", example="false")
    private Boolean promotionQuantityDetailCancel;
    @ApiCloudField(value="中止人", example="")
    private String policyPromotionQuantityDetailCancelOperator;
    @ApiCloudField(value="中止时间")
    private String policyPromotionQuantityDetailCancelTime;
    @ApiCloudField(value="促销进价")
    private BigDecimal promotionQuantityDetailPolicyCost;
    @ApiCloudField(value="组合明细", example="")
    private List<PolicyPromotionQuantityKitDetailVOModel> policyPromotionQuantityKitDetails;
}
