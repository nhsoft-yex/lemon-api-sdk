package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * CardReplaceResponseVO模型
 * 储值卡换卡响应
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CardReplaceResponseVOModel extends ApiCloudObject {

    @ApiCloudField(value="换卡记录编号", example="12000")
    private String replaceCardFid;
    @ApiCloudField(value="储值卡编码", example="2055")
    private Integer replaceCardCustNum;
    @ApiCloudField(value="原表面卡号", example="50067")
    private String replaceCardOldPrintedNum;
    @ApiCloudField(value="原物理卡号", example="50067")
    private String replaceCardOldPhysicalNum;
    @ApiCloudField(value="原卡有效期")
    private String replaceCardOldDeadline;
    @ApiCloudField(value="新卡有效期")
    private String replaceCardNewDeadline;
    @ApiCloudField(value="新表面卡号", example="900000002627")
    private String replaceCardNewPrintedNum;
    @ApiCloudField(value="新物理卡号", example="13038759297")
    private String replaceCardNewPhysicalNum;
    @ApiCloudField(value="操作人", example="管理员")
    private String replaceCardOperator;
    @ApiCloudField(value="换卡金额(小数点两位)", example="1.0")
    private BigDecimal replaceCardMoney;
    @ApiCloudField(value="门店编码", example="1")
    private Integer branchNum;
    @ApiCloudField(value="换卡门店名称", example="测试门店1")
    private String replaceCardBranchName;
    @ApiCloudField(value="换卡备注")
    private String replaceCardMemo;
    @ApiCloudField(value="换卡支付方式编码", example="1")
    private Integer replaceCardPaymentType;
    @ApiCloudField(value="换卡支付方式名称", example="现金")
    private String replaceCardPaymentTypeName;
    @ApiCloudField(value="换卡电子银行", example="230300")
    private Integer accountBankNum;
    @ApiCloudField(value="换卡设备号", example="C8-09-A8-B2-76-31")
    private String replaceCardMachine;
    @ApiCloudField(value="换卡银行", example="宁波银行江北支行")
    private String repalceCardBankName;
    @ApiCloudField(value="参考单据号", example="2072990000008")
    private String replaceCardBillref;
    @ApiCloudField(value="班次号", example="22001")
    private Integer shiftTableNum;
    @ApiCloudField(value="交班日期(yyyyMMdd)", example="20210221")
    private String shiftTableBizday;
    @ApiCloudField(value="换卡时间")
    private String replaceCardOperateTime;
}
