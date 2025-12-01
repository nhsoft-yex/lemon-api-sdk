package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PolicyQuantityVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PolicyQuantityVOModel extends ApiCloudObject {

    @ApiCloudField(value="超量特价单据号", example="4344990000586")
    private String promotionQuantityNo;
    @ApiCloudField(value="超量特价活动名称", example="活动名称")
    private String promotionQuantityName;
    @ApiCloudField(value="申请门店编码", example="99")
    private Integer branchNum;
    @ApiCloudField(value="应用门店列表", example="")
    private List<BranchSimpleDTOModel> branchs;
    @ApiCloudField(value="超量特价创建时间", example="2021-01-01 00:00:00")
    private String promotionQuantityCreateTime;
    @ApiCloudField(value="超量特价创建人", example="管理员")
    private String promotionQuantityCreator;
    @ApiCloudField(value="超量特价审核时间", example="2021-01-01 00:00:00")
    private String promotionQuantityAuditTime;
    @ApiCloudField(value="超量特价审核人", example="管理员")
    private String promotionQuantityAuditor;
    @ApiCloudField(value="超量特价作废时间", example="2021-01-01 00:00:00")
    private String promotionQuantityCancelTime;
    @ApiCloudField(value="超量特价作废人", example="管理员")
    private String promotionQuantityCancelOperator;
    @ApiCloudField(value="超量特价最后修改时间", example="2021-01-01 00:00:00")
    private String promotionQuantityLastEditTime;
    @ApiCloudField(value="超量特价最后修改人", example="管理员")
    private String promotionQuantityLastEditor;
    @ApiCloudField(value="状态编码", example="1")
    private Integer promotionQuantityStateCode;
    @ApiCloudField(value="状态名称", example="制单")
    private String promotionQuantityStateName;
    @ApiCloudField(value="超量特价备注", example="备注信息")
    private String promotionQuantityMemo;
    @ApiCloudField(value="超量特价开始日期(yyyy-MM-dd)", example="2021-01-01")
    private String promotionQuantityDateFrom;
    @ApiCloudField(value="超量特价结束日期(yyyy-MM-dd)", example="2021-01-01")
    private String promotionQuantityDateTo;
    @ApiCloudField(value="超量特价开始时间(HH:mm)", example="00:00")
    private String promotionQuantityTimeFrom;
    @ApiCloudField(value="超量特价结束时间(HH:mm)", example="23:59")
    private String promotionQuantityTimeTo;
    @ApiCloudField(value="超量特价是否仅适用会员卡", example="0")
    private Integer promotionQuantityCardOnly;
    @ApiCloudField(value="仅限参与一次", example="true")
    private Boolean promotionQuantityCardOnce;
    @ApiCloudField(value="在会员折扣上折扣", example="true")
    private Boolean promotionQuantityCardFoldUp;
    @ApiCloudField(value="参与会员卡类型", example="")
    private List<CardTypeDTOModel> cardTypes;
    @ApiCloudField(value="参与会员等级", example="")
    private List<String> promotionQuantityLevelIds;
    @ApiCloudField(value="超量特价是否勾选星期一", example="1")
    private Integer promotionQuantityMonActived;
    @ApiCloudField(value="超量特价是否勾选星期二", example="1")
    private Integer promotionQuantityTuesActived;
    @ApiCloudField(value="超量特价是否勾选星期三", example="1")
    private Integer promotionQuantityWedActived;
    @ApiCloudField(value="超量特价是否勾选星期四", example="1")
    private Integer promotionQuantityThursActived;
    @ApiCloudField(value="超量特价是否勾选星期五", example="1")
    private Integer promotionQuantityFridayActived;
    @ApiCloudField(value="超量特价是否勾选星期六", example="1")
    private Integer promotionQuantitySatActived;
    @ApiCloudField(value="超量特价是否勾选星期日", example="1")
    private Integer promotionQuantitySunActived;
    @ApiCloudField(value="超量特价类型(单品超量特价、范围超量特价、偶数特价)", example="单品超量特价")
    private String promotionQuantityType;
    @ApiCloudField(value="促销方式：0 特价/ 1 折扣", example="1")
    private Integer promotionQuantityPriceType;
    @ApiCloudField(value="超量特价折扣", example="0.6")
    private BigDecimal promotionQuantityDiscount;
    @ApiCloudField(value="例外商品", example="")
    private List<PosVariantNumDTOModel> promotionQuantityExceptItem;
    @ApiCloudField(value="例外日期", example="")
    private List<Integer> promotionQuantityExceptionDay;
    @ApiCloudField(value="折扣范围", example="")
    private String promotionQuantityScopeType;
    @ApiCloudField(value="商品类别", example="")
    private List<String> promotionQuantityItemCategory;
    @ApiCloudField(value="指定供应商列表", example="")
    private List<Integer> supplierNums;
    @ApiCloudField(value="阶梯", example="")
    private List<PolicyPromotionQuantityLadderDTOModel> promotionQuantityLadder;
    @ApiCloudField(value="超量特价明细", example="")
    private List<PolicyQuantityDetailVOModel> promotionQuantityDetails;
    @ApiCloudField(value="促销档期", example="58")
    private Long policyScheduleId;
    @ApiCloudField(value="促销档期编号列表", example="[58]")
    private List<Long> policyScheduleIds;
    @ApiCloudField(value="例外商品模板列表", example="[207200000037]")
    private List<String> policyItemTemplateNos;
    @ApiCloudField(value="活动起始数量（仅范围超量特价生效）", example="10.0")
    private BigDecimal promotionQuantityMinAmount;
    @ApiCloudField(value="超量倍数累加（偶数特价不生效）", example="true")
    private Boolean promotionQuantityAppend;
    @ApiCloudField(value="按阶梯享受特价", example="true")
    private Boolean promotionQuantityLadderSpecialPrice;
    @ApiCloudField(value="是否例外门店", example="true")
    private Boolean exceptBranch;
    @ApiCloudField(value="外部单号", example="")
    private String promotionQuantityOutBillNo;
}
