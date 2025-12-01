package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PolicyDiscountSaveDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PolicyDiscountSaveDTOModel extends ApiCloudObject {

    @ApiCloudField(value="申请门店编码", example="1", required=true)
    private Integer branchNum;
    @ApiCloudField(value="应用门店编码列表", example="[1, 2, 3]", required=true)
    private List<Integer> branchNums;
    @ApiCloudField(value="活动名称", example="c")
    private String policyDiscountName;
    @ApiCloudField(value="操作人", example="管理员", required=true)
    private String policyDiscountOperator;
    @ApiCloudField(value="超额折扣备注", example="备注信息")
    private String policyDiscountMemo;
    @ApiCloudField(value="超额折扣开始日期(yyyy-MM-dd)", example="Fri Jan 01 08:00:00 CST 2021", required=true)
    private String policyDiscountDateFrom;
    @ApiCloudField(value="超额折扣结束日期(yyyy-MM-dd)", example="Fri Jan 01 08:00:00 CST 2021", required=true)
    private String policyDiscountDateTo;
    @ApiCloudField(value="超额折扣开始时间(HH:mm)", example="00:00", required=true)
    private String policyDiscountTimeFrom;
    @ApiCloudField(value="超额折扣结束时间(HH:mm)", example="23:59", required=true)
    private String policyDiscountTimeTo;
    @ApiCloudField(value="超额折扣是否仅适用会员卡", example="1", required=true)
    private Integer policyDiscountCardOnly;
    @ApiCloudField(value="会员仅限参与一次", example="true")
    private Boolean policyDiscountCardOnce;
    @ApiCloudField(value="在会员折扣上折扣", example="true")
    private Boolean policyDiscountCardFoldUp;
    @ApiCloudField(value="促销商品不计入消费金额", example="false")
    private Boolean policyItemNoIn;
    @ApiCloudField(value="参与会员卡类型(和policy_discount_card_only搭配使用)", example="")
    private List<CardTypeDTOModel> cardTypes;
    @ApiCloudField(value="会员等级ID列表(和policy_discount_card_only搭配使用)", example="")
    private List<Long> policyDiscountLevelIds;
    @ApiCloudField(value="超额折扣是否勾选星期一", example="1", required=true)
    private Integer policyDiscountMonActived;
    @ApiCloudField(value="超额折扣是否勾选星期二", example="1", required=true)
    private Integer policyDiscountTuesActived;
    @ApiCloudField(value="超额折扣是否勾选星期三", example="1", required=true)
    private Integer policyDiscountWedActived;
    @ApiCloudField(value="超额折扣是否勾选星期四", example="1", required=true)
    private Integer policyDiscountThursActived;
    @ApiCloudField(value="超额折扣是否勾选星期五", example="1", required=true)
    private Integer policyDiscountFridayActived;
    @ApiCloudField(value="超额折扣是否勾选星期六", example="1", required=true)
    private Integer policyDiscountSatActived;
    @ApiCloudField(value="超额折扣是否勾选星期日", example="1", required=true)
    private Integer policyDiscountSunActived;
    @ApiCloudField(value="超额折扣消费金额(超额类型为超额折扣、超额减免时，该字段必填)", example="5.0")
    private BigDecimal policyDiscountBillMoney;
    @ApiCloudField(value="折扣类型(指定商品、指定类别、全场)", example="指定商品", required=true)
    private String policyDiscountAssignedType;
    @ApiCloudField(value="超额类型(超额折扣、超额减免、阶梯超额减免)", example="超额折扣", required=true)
    private String policyDiscountType;
    @ApiCloudField(value="指定类别（类别编码逗号分隔）", example="1012,1013")
    private String policyDiscountAssignedCategory;
    @ApiCloudField(value="超额折扣减免金额(超额类型为超额减免时，该字段必填)", example="5.0")
    private BigDecimal policyDiscountDiscountMoney;
    @ApiCloudField(value="在会员价基础上减免", example="false")
    private Boolean policyDiscountCardFoldUpMoney;
    @ApiCloudField(value="超额折扣单笔最高减免", example="5.0")
    private BigDecimal policyDiscountTotalDiscount;
    @ApiCloudField(value="超额折扣折扣率(超额类型为超额折扣时，该字段必填)", example="0.5")
    private BigDecimal policyDiscountDiscount;
    @ApiCloudField(value="例外日期", example="")
    private List<Integer> policyDiscountExceptionDay;
    @ApiCloudField(value="指定类别、全场为例外商品,指定商品为对应商品", example="[10110073,10110074]")
    private List<Integer> policyDiscountDetails;
    @ApiCloudField(value="重复类型(每日|每月|每年)", example="每日")
    private String policyDiscountRepeatType;
    @ApiCloudField(value="重复截止日期")
    private String policyDiscountRepeatEnd;
    @ApiCloudField(value="是否例外门店", example="true")
    private Boolean exceptBranch;
    @ApiCloudField(value="例外商品模板列表", example="[207200000037]")
    private List<String> policyItemTemplateNos;
    @ApiCloudField(value="阶梯(超额类型为阶梯超额减免时,该字段必填)", example="")
    private List<PolicyDiscountLadderDTOModel> policyDiscountLadder;
    @ApiCloudField(value="促销档期id列表", example="")
    private List<Long> policyScheduleIds;
    @ApiCloudField(value="指定类别、全场为例外商品,指定商品为对应商品(可以指定到分级明细)", example="")
    private List<PolicyDiscountDetailSaveDTOModel> policyDiscountWithGradeDetails;
    @ApiCloudField(value="外部单号", example="")
    private String policyDiscountOutBillNo;
}
