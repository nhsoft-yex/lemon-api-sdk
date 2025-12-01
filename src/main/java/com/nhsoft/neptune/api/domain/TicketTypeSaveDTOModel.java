package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * TicketTypeSaveDTO模型
 * 消费券类型保存DTO
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class TicketTypeSaveDTOModel extends ApiCloudObject {

    @ApiCloudField(value="消费券名称", example="满30减20", required=true)
    private String ticketName;
    @ApiCloudField(value="消费券备注", example="消费券备注")
    private String ticketMemo;
    @ApiCloudField(value="消费券应用分类(购物抵用券，消费折扣券，会员卡储值券，商品券)", example="购物抵用券", required=true)
    private String ticketCategory;
    @ApiCloudField(value="消费券面值(当为折扣券时，该字段为最高抵用金额)", example="10.0", required=true)
    private BigDecimal ticketValue;
    @ApiCloudField(value="售价", example="20.0", required=true)
    private BigDecimal ticketSalePrice;
    @ApiCloudField(value="抵用商品数量(券类型为商品券时必填)", example="2")
    private BigDecimal deductAmount;
    @ApiCloudField(value="最低消费金额", example="50.0")
    private BigDecimal ticketLimitMoney;
    @ApiCloudField(value="折扣券折扣率", example="0.8")
    private BigDecimal ticketDiscountRate;
    @ApiCloudField(value="折扣券最低消费金额", example="20.0")
    private BigDecimal ticketDiscountLimitMoney;
    @ApiCloudField(value="应用于所有门店(和应用分店列表二选一必填)", example="true")
    private Boolean allBranch;
    @ApiCloudField(value="应用分店列表(和应用于所有门店二选一必填)", example="1")
    private List<Integer> branchNums;
    @ApiCloudField(value="支付方式", example="微信")
    private List<String> paymentTypes;
    @ApiCloudField(value="积分兑券比例", example="50.0")
    private BigDecimal ticketPointValue;
    @ApiCloudField(value="积分兑券默认有效天数", example="1")
    private Integer ticketDefaultValidDay;
    @ApiCloudField(value="积分兑券发券后几天后生效", example="1")
    private Integer ticketStartValidDays;
    @ApiCloudField(value="使用限制张数", example="2")
    private Integer ticketLimitAmount;
    @ApiCloudField(value="促销商品不计入最低消费金额", example="true")
    private Boolean moneyExceptPromotionItems;
    @ApiCloudField(value="促销特价商品不支持抵扣", example="true")
    private Boolean exceptPromotionItems;
    @ApiCloudField(value="超量特价商品不支持抵扣", example="true")
    private Boolean policyPromotionQuantityCannotDiscount;
    @ApiCloudField(value="超额奖励商品不支持抵扣", example="true")
    private Boolean policyPromotionMoneyCannotDiscount;
    @ApiCloudField(value="超额折扣商品不支持抵扣", example="true")
    private Boolean policyDiscountCannotDiscount;
    @ApiCloudField(value="不与会员折扣同享", example="true")
    private Boolean cannotUseWithCardDiscount;
    @ApiCloudField(value="手改商品支持抵扣", example="true")
    private Boolean enableManualChangedDiscount;
    @ApiCloudField(value="消费券超额张数累加", example="true")
    private Boolean ticketLimitAmountLoop;
    @ApiCloudField(value="不允许和其它消费券同时使用", example="true")
    private Boolean ticketUsedSelf;
    @ApiCloudField(value="前台不可手工录入", example="false")
    private Boolean noEntryByHand;
    @ApiCloudField(value="启用（默认为true）", example="true")
    private Boolean isActived;
    @ApiCloudField(value="赠品促销商品不支持抵扣", example="true")
    private Boolean policyPresentCannotDiscount;
    @ApiCloudField(value="手改商品金额参与消费券最低消费金额计算(默认为true)", example="true")
    private Boolean manualChangedIncludeMinMoney;
    @ApiCloudField(value="商品范围:全部商品", example="true")
    private Boolean allItem;
    @ApiCloudField(value="商品列表(选择全部商品和指定类别时添加例外商品，选择指定商品时添加允许抵扣商品)", example="20720001")
    private List<Integer> itemNums;
    @ApiCloudField(value="指定类别(类别代码列表)", example="002411")
    private List<String> categoryCodes;
    @ApiCloudField(value="支持会员折上折", example="true")
    private Boolean enableCardFoldUp;
}
