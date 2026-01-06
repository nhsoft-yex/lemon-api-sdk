package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * TicketTypeV2VO模型
 * 券类型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class TicketTypeV2VOModel extends ApiCloudObject {

    @ApiCloudField(value="消费券代码", example="0001")
    private String ticketCode;
    @ApiCloudField(value="消费券名称", example="打折券")
    private String ticketName;
    @ApiCloudField(value="是否启用", example="true")
    private Boolean actived;
    @ApiCloudField(value="消费券应用分类", example="购物抵用券")
    private String ticketCategory;
    @ApiCloudField(value="消费券面值 | 折扣券最高抵用金额", example="50")
    private BigDecimal ticketValue;
    @ApiCloudField(value="消费券最低消费金额 | 折扣券折扣率", example="100")
    private BigDecimal ticketLimitMoney;
    @ApiCloudField(value="商品券抵用数量", example="1")
    private BigDecimal deductAmount;
    @ApiCloudField(value="折扣券最低消费金额", example="20")
    private BigDecimal ticketDiscountLimitMoney;
    @ApiCloudField(value="消费券售价", example="20")
    private BigDecimal ticketSalePrice;
    @ApiCloudField(value="使用限制张数", example="1")
    private Integer ticketLimitAmount;
    @ApiCloudField(value="积分换券比例(0表示不支持兑换)", example="10")
    private BigDecimal ticketPointValue;
    @ApiCloudField(value="积分兑券有效期天数", example="0")
    private Integer ticketDefaultValidDay;
    @ApiCloudField(value="积分兑券发券后几天后生效（0天表示当天生效，1天表示第二天00:00生效，以此类推，有效天数计算时包括生效的第一天）", example="0")
    private Integer ticketStartValidDays;
    @ApiCloudField(value="应用门店列表")
    private List<TicketBranchV2DTOModel> branchs;
    @ApiCloudField(value="适用商品范围", example="[2500,25100]")
    private List<Integer> itemNums;
    @ApiCloudField(value="消费券备注", example="消费券备注")
    private String ticketMemo;
    @ApiCloudField(value="折扣券折扣率", example="0.8")
    private BigDecimal ticketDiscountRate;
    @ApiCloudField(value="应用于所有门店(和应用分店列表二选一必填)", example="true")
    private Boolean allBranch;
    @ApiCloudField(value="支付方式", example="微信,支付宝")
    private List<String> paymentTypes;
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
    @ApiCloudField(value="赠品促销商品不支持抵扣", example="true")
    private Boolean policyPresentCannotDiscount;
    @ApiCloudField(value="手改商品金额参与消费券最低消费金额计算(默认为true)", example="true")
    private Boolean manualChangedIncludeMinMoney;
    @ApiCloudField(value="商品范围:全部商品", example="true")
    private Boolean allItem;
    @ApiCloudField(value="指定类别(类别代码列表)", example="002411")
    private List<String> categoryCodes;
    @ApiCloudField(value="支持会员折上折", example="true")
    private Boolean enableCardFoldUp;
    @ApiCloudField(value="discount_type")
    private Integer discountType;
    @ApiCloudField(value="doorsill_all_item")
    private Boolean doorsillAllItem;
    @ApiCloudField(value="doorsill_category_codes")
    private List<String> doorsillCategoryCodes;
    @ApiCloudField(value="doorsill_except_category_codes")
    private List<String> doorsillExceptCategoryCodes;
    @ApiCloudField(value="doorsill_item_nums")
    private List<Integer> doorsillItemNums;
    @ApiCloudField(value="doorsill_item_grade_nums")
    private List<Integer> doorsillItemGradeNums;
}
