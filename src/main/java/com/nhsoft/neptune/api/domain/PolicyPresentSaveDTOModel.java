package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PolicyPresentSaveDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PolicyPresentSaveDTOModel extends ApiCloudObject {

    @ApiCloudField(value="申请门店编码", example="1", required=true)
    private Integer branchNum;
    @ApiCloudField(value="活动名称", example="活动名称")
    private String policyPresentName;
    @ApiCloudField(value="赠送类型（买1赠1|买1赠N|买N赠1|买N免M）", example="买N赠1", required=true)
    private String policyPresentType;
    @ApiCloudField(value="应用门店编码列表", example="[1,2]", required=true)
    private List<Integer> branchNums;
    @ApiCloudField(value="是否例外门店", example="false")
    private Boolean exceptBranch;
    @ApiCloudField(value="操作人", example="管理员", required=true)
    private String policyPresentOperator;
    @ApiCloudField(value="赠品促销备注", example="备注信息")
    private String policyPresentMemo;
    @ApiCloudField(value="赠品促销开始日期(yyyy-MM-dd)", example="2021-01-01", required=true)
    private String policyPresentDateFrom;
    @ApiCloudField(value="赠品促销结束日期(yyyy-MM-dd)", example="2021-01-01", required=true)
    private String policyPresentDateTo;
    @ApiCloudField(value="赠品促销开始时间(HH:mm)", example="00:00", required=true)
    private String policyPresentTimeFrom;
    @ApiCloudField(value="赠品促销结束时间(HH:mm)", example="23:59", required=true)
    private String policyPresentTimeTo;
    @ApiCloudField(value="赠品促销是否仅适用会员卡", example="0", required=true)
    private Integer policyPresentCardOnly;
    @ApiCloudField(value="参与会员卡类型", example="")
    private List<CardTypeDTOModel> cardTypes;
    @ApiCloudField(value="赠品促销是否勾选星期一", example="1", required=true)
    private Integer policyPresentMonActived;
    @ApiCloudField(value="赠品促销是否勾选星期二", example="1", required=true)
    private Integer policyPresentTuesActived;
    @ApiCloudField(value="赠品促销是否勾选星期三", example="1", required=true)
    private Integer policyPresentWedActived;
    @ApiCloudField(value="赠品促销是否勾选星期四", example="1", required=true)
    private Integer policyPresentThursActived;
    @ApiCloudField(value="赠品促销是否勾选星期五", example="1", required=true)
    private Integer policyPresentFridayActived;
    @ApiCloudField(value="赠品促销是否勾选星期六", example="1", required=true)
    private Integer policyPresentSatActived;
    @ApiCloudField(value="赠品促销是否勾选星期日", example="1", required=true)
    private Integer policyPresentSunActived;
    @ApiCloudField(value="赠品促销最多赠品件数", example="1", required=true)
    private Integer policyPresentItemCount;
    @ApiCloudField(value="促销商品编码", example="434419401")
    private Integer itemNum;
    @ApiCloudField(value="促销商品购买数量", example="5")
    private BigDecimal policyPresentSaleAmount;
    @ApiCloudField(value="促销商品免单数量", example="1")
    private BigDecimal policyPresentFreeAmount;
    @ApiCloudField(value="促销档期编号列表", example="[58]")
    private List<Long> policyScheduleIds;
    @ApiCloudField(value="等级类型", example="")
    private List<Long> policyPresentLevelIds;
    @ApiCloudField(value="例外日期", example="")
    private List<Integer> policyPresentExceptionDay;
    @ApiCloudField(value="是否设置商品数量上限", example="false")
    private Boolean policyPresentItemQuantityLimit;
    @ApiCloudField(value="促销范围(指定商品|指定类别|全场)", example="指定商品")
    private String policyPresentScope;
    @ApiCloudField(value="商品类别代码列表", example="")
    private List<String> policyPresentItemCategory;
    @ApiCloudField(value="例外商品(促销范围为指定类别、全场)", example="")
    private List<PosVariantNumDTOModel> policyPresentExceptItem;
    @ApiCloudField(value="赠品促销明细", example="")
    private List<PolicyPresentSaveDetailDTOModel> policyPresentDetails;
    @ApiCloudField(value="赠品促销明细(指定分级商品)", example="")
    private List<PolicyPresentSaveDetailWithGradeDTOModel> policyPresentDetailsWithGrade;
    @ApiCloudField(value="购买商品明细", example="")
    private List<PolicyPresentBuyDetailDTOModel> policyPresentBuyDetails;
    @ApiCloudField(value="赠送上限类型(单倍总量|按商品明细设置)", example="按商品明细设置")
    private String giftLimitType;
    @ApiCloudField(value="赠送上限数量")
    private BigDecimal giftLimitQuantity;
    @ApiCloudField(value="外部单号", example="")
    private String policyPresentOutBillNo;
}
