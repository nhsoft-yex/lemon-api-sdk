package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ReceiptPayLogVO模型
 * 支付明细
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ReceiptPayLogVOModel extends ApiCloudObject {

    @ApiCloudField(value="支付明细序号", example="RC0000820220728000001-0933")
    private String payLogId;
    @ApiCloudField(value="第三方支付流水号", example="104718146822322072714342912788")
    private String transactionNo;
    @ApiCloudField(value="支付状态", example="支付成功|支付失败|支付中")
    private String payState;
    @ApiCloudField(value="支付时间")
    private String payTime;
    @ApiCloudField(value="金额", example="9.95")
    private BigDecimal amount;
}
