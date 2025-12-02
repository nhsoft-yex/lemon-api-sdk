package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * MemberCouponTypeOfflineInfoDTO模型
 * 券类型线下信息DTO
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class MemberCouponTypeOfflineInfoDTOModel extends ApiCloudObject {

    @ApiCloudField(value="兑换商品数量(商品券使用)")
    private BigDecimal deductAmount;
    @ApiCloudField(value="是否全部商品", example="true")
    private Boolean allItem;
    @ApiCloudField(value="指定分组", example="true")
    private List<String> categoryCodes;
    @ApiCloudField(value="全部商品和指定分组时存例外商品;指定商品时存允许折扣商品", example="true")
    private List<Integer> itemNums;
    @ApiCloudField(value="消费券支付方式 逗号间隔串", example="积分消费,储值卡")
    private String paymentTypes;
    @ApiCloudField(value="使用张数限制", example="1")
    private Integer ticketLimitAmount;
    @ApiCloudField(value="超额张数累加", example="true")
    private Boolean ticketLimitAmountLoop;
    @ApiCloudField(value="超量特价商品不支持抵扣(true为选中)", example="true")
    private Boolean policyPromotionQuantityCannotDiscount;
    @ApiCloudField(value="超额奖励商品不支持抵扣(true为选中)", example="true")
    private Boolean policyPromotionMoneyCannotDiscount;
    @ApiCloudField(value="超额折扣商品不支持抵扣(true为选中)", example="true")
    private Boolean policyDiscountCannotDiscount;
    @ApiCloudField(value="赠品促销商品不支持抵扣(true为选中)", example="true")
    private Boolean policyPresentCannotDiscount;
    @ApiCloudField(value="促销特价商品不支持抵扣(true为选中)", example="true")
    private Boolean exceptPromotionItems;
    @ApiCloudField(value="会员优惠互斥", example="true")
    private Boolean cannotUseWithCardDiscount;
    @ApiCloudField(value="手改价商品(false为选中)", example="false")
    private Boolean enableManualChangedDiscount;
    @ApiCloudField(value="不计入使用门槛-促销商品(true为选中)", example="false")
    private Boolean moneyExceptPromotionItems;
    @ApiCloudField(value="不计入使用门槛-手改价商品(false为选中)", example="false")
    private Boolean manualChangedIncludeMinMoney;
    @ApiCloudField(value="启用会员折上折", example="true")
    private Boolean enableCardFoldUp;
    @ApiCloudField(value="禁止手工录入", example="true")
    private Boolean noEntryByHand;
    @ApiCloudField(value="与其他券互斥", example="true")
    private Boolean ticketUsedSelf;
    @ApiCloudField(value="每日券限制数量")
    private Integer ticketDailyLimit;
    @ApiCloudField(value="积分兑券有效天数")
    private Integer ticketDefaultValidDay;
    @ApiCloudField(value="兑换几天后生效", example="1")
    private Integer ticketStartValidDays;
    @ApiCloudField(value="兑换积分值", example="1")
    private BigDecimal ticketPointValue;
    @ApiCloudField(value="discount_type")
    private Integer discountType;
    @ApiCloudField(value="是否全部商品", example="true")
    private Boolean doorsillAllItem;
    @ApiCloudField(value="门槛商品-指定类别", example="")
    private List<String> doorsillCategoryCodes;
    @ApiCloudField(value="门槛商品-例外类别", example="")
    private List<String> doorsillExceptCategoryCodes;
    @ApiCloudField(value="门槛商品-商品NUMS(全部商品和指定类别时存例外商品 指定商品时存允许折扣商品)", example="")
    private List<Integer> doorsillItemNums;
    @ApiCloudField(value="门槛商品-分级商品NUMS(全部商品和指定类别时存例外商品 指定商品时存允许折扣商品)", example="")
    private List<Integer> doorsillItemGradeNums;
}
