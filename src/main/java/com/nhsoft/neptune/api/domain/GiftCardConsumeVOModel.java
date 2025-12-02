package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * GiftCardConsumeVO模型
 * 礼品卡消费VO
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class GiftCardConsumeVOModel extends ApiCloudObject {

    @ApiCloudField(value="消费单号", example="20250310")
    private String consumeFid;
    @ApiCloudField(value="营业日")
    private String shiftTableBizday;
    @ApiCloudField(value="销售终端ID", example="")
    private String terminalId;
    @ApiCloudField(value="消费时间")
    private String consumeTime;
    @ApiCloudField(value="卡Id", example="1", required=true)
    private Long cardId;
    @ApiCloudField(value="来源", example="WECHAT_OFFICIAL", required=true)
    private String source;
    @ApiCloudField(value="关联单号", example="", required=true)
    private String relationOrderNo;
    @ApiCloudField(value="消费总金额", example="100", required=true)
    private BigDecimal totalConsumeMoney;
    @ApiCloudField(value="操作人", example="营业员")
    private String operator;
    @ApiCloudField(value="备注", example="")
    private String memo;
    @ApiCloudField(value="班次号", example="")
    private String shiftTableNum;
    @ApiCloudField(value="用户中心门店ID", example="1", required=true)
    private Integer branchId;
    @ApiCloudField(value="乐檬零售线下门店编号", example="1")
    private Integer branchNum;
    @ApiCloudField(value="客户ID", example="")
    private String customerId;
    @ApiCloudField(value="关联支付号", example="")
    private String relationPaymentNo;
}
