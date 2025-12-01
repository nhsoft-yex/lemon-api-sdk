package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PosOrderPaymentSummaryVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PosOrderPaymentSummaryVOModel extends ApiCloudObject {

    @ApiCloudField(value="门店编码", example="1")
    private Integer branchNum;
    @ApiCloudField(value="营业日", example="20200101")
    private String shiftTableBizday;
    @ApiCloudField(value="支付方式", example="现金")
    private String paymentPayBy;
    @ApiCloudField(value="付款金额（小数点两位）", example="1.0")
    private BigDecimal paymentMoney;
}
