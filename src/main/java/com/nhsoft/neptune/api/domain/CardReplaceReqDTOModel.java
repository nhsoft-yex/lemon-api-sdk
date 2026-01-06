package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * CardReplaceReqDTO模型
 * 储值卡换卡请求参数
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CardReplaceReqDTOModel extends ApiCloudObject {

    @ApiCloudField(value="储值卡编码", example="2055", required=true)
    private Integer replaceCardCustNum;
    @ApiCloudField(value="新表面卡号", example="900000002627", required=true)
    private String replaceCardNewPrintedNum;
    @ApiCloudField(value="旧表面卡号（仅当储值卡为IC卡时必填）", example="20215613151651")
    private String replaceCardOldPrintedNum;
    @ApiCloudField(value="新物理卡号", example="13038759297", required=true)
    private String replaceCardNewPhysicalNum;
    @ApiCloudField(value="操作人", example="管理员", required=true)
    private String replaceCardOperator;
    @ApiCloudField(value="换卡金额(小数点两位)", example="1.0", required=true)
    private BigDecimal replaceCardMoney;
    @ApiCloudField(value="门店编码", required=true)
    private Integer branchNum;
    @ApiCloudField(value="换卡备注")
    private String replaceCardMemo;
    @ApiCloudField(value="换卡支付方式名称", example="现金", required=true)
    private String replaceCardPaymentTypeName;
    @ApiCloudField(value="换卡电子银行", example="230300")
    private Integer accountBankNum;
    @ApiCloudField(value="换卡设备号", example="C8-09-A8-B2-76-31")
    private String replaceCardMachine;
    @ApiCloudField(value="换卡银行", example="宁波银行江北支行")
    private String repalceCardBankName;
    @ApiCloudField(value="参考单据号", example="2072990000008")
    private String replaceCardBillref;
    @ApiCloudField(value="班次号", example="22001", required=true)
    private Integer shiftTableNum;
    @ApiCloudField(value="交班日期(yyyyMMdd)", example="20210221", required=true)
    private String shiftTableBizday;
}
