package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PosOrderPaymentSaveDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PosOrderPaymentSaveDTOModel extends ApiCloudObject {

    @ApiCloudField(value="payment_no")
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
}
