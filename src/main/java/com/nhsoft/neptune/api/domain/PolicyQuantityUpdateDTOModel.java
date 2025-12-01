package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PolicyQuantityUpdateDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PolicyQuantityUpdateDTOModel extends ApiCloudObject {

    @ApiCloudField(value="活动名称", example="活动名称")
    private String promotionQuantityName;
    @ApiCloudField(value="申请门店编码", example="99", required=true)
    private Integer branchNum;
    @ApiCloudField(value="应用门店编码列表", example="[1,2]", required=true)
    private List<Integer> branchNums;
    @ApiCloudField(value="是否例外门店", example="true")
    private Boolean exceptBranch;
    @ApiCloudField(value="操作人", example="管理员", required=true)
    private String promotionQuantityOperator;
    @ApiCloudField(value="超量特价备注", example="备注信息")
    private String promotionQuantityMemo;
    @ApiCloudField(value="超量特价开始日期(yyyy-MM-dd)", example="2021-01-01", required=true)
    private String promotionQuantityDateFrom;
    @ApiCloudField(value="超量特价结束日期(yyyy-MM-dd)", example="2021-01-01", required=true)
    private String promotionQuantityDateTo;
    @ApiCloudField(value="超量特价开始时间(HH:mm)", example="00:00", required=true)
    private String promotionQuantityTimeFrom;
    @ApiCloudField(value="超量特价结束时间(HH:mm)", example="23:59", required=true)
    private String promotionQuantityTimeTo;
    @ApiCloudField(value="超量特价是否仅适用会员卡", example="0", required=true)
    private Integer promotionQuantityCardOnly;
    @ApiCloudField(value="在会员折扣上折扣", example="true")
    private Boolean promotionQuantityCardFoldUp;
    @ApiCloudField(value="仅限参与一次", example="true")
    private Boolean promotionQuantityCardOnce;
    @ApiCloudField(value="参与会员卡类型", example="")
    private List<CardTypeDTOModel> cardTypes;
    @ApiCloudField(value="会员等级编号", example="207200000037")
    private List<String> levelIds;
    @ApiCloudField(value="商品类别编号列表(指定类别时生效)", example="")
    private List<String> promotionQuantityItemCategory;
    @ApiCloudField(value="供应商范围(指定供应商时生效)", example="")
    private List<Integer> supplierNums;
    @ApiCloudField(value="超量特价是否勾选星期一", example="1", required=true)
    private Integer promotionQuantityMonActived;
    @ApiCloudField(value="超量特价是否勾选星期二", example="1", required=true)
    private Integer promotionQuantityTuesActived;
    @ApiCloudField(value="超量特价是否勾选星期三", example="1", required=true)
    private Integer promotionQuantityWedActived;
    @ApiCloudField(value="超量特价是否勾选星期四", example="1", required=true)
    private Integer promotionQuantityThursActived;
    @ApiCloudField(value="超量特价是否勾选星期五", example="1", required=true)
    private Integer promotionQuantityFridayActived;
    @ApiCloudField(value="超量特价是否勾选星期六", example="1", required=true)
    private Integer promotionQuantitySatActived;
    @ApiCloudField(value="超量特价是否勾选星期日", example="1", required=true)
    private Integer promotionQuantitySunActived;
    @ApiCloudField(value="超量特价类型(单品超量特价、范围超量特价、偶数特价、阶梯范围超量特价)", example="单品超量特价", required=true)
    private String promotionQuantityType;
    @ApiCloudField(value="促销方式：0 特价/ 1 折扣", example="1", required=true)
    private Integer promotionQuantityPriceType;
    @ApiCloudField(value="超量特价折扣率", example="0.5")
    private BigDecimal promotionQuantityDiscount;
    @ApiCloudField(value="超量特价明细", example="")
    private List<PolicyQuantitySaveDetailDTOModel> promotionQuantityDetails;
    @ApiCloudField(value="超量特价明细(包含分级明细)", example="")
    private List<PolicyQuantitySaveDetailWithGradeDTOModel> promotionQuantityDetailsWithGrade;
    @ApiCloudField(value="阶梯范围", example="")
    private List<PolicyPromotionQuantityLadderDTOModel> promotionQuantityLadder;
    @ApiCloudField(value="促销档期编号列表", example="[58]")
    private List<Long> policyScheduleIds;
    @ApiCloudField(value="例外商品模板列表", example="[207200000037]")
    private List<String> policyItemTemplateNos;
    @ApiCloudField(value="折扣范围(指定商品|指定类别|指定供应商)", example="指定类别")
    private String promotionQuantityScopeType;
    @ApiCloudField(value="活动起始数量（仅范围超量特价生效）", example="10.0")
    private BigDecimal promotionQuantityMinAmount;
    @ApiCloudField(value="超量倍数累加（偶数特价不生效）", example="true")
    private Boolean promotionQuantityAppend;
    @ApiCloudField(value="按阶梯享受特价", example="false")
    private Boolean promotionQuantityLadderSpecialPrice;
    @ApiCloudField(value="例外日期", example="")
    private List<Integer> promotionQuantityExceptionDay;
    @ApiCloudField(value="例外商品", example="")
    private List<PosVariantNumDTOModel> promotionQuantityExceptItem;
    @ApiCloudField(value="外部单号", example="")
    private String promotionQuantityOutBillNo;
    @ApiCloudField(value="超量特价单据号", example="4344990000611", required=true)
    private String promotionQuantityNo;
}
