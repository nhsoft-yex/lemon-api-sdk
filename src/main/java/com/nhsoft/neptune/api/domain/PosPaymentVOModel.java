package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PosPaymentVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PosPaymentVOModel extends ApiCloudObject {

    @ApiCloudField(value="收款方式(储值卡，微信支付，支付宝等)", example="储值卡")
    private String paymentPayBy;
    @ApiCloudField(value="付款金额（小数点2位）", example="1.0")
    private BigDecimal paymentReceive;
    @ApiCloudField(value="收款金额（小数点2位）", example="1.0")
    private BigDecimal paymentMoney;
    @ApiCloudField(value="参考单据号", example="A000001")
    private String paymentBillNo;
    @ApiCloudField(value="备注", example="备注信息")
    private String paymentMemo;
    @ApiCloudField(value="渠道", example="POS消费")
    private String paymentAcctNo;
    @ApiCloudField(value="在线用户ID", example="")
    private String onlineUserId;
}
