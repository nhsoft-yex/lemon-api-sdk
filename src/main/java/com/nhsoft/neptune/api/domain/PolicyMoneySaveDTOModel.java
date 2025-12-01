package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PolicyMoneySaveDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PolicyMoneySaveDTOModel extends ApiCloudObject {

    @ApiCloudField(value="超额奖励活动名称", example="活动名称")
    private String promotionMoneyName;
    @ApiCloudField(value="申请门店编码", example="1", required=true)
    private Integer branchNum;
    @ApiCloudField(value="应用门店编码列表", example="[1,2]", required=true)
    private List<Integer> branchNums;
    @ApiCloudField(value="是否例外门店", example="true")
    private Boolean exceptBranch;
    @ApiCloudField(value="例外日期", example="[10]")
    private List<Integer> promotionMoneyExceptionDay;
    @ApiCloudField(value="操作人", example="管理员", required=true)
    private String promotionMoneyOperator;
    @ApiCloudField(value="备注", example="备注信息")
    private String promotionMoneyMemo;
    @ApiCloudField(value="超额奖励开始日期(yyyy-MM-dd)", example="2021-01-01", required=true)
    private String promotionMoneyDateFrom;
    @ApiCloudField(value="超额奖励结束日期(yyyy-MM-dd)", example="2021-01-01", required=true)
    private String promotionMoneyDateTo;
    @ApiCloudField(value="超额奖励开始时间(HH:mm)", example="00:00", required=true)
    private String promotionMoneyTimeFrom;
    @ApiCloudField(value="超额奖励结束时间(HH:mm)", example="23:59", required=true)
    private String promotionMoneyTimeTo;
    @ApiCloudField(value="超额奖励是否仅适用会员卡", example="0", required=true)
    private Integer promotionMoneyCardOnly;
    @ApiCloudField(value="仅参与一次", example="true")
    private Boolean promotionMoneyCardOnce;
    @ApiCloudField(value="参与会员卡类型", example="")
    private List<CardTypeDTOModel> cardTypes;
    @ApiCloudField(value="会员等级", example="")
    private List<Long> promotionMoneyLevelIds;
    @ApiCloudField(value="超额奖励是否勾选星期一", example="1", required=true)
    private Integer promotionMoneyMonActived;
    @ApiCloudField(value="超额奖励是否勾选星期二", example="1", required=true)
    private Integer promotionMoneyTuesActived;
    @ApiCloudField(value="超额奖励是否勾选星期三", example="1", required=true)
    private Integer promotionMoneyWedActived;
    @ApiCloudField(value="超额奖励是否勾选星期四", example="1", required=true)
    private Integer promotionMoneyThursActived;
    @ApiCloudField(value="超额奖励是否勾选星期五", example="1", required=true)
    private Integer promotionMoneyFridayActived;
    @ApiCloudField(value="超额奖励是否勾选星期六", example="1", required=true)
    private Integer promotionMoneySatActived;
    @ApiCloudField(value="超额奖励是否勾选星期日", example="1", required=true)
    private Integer promotionMoneySunActived;
    @ApiCloudField(value="超额奖励最多特价样数", example="1", required=true)
    private Integer promotionItemCount;
    @ApiCloudField(value="消费金额条件", example="5.0", required=true)
    private BigDecimal promotionMoneyBillMoney;
    @ApiCloudField(value="超额奖励是否超额累加", example="0", required=true)
    private Integer promotionMoneyAppend;
    @ApiCloudField(value="每次最多奖励件数", example="1")
    private BigDecimal promotionMoneyEveryTimeMaxLimit;
    @ApiCloudField(value="促销商品不计入消费金额", example="true")
    private Boolean policyItemNoIn;
    @ApiCloudField(value="折扣类型( 指定商品、指定类别、全场)", example="指定商品", required=true)
    private String promotionMoneyAssignedType;
    @ApiCloudField(value="指定类别（类别编码逗号分隔）", example="[1030,1031]")
    private String promotionMoneyAssignedCategory;
    @ApiCloudField(value="促销方式：0 特价/ 1 折扣", example="0", required=true)
    private Integer promotionMoneyPriceType;
    @ApiCloudField(value="折扣率", example="0.5", required=true)
    private BigDecimal promotionMoneyDiscount;
    @ApiCloudField(value="参与促销（例外）商品明细(指定类别、全场为例外商品)", example="[434419404,434419407]")
    private List<Integer> itemNums;
    @ApiCloudField(value="参与促销（例外）商品明细(指定类别、全场为例外商品)(可以设置到分级明细)", example="")
    private List<PosVariantNumDTOModel> promotionMoneyItems;
    @ApiCloudField(value="促销档期id列表", example="")
    private List<Long> policyScheduleIds;
    @ApiCloudField(value="超额奖励明细(仅单品特价、单品折扣有效)", example="")
    private List<PolicyMoneySaveDetailDTOModel> promotionMoneyDetails;
    @ApiCloudField(value="例外商品模板列表", example="[207200000037]")
    private List<String> policyItemTemplateNos;
    @ApiCloudField(value="活动总单数限制(优先级高于门店单数限制)", example="1")
    private Integer promotionMoneyTotalLimit;
    @ApiCloudField(value="门店单数限制", example="1")
    private Integer promotionMoneyBranchLimit;
    @ApiCloudField(value="最多奖励件数", example="10.0")
    private BigDecimal promotionMoneyMaxQty;
    @ApiCloudField(value="外部单号", example="")
    private String promotionMoneyOutBillNo;
}
