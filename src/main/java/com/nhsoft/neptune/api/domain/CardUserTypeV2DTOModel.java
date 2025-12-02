package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * CardUserTypeV2DTO模型
 * 会员卡类型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CardUserTypeV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="类型编号", example="")
    private String typeCode;
    @ApiCloudField(value="类型名称", example="")
    private String typeName;
    @ApiCloudField(value="默认有效天数")
    private Integer typeDefaultDays;
    @ApiCloudField(value="是否永久", example="false")
    private Boolean typeDefaultPermanent;
    @ApiCloudField(value="价格级别")
    private Integer typePriceLevel;
    @ApiCloudField(value="折扣", example="1.0")
    private BigDecimal typeDiscount;
    @ApiCloudField(value="是否支持储值", example="false")
    private Boolean typeSupportDeposit;
    @ApiCloudField(value="是否支持积分", example="false")
    private Boolean typeSupportPoint;
    @ApiCloudField(value="存款积分比例", example="1.0")
    private BigDecimal typeDepositRate;
    @ApiCloudField(value="消费积分比例", example="1.0")
    private BigDecimal typeConsumeRate;
    @ApiCloudField(value="仅发卡门店使用", example="false")
    private Boolean useInEnrollShop;
    @ApiCloudField(value="存款基数", example="1.0")
    private BigDecimal depositBasic;
    @ApiCloudField(value="生日折扣", example="1.0")
    private BigDecimal birthDiscount;
    @ApiCloudField(value="会员卡卡号颜色", example="")
    private String cardUserTypeImageId;
    @ApiCloudField(value="图片路径", example="")
    private String cardUserTypeImagePath;
    @ApiCloudField(value="最低控制金额", example="1.0")
    private BigDecimal cardMinBalance;
    @ApiCloudField(value="使用会员卡支付不享受折扣", example="false")
    private Boolean disablePayDiscount;
    @ApiCloudField(value="是否允许线上挂失会员卡", example="false")
    private Boolean typeSupportOnlineLoss;
    @ApiCloudField(value="会员卡支付折扣", example="1.0")
    private BigDecimal cardPayDiscount;
    @ApiCloudField(value="会员卡支付折扣级别")
    private Integer cardPayDiscountLevel;
    @ApiCloudField(value="会员卡结算折扣")
    private BigDecimal settlementDiscount;
    @ApiCloudField(value="会员优惠不与消费券同享", example="false")
    private Boolean discountWithoutCoupon;
    @ApiCloudField(value="卡号颜色", example="")
    private String typePrintedColor;
    @ApiCloudField(value="是否启用", example="false")
    private Boolean typeValid;
    @ApiCloudField(value="point_rule")
    private PointRuleV2DTOModel pointRule;
    @ApiCloudField(value="生日折扣类型")
    private Integer birthDiscountLevel;
    @ApiCloudField(value="卡内余额限额")
    private BigDecimal maxCardMoney;
    @ApiCloudField(value="单笔存款限额")
    private BigDecimal maxSingleStore;
}
