package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PosOrderFindV2VO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PosOrderFindV2VOModel extends ApiCloudObject {

    @ApiCloudField(value="单据号", example="B696103180420017")
    private String orderNo;
    @ApiCloudField(value="门店编码", example="1")
    private Integer branchNum;
    @ApiCloudField(value="客户编码", example="100")
    private String clientFid;
    @ApiCloudField(value="会员卡编码", example="100")
    private Integer cardUserNum;
    @ApiCloudField(value="会员卡表面卡号", example="100000000634")
    private String cardPrintedNum;
    @ApiCloudField(value="会员卡名称", example="会员卡名称")
    private String cardUserName;
    @ApiCloudField(value="会员手机号", example="18058533900")
    private String orderCardPhone;
    @ApiCloudField(value="开单时间", example="2021-01-19 00:00:00")
    private String orderDate;
    @ApiCloudField(value="销售员", example="管理员")
    private String orderSoldBy;
    @ApiCloudField(value="营业日", example="20221105")
    private String shiftTableBizday;
    @ApiCloudField(value="班次号")
    private Integer shiftTableNum;
    @ApiCloudField(value="单据来源", example="社群团购")
    private String orderSource;
    @ApiCloudField(value="单据总额（小数点2位）", example="10.0")
    private BigDecimal orderTotalMoney;
    @ApiCloudField(value="税额", example="1.0")
    private BigDecimal orderTaxMoney;
    @ApiCloudField(value="折扣金额（小数点2位）", example="1.0")
    private BigDecimal orderDiscountMoney;
    @ApiCloudField(value="单据积分值（小数点2位）", example="1.0")
    private BigDecimal orderPoint;
    @ApiCloudField(value="应收金额（小数点2位）", example="10.0")
    private BigDecimal orderPaymentMoney;
    @ApiCloudField(value="不含税金额（小数点2位）", example="10.0")
    private BigDecimal orderNoTaxMoney;
    @ApiCloudField(value="经理折扣（小数点2位）", example="1.0")
    private BigDecimal orderMgrDiscountMoney;
    @ApiCloudField(value="四舍五入金额（小数点2位）", example="0.5")
    private BigDecimal orderRound;
    @ApiCloudField(value="佣金提成（小数点2位）", example="0.5")
    private BigDecimal orderCommission;
    @ApiCloudField(value="收银员", example="管理员")
    private String orderOperator;
    @ApiCloudField(value="单据状态代码", example="1")
    private Integer orderStateCode;
    @ApiCloudField(value="单据状态名称", example="制单")
    private String orderStateName;
    @ApiCloudField(value="点单时间", example="2021-01-19 00:00:00")
    private String orderOperatorTime;
    @ApiCloudField(value="结账时间", example="2021-01-19 00:00:00")
    private String orderTime;
    @ApiCloudField(value="设备MAC地址", example="A0-C5-89-51-68-23")
    private String orderMachine;
    @ApiCloudField(value="关联单号", example="4200000063201802057497542368")
    private String orderRefBillno;
    @ApiCloudField(value="外部关联单号", example="A9918034145711UC")
    private String orderExternalNo;
    @ApiCloudField(value="备注", example="备注信息")
    private String orderMemo;
    @ApiCloudField(value="运费金额", example="10.0")
    private BigDecimal orderPostFee;
    @ApiCloudField(value="促销折扣金额", example="10.0")
    private BigDecimal orderPromotionDiscountMoney;
    @ApiCloudField(value="仓库编码", example="2072001")
    private Integer storehouseNum;
    @ApiCloudField(value="最后上传时间", example="2021-01-19 00:00:00")
    private String orderLastEditTime;
    @ApiCloudField(value="券抵扣金额", example="20.0")
    private BigDecimal orderCouponTotalMoney;
    @ApiCloudField(value="券面值", example="20.0")
    private BigDecimal orderCouponPaymentMoney;
    @ApiCloudField(value="单据明细", example="")
    private List<PosOrderFindDetailV2DTOModel> details;
    @ApiCloudField(value="支付明细", example="")
    private List<PosPaymentsFindV2DTOModel> payments;
    @ApiCloudField(value="消费券明细", example="")
    private List<PosCouponDetailV2DTOModel> couponDetails;
    @ApiCloudField(value="会员编号")
    private Long orderCustomerId;
}
