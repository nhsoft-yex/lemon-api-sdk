package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PolicyPromotionVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PolicyPromotionVOModel extends ApiCloudObject {

    @ApiCloudField(value="促销单号", example="4344990000521")
    private String policyPromotionNo;
    @ApiCloudField(value="活动名称", example="测试活动")
    private String policyPromotionName;
    @ApiCloudField(value="申请门店编码", example="1")
    private Integer branchNum;
    @ApiCloudField(value="应用门店列表", example="")
    private List<BranchSimpleDTOModel> branchs;
    @ApiCloudField(value="促销特价创建时间", example="2021-01-01 00:00:00")
    private String policyPromotionCreateTime;
    @ApiCloudField(value="促销特价创建人", example="管理员")
    private String policyPromotionCreator;
    @ApiCloudField(value="促销特价最后修改时间", example="2021-01-01 00:00:00")
    private String policyPromotionLastEditTime;
    @ApiCloudField(value="促销特价最后修改人", example="管理员")
    private String policyPromotionLastEditor;
    @ApiCloudField(value="促销特价审核时间", example="2021-01-01 00:00:00")
    private String policyPromotionAuditTime;
    @ApiCloudField(value="促销特价审核人", example="管理员")
    private String policyPromotionAuditor;
    @ApiCloudField(value="促销特价作废时间", example="2021-01-01 00:00:00")
    private String policyPromotionCancelTime;
    @ApiCloudField(value="促销特价作废人", example="管理员")
    private String policyPromotionCancelOperator;
    @ApiCloudField(value="状态编码", example="1")
    private Integer policyPromotionStateCode;
    @ApiCloudField(value="状态名称", example="制单")
    private String policyPromotionStateName;
    @ApiCloudField(value="促销特价备注", example="备注信息")
    private String policyPromotionMemo;
    @ApiCloudField(value="促销特价开始日期（yyyy-MM-dd）", example="2021-01-01")
    private String policyPromotionDateFrom;
    @ApiCloudField(value="促销特价结束日期（yyyy-MM-dd）", example="2021-01-01")
    private String policyPromotionDateTo;
    @ApiCloudField(value="促销特价开始时间（HH:mm）", example="00:00")
    private String policyPromotionTimeFrom;
    @ApiCloudField(value="促销特价结束时间（HH:mm）", example="23:59")
    private String policyPromotionTimeTo;
    @ApiCloudField(value="例外日期", example="[12]")
    private List<Integer> policyPromotionExceptionDays;
    @ApiCloudField(value="促销特价是否仅适用会员卡", example="1")
    private Integer policyPromotionCardOnly;
    @ApiCloudField(value="促销期间所有会员卡不启用支付折扣", example="1")
    private Integer policyPromotionDisablePayDiscount;
    @ApiCloudField(value="每张会员卡仅参与一次", example="1")
    private Integer policyPromotionCardOnce;
    @ApiCloudField(value="仅企微群群友参加", example="false")
    private Boolean policyPromotionWecomCustomerOnly;
    @ApiCloudField(value="在会员折扣上折扣", example="false")
    private Boolean policyPromotionCardFoldUp;
    @ApiCloudField(value="例外商品明细编号", example="")
    private List<PosVariantNumDTOModel> policyPromotionExceptItemsWithGrade;
    @ApiCloudField(value="参与会员卡类型", example="")
    private List<CardTypeDTOModel> cardTypes;
    @ApiCloudField(value="星期一是否生效", example="1")
    private Integer policyPromotionMonActived;
    @ApiCloudField(value="星期二是否生效", example="1")
    private Integer policyPromotionTuesActived;
    @ApiCloudField(value="星期三是否生效", example="1")
    private Integer policyPromotionWedActived;
    @ApiCloudField(value="星期四是否生效", example="1")
    private Integer policyPromotionThursActived;
    @ApiCloudField(value="星期五是否生效", example="1")
    private Integer policyPromotionFridayActived;
    @ApiCloudField(value="星期六是否生效", example="1")
    private Integer policyPromotionSatActived;
    @ApiCloudField(value="星期日是否生效", example="1")
    private Integer policyPromotionSunActived;
    @ApiCloudField(value="促销特价特价类型（单品特价、单品折扣、类别折扣、全场折扣）", example="单品特价")
    private String policyPromotionPosCategory;
    @ApiCloudField(value="促销特价折扣率", example="1")
    private BigDecimal policyPromotionDiscount;
    @ApiCloudField(value="促销特价商品品牌", example="")
    private String policyPromotionItemBrand;
    @ApiCloudField(value="促销特价商品类别", example="超量特价")
    private String policyPromotionItemCategory;
    @ApiCloudField(value="单数限制", example="1")
    private Integer policyPromotionTotalLimit;
    @ApiCloudField(value="每个会员单品活动限量", example="1")
    private BigDecimal policyPromotionCustomerItemLimit;
    @ApiCloudField(value="返利类型(1:供应商返利,2:总部返利)", example="1")
    private Integer policyPromotionType;
    @ApiCloudField(value="例外商品明细编号", example="[432234556,432215673]")
    private List<Integer> policyPromotionExceptItems;
    @ApiCloudField(value="是否设置会员特价", example="true")
    private Boolean policyPromotionMemberSpecialPrice;
    @ApiCloudField(value="是否例外门店", example="true")
    private Boolean exceptBranch;
    @ApiCloudField(value="在促销价基础上结算折扣券", example="false")
    private Boolean specialPriceWithDiscountCoupon;
    @ApiCloudField(value="销售单小票显示活动名称标记", example="true")
    private Boolean policyPromotionTicketShowName;
    @ApiCloudField(value="促销特价明细", example="")
    private List<PolicyPromotionDetailVOModel> policyPromotionDetails;
    @ApiCloudField(value="重复类型（每年|每月|每日）", example="1")
    private String policyPromotionRepeatType;
    @ApiCloudField(value="重复结束日期,null时永远不要", example="2023-04-07")
    private String policyPromotionRepeatEnd;
    @ApiCloudField(value="会员等级编号", example="207200000037")
    private List<String> levelIds;
    @ApiCloudField(value="促销商品模板编号", example="[]")
    private List<String> policyItemTemplateNos;
    @ApiCloudField(value="促销档期", example="58")
    private Long policyScheduleId;
    @ApiCloudField(value="促销档期编号列表", example="[58]")
    private List<Long> policyScheduleIds;
    @ApiCloudField(value="外部单号", example="")
    private String policyPromotionOutBillNo;
}
