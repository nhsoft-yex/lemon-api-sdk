package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PolicyPromotionSaveDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PolicyPromotionSaveDTOModel extends ApiCloudObject {

    @ApiCloudField(value="活动名称", example="测试活动")
    private String policyPromotionName;
    @ApiCloudField(value="申请门店编码", example="1", required=true)
    private Integer branchNum;
    @ApiCloudField(value="应用门店编码列表(空为所有门店)", example="[1, 2]")
    private List<Integer> branchNums;
    @ApiCloudField(value="是否例外门店", example="true")
    private Boolean exceptBranch;
    @ApiCloudField(value="操作人", example="管理员", required=true)
    private String policyPromotionOperator;
    @ApiCloudField(value="促销特价备注", example="备注信息")
    private String policyPromotionMemo;
    @ApiCloudField(value="促销特价开始日期（yyyy-MM-dd）", example="Fri Jan 01 08:00:00 CST 2021", required=true)
    private String policyPromotionDateFrom;
    @ApiCloudField(value="促销特价结束日期（yyyy-MM-dd）", example="Fri Jan 01 08:00:00 CST 2021", required=true)
    private String policyPromotionDateTo;
    @ApiCloudField(value="促销特价开始时间（HH:mm）", example="00:00", required=true)
    private String policyPromotionTimeFrom;
    @ApiCloudField(value="促销特价结束时间（HH:mm）", example="23:59", required=true)
    private String policyPromotionTimeTo;
    @ApiCloudField(value="例外日期", example="")
    private List<Integer> policyPromotionExceptionDays;
    @ApiCloudField(value="促销特价是否仅适用会员卡", example="1", required=true)
    private Integer policyPromotionCardOnly;
    @ApiCloudField(value="仅企微群群友参加", example="true")
    private Boolean policyPromotionWecomCustomerOnly;
    @ApiCloudField(value="参与会员卡类型", example="")
    private List<CardTypeDTOModel> cardTypes;
    @ApiCloudField(value="星期一是否生效", example="1", required=true)
    private Integer policyPromotionMonActived;
    @ApiCloudField(value="星期二是否生效", example="1", required=true)
    private Integer policyPromotionTuesActived;
    @ApiCloudField(value="星期三是否生效", example="1", required=true)
    private Integer policyPromotionWedActived;
    @ApiCloudField(value="星期四是否生效", example="1", required=true)
    private Integer policyPromotionThursActived;
    @ApiCloudField(value="星期五是否生效", example="1", required=true)
    private Integer policyPromotionFridayActived;
    @ApiCloudField(value="星期六是否生效", example="1", required=true)
    private Integer policyPromotionSatActived;
    @ApiCloudField(value="星期日是否生效", example="1", required=true)
    private Integer policyPromotionSunActived;
    @ApiCloudField(value="促销特价特价类型（单品特价、单品折扣、类别折扣、全场折扣、品牌折扣）", example="单品特价", required=true)
    private String policyPromotionPosCategory;
    @ApiCloudField(value="促销特价折扣率", example="0.5", required=true)
    private BigDecimal policyPromotionDiscount;
    @ApiCloudField(value="促销特价商品类别", example="11|进口水果,999901|生鲜")
    private String policyPromotionItemCategory;
    @ApiCloudField(value="促销特价商品品牌", example="品牌一,品牌二")
    private String policyPromotionItemBrand;
    @ApiCloudField(value="单数限制", example="1", required=true)
    private Integer policyPromotionTotalLimit;
    @ApiCloudField(value="在促销价基础上结算折扣券", example="true")
    private Boolean specialPriceWithDiscountCoupon;
    @ApiCloudField(value="返利类型(1:供应商返利,2:总部返利)", example="1")
    private Integer policyPromotionType;
    @ApiCloudField(value="例外商品明细编号", example="[433452342,433657341]")
    private List<Integer> policyPromotionExceptItems;
    @ApiCloudField(value="例外商品明细编号(分级商品维度)", example="")
    private List<PosVariantNumDTOModel> policyPromotionExceptItemsWithGrade;
    @ApiCloudField(value="促销特价明细", example="")
    private List<PolicyPromotionSaveDetailDTOModel> policyPromotionDetails;
    @ApiCloudField(value="促销期间所有会员卡不启用支付折扣", example="1")
    private Integer policyPromotionDisablePayDiscount;
    @ApiCloudField(value="每个会员单品活动限量", example="1.0")
    private BigDecimal policyPromotionCustomerItemLimit;
    @ApiCloudField(value="每张会员卡仅参与一次", example="1")
    private Integer policyPromotionCardOnce;
    @ApiCloudField(value="在会员折扣上折扣", example="true")
    private Boolean policyPromotionCardFoldUp;
    @ApiCloudField(value="重复类型（每年|每月|每日）", example="每日")
    private String policyPromotionRepeatType;
    @ApiCloudField(value="重复结束日期,null时永远不要", example="2023-04-07")
    private String policyPromotionRepeatEnd;
    @ApiCloudField(value="会员等级编号", example="207200000037")
    private List<String> levelIds;
    @ApiCloudField(value="促销档期id列表", example="")
    private List<Long> policyScheduleIds;
    @ApiCloudField(value="例外商品模板列表", example="[207200000037]")
    private List<String> policyItemTemplateNos;
    @ApiCloudField(value="销售单小票显示活动名称标记", example="false")
    private Boolean policyPromotionTicketShowName;
    @ApiCloudField(value="外部单号", example="")
    private String policyPromotionOutBillNo;
}
