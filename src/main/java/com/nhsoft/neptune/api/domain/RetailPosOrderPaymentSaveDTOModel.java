package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * RetailPosOrderPaymentSaveDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class RetailPosOrderPaymentSaveDTOModel extends ApiCloudObject {

    @ApiCloudField(value="支付编号(不填会自动生成)", example="")
    private String paymentNo;
    @ApiCloudField(value="收款方式(储值卡，微信支付，支付宝等)", example="储值卡", required=true)
    private String paymentPayBy;
    @ApiCloudField(value="付款金额（小数点2位）", example="1.0", required=true)
    private BigDecimal paymentReceive;
    @ApiCloudField(value="收款金额（小数点2位）", example="1.0", required=true)
    private BigDecimal paymentMoney;
    @ApiCloudField(value="参考单据号", example="A000001")
    private String paymentBillNo;
    @ApiCloudField(value="备注", example="备注信息")
    private String paymentMemo;
    @ApiCloudField(value="在线用户ID", example="")
    private String onlineUserId;
}
