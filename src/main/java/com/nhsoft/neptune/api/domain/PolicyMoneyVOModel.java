package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PolicyMoneyVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PolicyMoneyVOModel extends ApiCloudObject {

    @ApiCloudField(value="超额奖励单据号", example="4344990000341")
    private String promotionMoneyNo;
    @ApiCloudField(value="活动名称", example="活动名称")
    private String promotionMoneyName;
    @ApiCloudField(value="申请门店编码", example="99")
    private Integer branchNum;
    @ApiCloudField(value="应用门店列表", example="")
    private List<BranchSimpleDTOModel> branchs;
    @ApiCloudField(value="超额奖励创建人", example="管理员")
    private String promotionMoneyCreator;
    @ApiCloudField(value="超额奖励创建时间", example="2021-01-01 00:00:00")
    private String promotionMoneyCreateTime;
    @ApiCloudField(value="超额奖励审核人", example="管理员")
    private String promotionMoneyAuditor;
    @ApiCloudField(value="超额奖励审核时间", example="2021-01-01 00:00:00")
    private String promotionMoneyAuditTime;
    @ApiCloudField(value="超额奖励作废时间", example="2021-01-01 00:00:00")
    private String promotionMoneyCancelTime;
    @ApiCloudField(value="超额奖励作废人", example="管理员")
    private String promotionMoneyCancelOperator;
    @ApiCloudField(value="超额奖励最后修改时间", example="2021-01-01 00:00:00")
    private String promotionMoneyLastEditTime;
    @ApiCloudField(value="超额奖励最后修改人", example="管理员")
    private String promotionMoneyLastEditor;
    @ApiCloudField(value="状态编码", example="1")
    private Integer promotionMoneyStateCode;
    @ApiCloudField(value="状态名称", example="制单")
    private String promotionMoneyStateName;
    @ApiCloudField(value="备注", example="备注信息")
    private String promotionMoneyMemo;
    @ApiCloudField(value="超额奖励开始日期(yyyy-MM-dd)", example="2021-01-01")
    private String promotionMoneyDateFrom;
    @ApiCloudField(value="超额奖励结束日期(yyyy-MM-dd)", example="2021-01-01")
    private String promotionMoneyDateTo;
    @ApiCloudField(value="超额奖励开始时间(HH:mm)", example="00:00")
    private String promotionMoneyTimeFrom;
    @ApiCloudField(value="超额奖励结束时间(HH:mm)", example="23:59")
    private String promotionMoneyTimeTo;
    @ApiCloudField(value="超额奖励是否仅适用会员卡", example="0")
    private Integer promotionMoneyCardOnly;
    @ApiCloudField(value="参与会员卡类型", example="")
    private List<CardTypeDTOModel> cardTypes;
    @ApiCloudField(value="会员类别等级", example="")
    private List<Long> promotionMoneyLevelIds;
    @ApiCloudField(value="超额奖励是否勾选星期一", example="1")
    private Integer promotionMoneyMonActived;
    @ApiCloudField(value="超额奖励是否勾选星期二", example="1")
    private Integer promotionMoneyTuesActived;
    @ApiCloudField(value="超额奖励是否勾选星期三", example="1")
    private Integer promotionMoneyWedActived;
    @ApiCloudField(value="超额奖励是否勾选星期四", example="1")
    private Integer promotionMoneyThursActived;
    @ApiCloudField(value="超额奖励是否勾选星期五", example="1")
    private Integer promotionMoneyFridayActived;
    @ApiCloudField(value="超额奖励是否勾选星期六", example="1")
    private Integer promotionMoneySatActived;
    @ApiCloudField(value="超额奖励是否勾选星期日", example="1")
    private Integer promotionMoneySunActived;
    @ApiCloudField(value="超额奖励最多特价样数", example="2")
    private Integer promotionItemCount;
    @ApiCloudField(value="消费金额条件", example="1.0")
    private BigDecimal promotionMoneyBillMoney;
    @ApiCloudField(value="超额奖励是否超额累加", example="0")
    private Integer promotionMoneyAppend;
    @ApiCloudField(value="每次最多奖励件数", example="1")
    private BigDecimal promotionMoneyEveryTimeMaxLimit;
    @ApiCloudField(value="促销商品不计入消费金额", example="true")
    private Boolean policyItemNoIn;
    @ApiCloudField(value="折扣类型( 指定商品、指定类别、全场)", example="指定商品")
    private String promotionMoneyAssignedType;
    @ApiCloudField(value="指定类别（类别编码逗号分隔）", example="1030,1040")
    private String promotionMoneyAssignedCategory;
    @ApiCloudField(value="促销方式：0 特价/ 1 折扣", example="0")
    private Integer promotionMoneyPriceType;
    @ApiCloudField(value="折扣率", example="0.5")
    private BigDecimal promotionMoneyDiscount;
    @ApiCloudField(value="参与促销（例外）商品明细(指定类别、全场为例外商品)", example="[207210281]")
    private List<Integer> itemNums;
    @ApiCloudField(value="参与促销（例外）商品明细(指定类别、全场为例外商品)(含分级商品)", example="")
    private List<PosVariantNumDTOModel> promotionMoneyItems;
    @ApiCloudField(value="超额奖励明细(仅单品特价、单品折扣有效)", example="")
    private List<PolicyMoneyDetailVOModel> promotionMoneyDetails;
    @ApiCloudField(value="促销档期", example="58")
    private Long policyScheduleId;
    @ApiCloudField(value="促销档期编号列表", example="[58]")
    private List<Long> policyScheduleIds;
    @ApiCloudField(value="例外商品模板列表", example="[207200000037]")
    private List<String> policyItemTemplateNos;
    @ApiCloudField(value="活动总单数限制", example="1")
    private Integer promotionMoneyTotalLimit;
    @ApiCloudField(value="门店单数限制", example="1")
    private Integer promotionMoneyBranchLimit;
    @ApiCloudField(value="最多奖励件数", example="10.0")
    private BigDecimal promotionMoneyMaxQty;
    @ApiCloudField(value="是否例外门店", example="true")
    private Boolean exceptBranch;
    @ApiCloudField(value="例外日期", example="[10]")
    private List<Integer> promotionMoneyExceptionDay;
    @ApiCloudField(value="外部单号", example="")
    private String promotionMoneyOutBillNo;
}
