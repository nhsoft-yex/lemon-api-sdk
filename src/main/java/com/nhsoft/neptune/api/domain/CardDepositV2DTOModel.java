package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * CardDepositV2DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CardDepositV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="卡存款单据编号", example="207299203430590001")
    private String depositFid;
    @ApiCloudField(value="门店编码", example="99")
    private Integer branchNum;
    @ApiCloudField(value="班次号", example="22001")
    private Integer shiftTableNum;
    @ApiCloudField(value="交班日期(yyyyMMdd)", example="20210221")
    private String shiftTableBizday;
    @ApiCloudField(value="卡编码", example="150200002")
    private String cardUserNum;
    @ApiCloudField(value="表面卡号", example="100000000666")
    private String cardPrintNum;
    @ApiCloudField(value="会员名称", example="张三")
    private String cardUserName;
    @ApiCloudField(value="会员手机号", example="15804789563")
    private String cardUserPhone;
    @ApiCloudField(value="付款金额", example="1.0")
    private BigDecimal depositCash;
    @ApiCloudField(value="存款金额", example="1.0")
    private BigDecimal depositMoney;
    @ApiCloudField(value="存款可获得积分", example="1.0")
    private BigDecimal depositPoint;
    @ApiCloudField(value="操作人", example="管理员")
    private String depositOperator;
    @ApiCloudField(value="存款类型", example="存款")
    private String depositType;
    @ApiCloudField(value="存款支付方式名称（储值类型）", example="现金")
    private String depositPaymentTypeName;
    @ApiCloudField(value="存款支付银行名称", example="中国银行")
    private String depositBankName;
    @ApiCloudField(value="参考单据号", example="2072990000008")
    private String depositBillref;
    @ApiCloudField(value="备注", example="备注信息")
    private String depositMemo;
    @ApiCloudField(value="存款电子银行", example="1")
    private Integer accountBankNum;
    @ApiCloudField(value="存款设备号", example="C8-09-A8-B2-76-31")
    private String depositMachine;
    @ApiCloudField(value="付款前余额(查询参数)", example="1.0")
    private BigDecimal depositBalance;
    @ApiCloudField(value="存款时间(查询参数)", example="2020-09-17 16:24:25")
    private String depositDate;
    @ApiCloudField(value="存款次数(查询参数)", example="1")
    private Integer depositCount;
    @ApiCloudField(value="是否反存款成功", example="false")
    private Boolean depositRepealed;
    @ApiCloudField(value="卡类型编号", example="99")
    private String cardUserTypeCode;
    @ApiCloudField(value="卡类型名称", example="电子卡")
    private String cardUserTypeName;
    @ApiCloudField(value="微信提醒的openId", example="oQ8Ihv6968CNwAWs5NXPuIZyxtII")
    private String openId;
    @ApiCloudField(value="推卡人", example="推卡人")
    private String depositSeller;
    @ApiCloudField(value="已结算标记", example="false")
    private Boolean depositSettlementFlag;
    @ApiCloudField(value="消费卡储值类别(电子钱包,IC卡钱包)", example="IC卡钱包")
    private String depositCategoryName;
    @ApiCloudField(value="消费卡储值类别(1-电子钱包,3-IC卡钱包)", example="3")
    private Integer depositCategoryNum;
    @ApiCloudField(value="发票金额", example="1.0")
    private BigDecimal depositInvoice;
    @ApiCloudField(value="赠送金额", example="20.0")
    private BigDecimal depositPresentMoney;
    @ApiCloudField(value="第三方交易流水", example="A207201222274810001")
    private String depositPayNo;
    @ApiCloudField(value="存款来源", example="会员卡充值")
    private String depositSource;
}
