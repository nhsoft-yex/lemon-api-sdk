package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * WhsPolicyDiscountVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class WhsPolicyDiscountVOModel extends ApiCloudObject {

    @ApiCloudField(value="门店编号", example="99", required=true)
    private Integer branchNum;
    @ApiCloudField(value="批发折扣单号", example="1099990000003")
    private String wholesalePolicyDiscountNo;
    @ApiCloudField(value="批发超额折扣名称", example="全场9折")
    private String wholesalePolicyDiscountName;
    @ApiCloudField(value="批发额折扣备注", example="备注")
    private String wholesalePolicyDiscountMemo;
    @ApiCloudField(value="状态(1:制单;3:制单|审核)", example="1")
    private String wholesalePolicyDiscountStateCode;
    @ApiCloudField(value="状态名称", example="制单")
    private String wholesalePolicyDiscountStateName;
    @ApiCloudField(value="类型(超额折扣|超额减免)", example="超额减免", required=true)
    private String wholesalePolicyDiscountType;
    @ApiCloudField(value="折扣率(0-1)", example="0.9")
    private BigDecimal wholesalePolicyDiscountDiscount;
    @ApiCloudField(value="减免金额", example="10")
    private BigDecimal wholesalePolicyDiscountDiscountMoney;
    @ApiCloudField(value="消费金额", example="50", required=true)
    private BigDecimal wholesalePolicyDiscountBillMoney;
    @ApiCloudField(value="单笔最高减免金额", example="10")
    private BigDecimal wholesalePolicyDiscountTotalDiscount;
    @ApiCloudField(value="折扣类型(指定商品|指定品牌|指定类别|全场)", example="指定商品", required=true)
    private String wholesalePolicyDiscountAssignedType;
    @ApiCloudField(value="折扣明细(指定类别、全场时为例外商品)")
    private List<WhsPolicyDiscountDetailVOModel> wholesalePolicyDiscountDetails;
    @ApiCloudField(value="促销客户列表(查询接口该字段不返回)", example="[1]")
    private List<String> wholesaleExcessGiftsAppliedClientIds;
    @ApiCloudField(value="应用门店列表", example="[1]")
    private List<Integer> wholesalePolicyDiscountAppliedBranchNums;
    @ApiCloudField(value="商品类别(当折扣类型为指定类别，该字段必填)", example="[碳酸饮料]")
    private List<String> wholesalePolicyDiscountAssignedCategory;
    @ApiCloudField(value="商品品牌(当折扣类型为指定品牌，该字段必填)", example="[可口可乐]")
    private List<String> wholesalePolicyDiscountAssignedBrand;
    @ApiCloudField(value="日期开始时间", required=true)
    private String wholesalePolicyDiscountDateFrom;
    @ApiCloudField(value="日期结束时间", required=true)
    private String wholesalePolicyDiscountDateTo;
    @ApiCloudField(value="创建人", example="admin", required=true)
    private String wholesalePolicyDiscountCreator;
    @ApiCloudField(value="客户范围(所有客户|指定客户|指定等级|指定分类)", example="指定会员等级", required=true)
    private String clientRange;
    @ApiCloudField(value="应用范围(商家开单、客户订货)", example="[客户订货]", required=true)
    private List<String> wholesalePolicyDiscountApplicationScope;
    @ApiCloudField(value="客户等级列表")
    private List<PosClientGradeVOModel> clientGrades;
    @ApiCloudField(value="客户类别列表")
    private List<SimplePosClientTypeVOModel> clientTypes;
}
