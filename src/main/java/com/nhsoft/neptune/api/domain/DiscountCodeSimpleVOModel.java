package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * DiscountCodeSimpleVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class DiscountCodeSimpleVOModel extends ApiCloudObject {

    @ApiCloudField(value="折扣码编号", example="")
    private String discountCodeNo;
    @ApiCloudField(value="名称", example="")
    private String discountCodeName;
    @ApiCloudField(value="条码", example="")
    private String discountCodeBarcode;
    @ApiCloudField(value="开始日期", example="")
    private String discountCodeDateFrom;
    @ApiCloudField(value="结束日期", example="")
    private String discountCodeDateTo;
    @ApiCloudField(value="开始时间", example="")
    private String discountCodeTimeFrom;
    @ApiCloudField(value="结束时间", example="")
    private String discountCodeTimeTo;
    @ApiCloudField(value="状态", example="false")
    private Boolean discountCodeStatus;
    @ApiCloudField(value="创建时间", example="")
    private String discountCodeCreateTime;
    @ApiCloudField(value="创建人", example="")
    private String discountCodeCreator;
    @ApiCloudField(value="作废时间", example="")
    private String discountCodeCancelTime;
    @ApiCloudField(value="作废人", example="")
    private String discountCodeCancelOperator;
    @ApiCloudField(value="折扣类型", example="")
    private String discountCodeDiscountType;
    @ApiCloudField(value="折扣率")
    private BigDecimal discountCodeDiscount;
    @ApiCloudField(value="折扣金额")
    private BigDecimal discountCodeMoney;
    @ApiCloudField(value="促销参与方式(PARTICIPATE_WITH_PROMOTION_PRICE:按促销价参与;EXCLUDE_PROMOTION_ITEM:促销商品不参与;PARTICIPATE_WITH_ORIGINAL_PRICE:促销商品按原价参与)", example="PARTICIPATE_WITH_PROMOTION_PRICE")
    private String participateType;
    @ApiCloudField(value="最后修改时间", example="")
    private String discountCodeLastEditTime;
    @ApiCloudField(value="修改人", example="")
    private String discountCodeLastEditor;
    @ApiCloudField(value="打印份数")
    private Integer discountCodePrintCount;
    @ApiCloudField(value="应用门店范围", example="")
    private List<Integer> discountCodeAppliedBranchNums;
}
