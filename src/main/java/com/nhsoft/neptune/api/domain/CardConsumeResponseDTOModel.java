package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * CardConsumeResponseDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CardConsumeResponseDTOModel extends ApiCloudObject {

    @ApiCloudField(value="消费流水号", example="2072992036300016")
    private String consumeFid;
    @ApiCloudField(value="门店编码", example="99")
    private Integer branchNum;
    @ApiCloudField(value="班次号", example="22001")
    private Integer shiftTableNum;
    @ApiCloudField(value="交班日期(yyyyMMdd)", example="20210221")
    private String shiftTableBizday;
    @ApiCloudField(value="卡编码", example="150200002")
    private String cardUserNum;
    @ApiCloudField(value="消费可获得积分", example="1.0")
    private BigDecimal consumePoint;
    @ApiCloudField(value="消费折扣", example="1.0")
    private BigDecimal consumeDiscount;
    @ApiCloudField(value="消费舍出", example="1.0")
    private BigDecimal consumeRound;
    @ApiCloudField(value="实际消费金额", example="1.0")
    private BigDecimal consumeMoney;
    @ApiCloudField(value="消费操作人", example="管理员")
    private String consumeOperator;
    @ApiCloudField(value="关联单据号", example="2072990000008")
    private String consumeBillNum;
    @ApiCloudField(value="备注", example="备注信息")
    private String consumeMemo;
    @ApiCloudField(value="消费设备号", example="C8-09-A8-B2-76-31")
    private String consumeMachine;
    @ApiCloudField(value="消费关联单号", example="207299203630600004")
    private String consumeOrderNo;
    @ApiCloudField(value="消费分类(1.pos消费2.线上消费.3ic卡消费)", example="1")
    private Integer consumeCategory;
    @ApiCloudField(value=" 消费类型", example="消费")
    private String consumeType;
    @ApiCloudField(value=" 消费前余额", example="1.0")
    private BigDecimal consumeBalance;
    @ApiCloudField(value=" 发票金额", example="1.0")
    private BigDecimal consumeInvoice;
    @ApiCloudField(value="消费时间", example="2021-01-21 00:00:00")
    private String consumeDate;
    @ApiCloudField(value=" 消费次数", example="1")
    private Integer consumeCount;
    @ApiCloudField(value=" 是否发送短信", example="false")
    private Boolean sendSmsFlag;
    @ApiCloudField(value="加密属性", example="lemon")
    private String consumeCrypt;
    @ApiCloudField(value="crm主键", example="2072992036300012")
    private String customerId;
    @ApiCloudField(value="卡类型编号", example="99")
    private String cardUserTypeCode;
    @ApiCloudField(value="卡类型名称", example="电子卡")
    private String cardUserTypeName;
    @ApiCloudField(value="表面卡号", example="100000000666")
    private String consumePrintedNum;
    @ApiCloudField(value="卡类型代码", example="99")
    private Integer consumeCardType;
    @ApiCloudField(value="消费赠送金额", example="2.0")
    private BigDecimal consumePresentMoney;
}
