package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * FundPayLogVO模型
 * 支付流水
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class FundPayLogVOModel extends ApiCloudObject {

    @ApiCloudField(value="id", example="RC0102720250806000005-2643")
    private String id;
    @ApiCloudField(value="order_type", example="TRANSFER")
    private String orderType;
    @ApiCloudField(value="order_id", example="RC0102720250806000005")
    private String orderId;
    @ApiCloudField(value="log_type", example="TRANSFER")
    private String logType;
    @ApiCloudField(value="start_at")
    private String startAt;
    @ApiCloudField(value="end_at")
    private String endAt;
    @ApiCloudField(value="state", example="FAILED")
    private String state;
    @ApiCloudField(value="transaction_no", example="20200806160805")
    private String transactionNo;
    @ApiCloudField(value="msg", example="出账方和入账方非同一资金通道")
    private String msg;
    @ApiCloudField(value="amount", example="1")
    private String amount;
}
