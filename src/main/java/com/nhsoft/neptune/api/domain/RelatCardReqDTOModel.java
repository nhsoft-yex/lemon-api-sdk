package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * RelatCardReqDTO模型
 * 储值卡续卡请求DTO
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class RelatCardReqDTOModel extends ApiCloudObject {

    @ApiCloudField(value="储值卡编码", example="100", required=true)
    private Integer relatCardCustNum;
    @ApiCloudField(value="续卡截止日期(yyyy-MM-dd HH:mm:ss)", required=true)
    private String relatCardNewDeadline;
    @ApiCloudField(value="操作人", example="管理员", required=true)
    private String relatCardOperator;
    @ApiCloudField(value="班次号", example="22001", required=true)
    private Integer shiftTableNum;
    @ApiCloudField(value="交班日期(yyyyMMdd)", example="20210221", required=true)
    private String shiftTableBizday;
    @ApiCloudField(value="门店编码", example="99", required=true)
    private Integer branchNum;
    @ApiCloudField(value="续卡金额(小数点两位)", example="1.0", required=true)
    private BigDecimal relatCardMoney;
    @ApiCloudField(value="续卡支付方式名称", example="现金", required=true)
    private String relatCardPaymentTypeName;
    @ApiCloudField(value="续卡备注", example="无")
    private String relatCardMemo;
    @ApiCloudField(value="续卡电子银行", example="5100515")
    private Integer accountBankNum;
    @ApiCloudField(value="续卡银行", example="宁波银行江北支行")
    private String relatCardBankName;
    @ApiCloudField(value="续卡设备号", example="C8-09-A8-B2-76-31")
    private String relatCardMachine;
    @ApiCloudField(value="参考单据号", example="2072990000008")
    private String relatCardBillref;
}
