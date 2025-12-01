package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * DiscountCodeUpdateDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class DiscountCodeUpdateDTOModel extends ApiCloudObject {

    @ApiCloudField(value="折扣码名称", example="", required=true)
    private String discountCodeName;
    @ApiCloudField(value="折扣码条码", example="", required=true)
    private String discountCodeBarcode;
    @ApiCloudField(value="开始日期", example="Mon Jan 01 08:00:00 CST 2024", required=true)
    private String discountCodeDateFrom;
    @ApiCloudField(value="结束日期", example="Wed May 01 08:00:00 CST 2024", required=true)
    private String discountCodeDateTo;
    @ApiCloudField(value="discount_code_time_from", required=true)
    private LocalTimeModel discountCodeTimeFrom;
    @ApiCloudField(value="discount_code_time_to", required=true)
    private LocalTimeModel discountCodeTimeTo;
    @ApiCloudField(value="应用门店(不传则为所有门店)", example="")
    private List<Integer> discountCodeAppliedBranches;
    @ApiCloudField(value="折扣类型(DISCOUNT:折扣;MONEY:金额;SPECIAL_PRICE:特价)", example="DISCOUNT", required=true)
    private String discountCodeDiscountType;
    @ApiCloudField(value="折扣率", example="0.3")
    private BigDecimal discountCodeDiscount;
    @ApiCloudField(value="制单门店编码", example="99")
    private Integer branchNum;
    @ApiCloudField(value="折扣金额", example="50")
    private BigDecimal discountCodeMoney;
    @ApiCloudField(value="促销参与方式(PARTICIPATE_WITH_PROMOTION_PRICE:按促销价参与;EXCLUDE_PROMOTION_ITEM:促销商品不参与;PARTICIPATE_WITH_ORIGINAL_PRICE:促销商品按原价参与)", example="PARTICIPATE_WITH_PROMOTION_PRICE", required=true)
    private String participateType;
    @ApiCloudField(value="商品范围(POS_ITEM: 指定商品;POS_ITEM_CATEGORY: 指定商品类别)", example="POS_ITEM_CATEGORY", required=true)
    private String discountCodeAssignedType;
    @ApiCloudField(value="商品类别", example="测试类别")
    private List<String> discountCodeAssignedCategories;
    @ApiCloudField(value="商品明细", example="")
    private List<DiscountCodeDetailSaveDTOModel> details;
    @ApiCloudField(value="操作人", example="", required=true)
    private String operator;
    @ApiCloudField(value="折扣码", example="")
    private String discountCodeNo;
}
