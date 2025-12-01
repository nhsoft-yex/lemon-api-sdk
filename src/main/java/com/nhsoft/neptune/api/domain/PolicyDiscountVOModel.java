package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PolicyDiscountVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PolicyDiscountVOModel extends ApiCloudObject {

    @ApiCloudField(value="促销单号", example="4344990000458")
    private String policyDiscountNo;
    @ApiCloudField(value="促销活动名称", example="测试")
    private String policyDiscountName;
    @ApiCloudField(value="申请门店编码", example="1")
    private Integer branchNum;
    @ApiCloudField(value="应用门店列表", example="")
    private List<BranchSimpleDTOModel> branchs;
    @ApiCloudField(value="超额折扣创建时间", example="2021-01-01 00:00:00")
    private String policyDiscountCreateTime;
    @ApiCloudField(value="超额折扣创建人", example="管理员")
    private String policyDiscountCreator;
    @ApiCloudField(value="超额折扣审核时间", example="2021-01-01 00:00:00")
    private String policyDiscountAuditTime;
    @ApiCloudField(value="超额折扣审核人", example="管理员")
    private String policyDiscountAuditor;
    @ApiCloudField(value="超额折扣最后修改时间", example="2021-01-01 00:00:00")
    private String policyDiscountLastEditTime;
    @ApiCloudField(value="超额折扣最后修改人", example="管理员")
    private String policyDiscountLastEditor;
    @ApiCloudField(value="超额折扣作废时间", example="2021-01-01 00:00:00")
    private String policyDiscountCancelTime;
    @ApiCloudField(value="超额折扣作废人", example="管理员")
    private String policyDiscountCancelOperator;
    @ApiCloudField(value="状态编码", example="1")
    private Integer policyDiscountStateCode;
    @ApiCloudField(value="状态名称", example="制单")
    private String policyDiscountStateName;
    @ApiCloudField(value="超额折扣备注", example="备注信息")
    private String policyDiscountMemo;
    @ApiCloudField(value="超额折扣开始日期(yyyy-MM-dd)", example="2021-01-01")
    private String policyDiscountDateFrom;
    @ApiCloudField(value="超额折扣结束日期(yyyy-MM-dd)", example="2021-01-01")
    private String policyDiscountDateTo;
    @ApiCloudField(value="超额折扣开始时间(HH:mm)", example="00:00")
    private String policyDiscountTimeFrom;
    @ApiCloudField(value="超额折扣结束时间(HH:mm)", example="23:59")
    private String policyDiscountTimeTo;
    @ApiCloudField(value="超额折扣是否勾选星期一", example="1")
    private Integer policyDiscountMonActived;
    @ApiCloudField(value="超额折扣是否勾选星期二", example="1")
    private Integer policyDiscountTuesActived;
    @ApiCloudField(value="超额折扣是否勾选星期三", example="1")
    private Integer policyDiscountWedActived;
    @ApiCloudField(value="超额折扣是否勾选星期四", example="1")
    private Integer policyDiscountThursActived;
    @ApiCloudField(value="超额折扣是否勾选星期五", example="1")
    private Integer policyDiscountFridayActived;
    @ApiCloudField(value="超额折扣是否勾选星期六", example="1")
    private Integer policyDiscountSatActived;
    @ApiCloudField(value="超额折扣是否勾选星期日", example="1")
    private Integer policyDiscountSunActived;
    @ApiCloudField(value="超额折扣消费金额", example="5.0")
    private BigDecimal policyDiscountBillMoney;
    @ApiCloudField(value="超额折扣是否仅适用会员卡", example="1")
    private Integer policyDiscountCardOnly;
    @ApiCloudField(value="会员仅限参与一次", example="true")
    private Boolean policyDiscountCardOnce;
    @ApiCloudField(value="在会员折扣上折扣", example="true")
    private Boolean policyDiscountCardFoldUp;
    @ApiCloudField(value="促销商品不计入消费金额", example="true")
    private Boolean policyItemNoIn;
    @ApiCloudField(value="参与会员卡类型", example="")
    private List<CardTypeDTOModel> cardTypes;
    @ApiCloudField(value="会员等级列表", example="")
    private List<Long> policyDiscountLevelIds;
    @ApiCloudField(value="重复类型(每日|每月|每年)", example="每日")
    private String policyDiscountRepeatType;
    @ApiCloudField(value="重复截止日期", example="")
    private String policyDiscountRepeatEnd;
    @ApiCloudField(value="是否例外门店", example="true")
    private Boolean exceptBranch;
    @ApiCloudField(value="超额类型(超额折扣、超额减免)", example="超额折扣")
    private String policyDiscountType;
    @ApiCloudField(value="超额折扣折扣率", example="0.5")
    private BigDecimal policyDiscountDiscount;
    @ApiCloudField(value="折扣类型(指定商品、指定类别、全场)", example="指定商品")
    private String policyDiscountAssignedType;
    @ApiCloudField(value="指定类别（类别编码逗号分隔）", example="1012,1013")
    private String policyDiscountAssignedCategory;
    @ApiCloudField(value="促销档期", example="58")
    private Long policyScheduleId;
    @ApiCloudField(value="在会员价基础上减免", example="false")
    private Boolean policyDiscountCardFoldUpMoney;
    @ApiCloudField(value="超额折扣单笔最高减免", example="5.0")
    private BigDecimal policyDiscountTotalDiscount;
    @ApiCloudField(value="超额折扣减免金额", example="5.0")
    private BigDecimal policyDiscountDiscountMoney;
    @ApiCloudField(value="指定类别、全场为例外商品,指定商品为对应商品", example="[10110073,10110074]")
    private List<Integer> policyDiscountDetails;
    @ApiCloudField(value="指定类别、全场为例外商品,指定商品为对应商品(该字段包含分级商品)", example="")
    private List<PosVariantNumDTOModel> policyDiscountWithGradeDetails;
    @ApiCloudField(value="例外商品模板列表", example="[207200000037]")
    private List<String> policyItemTemplateNos;
    @ApiCloudField(value="返利类型", example="SUPPLIER")
    private String policyDiscountReturnType;
    @ApiCloudField(value="阶梯", example="")
    private List<PolicyDiscountLadderDTOModel> policyDiscountLadder;
    @ApiCloudField(value="促销档期编号列表", example="[58]")
    private List<Long> policyScheduleIds;
    @ApiCloudField(value="外部单号", example="")
    private String policyDiscountOutBillNo;
}
