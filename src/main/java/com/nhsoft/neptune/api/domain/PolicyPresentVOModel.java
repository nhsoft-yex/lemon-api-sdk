package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PolicyPresentVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PolicyPresentVOModel extends ApiCloudObject {

    @ApiCloudField(value="赠送类型（买1赠1|买1增N|买N赠1|买N增M）", example="买N赠1")
    private String policyPresentType;
    @ApiCloudField(value="赠品促销单据号", example="4344990000365")
    private String policyPresentNo;
    @ApiCloudField(value="活动名称", example="活动名称")
    private String policyPresentName;
    @ApiCloudField(value="申请门店编码", example="99")
    private Integer branchNum;
    @ApiCloudField(value="应用门店列表", example="")
    private List<BranchSimpleDTOModel> branchs;
    @ApiCloudField(value="赠品促销创建人", example="管理员")
    private String policyPresentCreator;
    @ApiCloudField(value="赠品促销创建时间", example="2021-01-01 00:00:00")
    private String policyPresentCreateTime;
    @ApiCloudField(value="赠品促销审核人", example="管理员")
    private String policyPresentAuditor;
    @ApiCloudField(value="赠品促销审核时间", example="2021-01-01 00:00:00")
    private String policyPresentAuditTime;
    @ApiCloudField(value="赠品促销最后修改时间", example="2021-01-01 00:00:00")
    private String policyPresentLastEditTime;
    @ApiCloudField(value="赠品促销最后修改人", example="管理员")
    private String policyPresentLastEditor;
    @ApiCloudField(value="赠品促销作废时间", example="2021-01-01 00:00:00")
    private String policyPresentCancelTime;
    @ApiCloudField(value="赠品促销作废人", example="管理员")
    private String policyPresentCancelOperator;
    @ApiCloudField(value="状态编码", example="1")
    private Integer policyPresentStateCode;
    @ApiCloudField(value="状态名称", example="制单")
    private String policyPresentStateName;
    @ApiCloudField(value="赠品促销备注", example="备注信息")
    private String policyPresentMemo;
    @ApiCloudField(value="赠品促销开始日期(yyyy-MM-dd)", example="2020-01-01")
    private String policyPresentDateFrom;
    @ApiCloudField(value="赠品促销结束日期(yyyy-MM-dd)", example="2020-01-01")
    private String policyPresentDateTo;
    @ApiCloudField(value="赠品促销开始时间(HH:mm)", example="00:00")
    private String policyPresentTimeFrom;
    @ApiCloudField(value="赠品促销结束时间(HH:mm)", example="23:59")
    private String policyPresentTimeTo;
    @ApiCloudField(value="赠品促销是否仅适用会员卡", example="0")
    private Integer policyPresentCardOnly;
    @ApiCloudField(value="参与会员卡类型", example="")
    private List<CardTypeDTOModel> cardTypes;
    @ApiCloudField(value="赠品促销是否勾选星期一", example="1")
    private Integer policyPresentMonActived;
    @ApiCloudField(value="赠品促销是否勾选星期二", example="1")
    private Integer policyPresentTuesActived;
    @ApiCloudField(value="赠品促销是否勾选星期三", example="1")
    private Integer policyPresentWedActived;
    @ApiCloudField(value="赠品促销是否勾选星期四", example="1")
    private Integer policyPresentThursActived;
    @ApiCloudField(value="赠品促销是否勾选星期五", example="1")
    private Integer policyPresentFridayActived;
    @ApiCloudField(value="赠品促销是否勾选星期六", example="1")
    private Integer policyPresentSatActived;
    @ApiCloudField(value="赠品促销是否勾选星期日", example="1")
    private Integer policyPresentSunActived;
    @ApiCloudField(value="赠品促销最多赠品件数", example="1")
    private Integer policyPresentItemCount;
    @ApiCloudField(value="促销商品编码", example="434419401")
    private Integer itemNum;
    @ApiCloudField(value="促销商品购买数量", example="8")
    private BigDecimal policyPresentSaleAmount;
    @ApiCloudField(value="促销商品免单数量", example="1")
    private BigDecimal policyPresentFreeAmount;
    @ApiCloudField(value="赠品促销明细", example="")
    private List<PolicyPresentDetailVOModel> policyPresentDetails;
    @ApiCloudField(value="赠品购买明细", example="")
    private List<PolicyPresentBuyDetailVOModel> policyPresentBuyDetails;
    @ApiCloudField(value="促销档期", example="58")
    private Long policyScheduleId;
    @ApiCloudField(value="促销档期编号列表", example="[58]")
    private List<Long> policyScheduleIds;
    @ApiCloudField(value="是否例外门店", example="false")
    private Boolean exceptBranch;
    @ApiCloudField(value="等级类型", example="")
    private List<Long> policyPresentLevelIds;
    @ApiCloudField(value="例外日期", example="")
    private List<Integer> policyPresentExceptionDay;
    @ApiCloudField(value="是否设置商品数量上限", example="false")
    private Boolean policyPresentItemQuantityLimit;
    @ApiCloudField(value="促销范围(指定商品|指定类别|全场)", example="指定商品")
    private String policyPresentScope;
    @ApiCloudField(value="商品类别(促销范围为指定类别)", example="")
    private List<String> policyPresentItemCategory;
    @ApiCloudField(value="例外商品(促销范围为指定类别、全场)", example="")
    private List<PosVariantNumDTOModel> policyPresentExceptItem;
    @ApiCloudField(value="赠送上限类型(单倍总量|商品明细)", example="")
    private String giftLimitType;
    @ApiCloudField(value="赠送上限数量")
    private BigDecimal giftLimitQuantity;
    @ApiCloudField(value="外部单号", example="")
    private String policyPresentOutBillNo;
}
