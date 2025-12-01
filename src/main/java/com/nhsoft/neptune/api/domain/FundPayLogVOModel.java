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

    @ApiCloudField(value="支付流水ID", example="RC0102720250806000005-2643")
    private String id;
    @ApiCloudField(value="单据类型", example="RECEIPT_ORDER")
    private String orderType;
    @ApiCloudField(value="单据ID", example="RC0102720250806000005")
    private String orderId;
    @ApiCloudField(value="支付流水类型", example="TRANSFER")
    private String logType;
    @ApiCloudField(value="支付开始时间")
    private String startAt;
    @ApiCloudField(value="支付结束时间")
    private String endAt;
    @ApiCloudField(value="支付状态", example="FAILED")
    private String state;
    @ApiCloudField(value="第三方支付流水号", example="20200806160805")
    private String transactionNo;
    @ApiCloudField(value="支付错误信息", example="出账方和入账方非同一资金通道")
    private String msg;
    @ApiCloudField(value="金额", example="1")
    private String amount;
}
