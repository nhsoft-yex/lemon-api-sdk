package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * TransferPromotionQuantityVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class TransferPromotionQuantityVOModel extends ApiCloudObject {

    @ApiCloudField(value="促销单号", example="PQ2023001")
    private String promotionQuantityNo;
    @ApiCloudField(value="促销名称", example="春季大促")
    private String promotionQuantityName;
    @ApiCloudField(value="门店编号", example="5")
    private Integer branchNum;
    @ApiCloudField(value="促销开始日期", example="Sun Jan 01 08:00:00 CST 2023")
    private String promotionQuantityDateFrom;
    @ApiCloudField(value="促销结束日期", example="Sun Dec 31 08:00:00 CST 2023")
    private String promotionQuantityDateTo;
    @ApiCloudField(value="促销开始时间", example="09:00")
    private String promotionQuantityTimeFrom;
    @ApiCloudField(value="促销结束时间", example="21:00")
    private String promotionQuantityTimeTo;
    @ApiCloudField(value="周一是否启用", example="true")
    private Boolean promotionQuantityMonActived;
    @ApiCloudField(value="周二是否启用", example="true")
    private Boolean promotionQuantityTuesActived;
    @ApiCloudField(value="周三是否启用", example="true")
    private Boolean promotionQuantityWedActived;
    @ApiCloudField(value="周四是否启用", example="true")
    private Boolean promotionQuantityThursActived;
    @ApiCloudField(value="周五是否启用", example="true")
    private Boolean promotionQuantityFridayActived;
    @ApiCloudField(value="周六是否启用", example="false")
    private Boolean promotionQuantitySatActived;
    @ApiCloudField(value="周日是否启用", example="false")
    private Boolean promotionQuantitySunActived;
    @ApiCloudField(value="状态编码(1:制单；3:制单|审核；5：制单|审核|作废)", example="1")
    private Integer stateCode;
    @ApiCloudField(value="状态名称", example="制单")
    private String stateName;
    @ApiCloudField(value="创建时间")
    private String promotionQuantityCreateTime;
    @ApiCloudField(value="创建人", example="admin")
    private String promotionQuantityCreator;
    @ApiCloudField(value="审核时间")
    private String promotionQuantityAuditTime;
    @ApiCloudField(value="审核人", example="auditor")
    private String promotionQuantityAuditor;
    @ApiCloudField(value="备注", example="春季促销活动")
    private String promotionQuantityMemo;
    @ApiCloudField(value="作废时间")
    private String promotionQuantityCancelTime;
    @ApiCloudField(value="作废人", example="operator")
    private String promotionQuantityCancelOperator;
    @ApiCloudField(value="最后编辑时间")
    private String promotionQuantityLastEditTime;
    @ApiCloudField(value="最后编辑人", example="editor")
    private String promotionQuantityLastEditor;
    @ApiCloudField(value="价格类型：0特价|1折扣", example="0")
    private Integer promotionQuantityPriceType;
    @ApiCloudField(value="促销范围：0配送量|1订货量|2临期商品", example="0")
    private Integer promotionQuantityTransferType;
    @ApiCloudField(value="配送门店编号", example="3")
    private Integer transferBranchNum;
    @ApiCloudField(value="按常用单价设置特价", example="true")
    private Boolean promotionQuantityLadderSpecialPrice;
    @ApiCloudField(value="是否过期", example="false")
    private Boolean overdue;
    @ApiCloudField(value="活动数量按门店控制", example="true")
    private Boolean asPerEveryBranch;
    @ApiCloudField(value="按常用单价设置特价", example="true")
    private Boolean usePriceSetSpecialPrice;
    @ApiCloudField(value="促销详情列表", example="")
    private List<PolicyPromotionQuantityDetailVOModel> policyPromotionQuantityDetails;
    @ApiCloudField(value="阶梯列表", example="")
    private List<PolicyPromotionLadderVOModel> ladders;
    @ApiCloudField(value="应用门店列表", example="[1]")
    private List<Integer> branchNums;
}
