package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * CardUserProxyDTO模型
 * 会员卡代理DTO
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CardUserProxyDTOModel extends ApiCloudObject {

    @ApiCloudField(value="卡Id", example="150200002")
    private String cardUserNum;
    @ApiCloudField(value="表面卡号", example="100000000666")
    private String cardPrintNum;
    @ApiCloudField(value="卡余额", example="1.0")
    private BigDecimal cardBalance;
    @ApiCloudField(value="卡积分值", example="1.0")
    private BigDecimal cardPoint;
    @ApiCloudField(value="手机号", example="185XXXXXXXX")
    private String cardPhone;
    @ApiCloudField(value="用户生日(yyyy-mm-dd)", example="2021-01-21")
    private String cardUserBirthDate;
    @ApiCloudField(value="卡介质", example="电子卡")
    private String cardUserType;
    @ApiCloudField(value="卡持有者姓名", example="姓名")
    private String cardUserCustName;
    @ApiCloudField(value="卡类型名称", example="电子卡")
    private String cardUserTypeName;
    @ApiCloudField(value="卡有效期", example="2030-01-01 00:00:00")
    private String cardUserDeadline;
    @ApiCloudField(value="卡类型编号", example="100")
    private String cardUserTypeCode;
    @ApiCloudField(value="卡类型价格级别", example="1")
    private Integer cardUserTypePriceLevel;
    @ApiCloudField(value="卡类型折扣", example="1.0")
    private BigDecimal cardUserTypeDiscount;
    @ApiCloudField(value="支付折扣", example="0.5")
    private BigDecimal cardUserPayDiscount;
    @ApiCloudField(value="卡类型生日折扣", example="0.5")
    private BigDecimal cardUserTypeBirthDiscount;
    @ApiCloudField(value="生日折扣类型", example="1")
    private Integer birthDiscountLevel;
    @ApiCloudField(value="地址", example="浙江省宁波市")
    private String cardUserAddress;
    @ApiCloudField(value="性别", example="男")
    private String cardUserCustSex;
    @ApiCloudField(value="证件类型", example="身份证")
    private String cardUserIdCardType;
    @ApiCloudField(value="证件号", example="4211XXXXXXXXXXXXXX")
    private String cardUserIdCardNum;
    @ApiCloudField(value="会员卡状态", example="初始化|启用")
    private String cardStateName;
    @ApiCloudField(value="累计付款", example="100.0")
    private BigDecimal cardUserTotalCash;
    @ApiCloudField(value="卡消费次数", example="1")
    private Integer cardUserConsumeCount;
    @ApiCloudField(value="刷卡总次数", example="1")
    private Integer cardUserBalanceCount;
    @ApiCloudField(value="累计发票", example="100.0")
    private BigDecimal cardUserTotalInvoice;
    @ApiCloudField(value="零钱包余额", example="100.0")
    private BigDecimal cardBalanceMoney;
    @ApiCloudField(value="是否启用零钱包余额", example="false")
    private Boolean cardUserChangeEnabled;
    @ApiCloudField(value="累计消费", example="100.0")
    private BigDecimal cardBalanceTotalConsume;
    @ApiCloudField(value="累计存款", example="100.0")
    private BigDecimal cardBalanceTotalDeposit;
    @ApiCloudField(value="累计储值赠送存款", example="100.0")
    private BigDecimal cardBalancePresentMoney;
    @ApiCloudField(value="卡存款次数", example="1")
    private Integer cardUserDepositCount;
    @ApiCloudField(value="卡发票次数", example="1")
    private Integer cardUserInvoiceCount;
    @ApiCloudField(value="发卡日期", example="2020-12-05 11:41:57")
    private String cardUserDate;
    @ApiCloudField(value="最低控制金额", example="1.0")
    private BigDecimal cardMinBalance;
    @ApiCloudField(value="会员优惠不予消费券同享", example="false")
    private Boolean discountWithoutCoupon;
    @ApiCloudField(value="(crm)会员优惠不予消费券同享", example="false")
    private Boolean discountWithoutCouponVip;
    @ApiCloudField(value="是否锁定", example="false")
    private Boolean cardUserLocked;
    @ApiCloudField(value="发卡门店", example="99")
    private Integer cardUserEnrollShop;
    @ApiCloudField(value="对应微信openId", example="oQ8Ihv6968CNwAWs5NXPuIZyxtII")
    private String openId;
    @ApiCloudField(value="会员密码（md5加密）", example="4db791aa58be4221992d7a7a53b06358")
    private String cardUserPassword;
    @ApiCloudField(value="企业名称", example="浙江乐檬")
    private String cardUserFirm;
    @ApiCloudField(value="会员ID", example="2072992036300012")
    private String customerId;
    @ApiCloudField(value="是否为默认卡（1：默认卡，2：非默认卡）", example="1")
    private Integer defaultCard;
    @ApiCloudField(value="卡类型是否启用", example="false")
    private Boolean cardValid;
    @ApiCloudField(value="仅发卡门店使用", example="false")
    private Boolean cardUseInEnrollShop;
    @ApiCloudField(value="储值卡初始化时间", example="2020-08-10 19:37:31")
    private String cardUserInitTime;
    @ApiCloudField(value="储值卡挂失天数（-1则表示卡未挂失）", example="1")
    private Integer cardLossDayNum;
    @ApiCloudField(value="会员卡是否可用", example="true")
    private Boolean enable;
}
