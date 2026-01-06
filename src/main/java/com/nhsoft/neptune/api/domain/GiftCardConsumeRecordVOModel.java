package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * GiftCardConsumeRecordVO模型
 * 礼品卡消费记录VO
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class GiftCardConsumeRecordVOModel extends ApiCloudObject {

    @ApiCloudField(value="消费记录编号")
    private String consumeFid;
    @ApiCloudField(value="营业日")
    private String shiftTableBizday;
    @ApiCloudField(value="POS机id")
    private String terminalId;
    @ApiCloudField(value="消费时间")
    private String consumeTime;
    @ApiCloudField(value="卡id")
    private Long cardId;
    @ApiCloudField(value="用户id")
    private String customerId;
    @ApiCloudField(value="支付方式")
    private String paymentType;
    @ApiCloudField(value="来源")
    private String source;
    @ApiCloudField(value="关联单据号")
    private String relationOrderNo;
    @ApiCloudField(value="礼品卡原先余额")
    private BigDecimal previousBalance;
    @ApiCloudField(value="礼品卡原先赠送余额")
    private BigDecimal previousPresentBalance;
    @ApiCloudField(value="当次消费金额")
    private BigDecimal actualConsumeMoney;
    @ApiCloudField(value="总计消费金额")
    private BigDecimal totalConsumeMoney;
    @ApiCloudField(value="操作人")
    private String operator;
    @ApiCloudField(value="备注")
    private String memo;
    @ApiCloudField(value="班次号")
    private String shiftTableNum;
    @ApiCloudField(value="用户中心门店ID")
    private String branchId;
    @ApiCloudField(value="关联支付号")
    private String relationPaymentNo;
}
