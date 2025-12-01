package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ReceiptPayLogSaveDTO模型
 * 收款支付明细保存
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ReceiptPayLogSaveDTOModel extends ApiCloudObject {

    @ApiCloudField(value="支付明细序号", example="RC0000820220727000005-9051", required=true)
    private String payLogId;
    @ApiCloudField(value="支付状态(支付成功|支付失败|支付中)", example="支付成功", required=true)
    private String payState;
    @ApiCloudField(value="第三方流水号", example="104718146822322072714342912788")
    private String transactionNo;
    @ApiCloudField(value="付款时间", example="2022-07-27 14:45:01", required=true)
    private String payTime;
    @ApiCloudField(value="金额", example="9.6", required=true)
    private BigDecimal amount;
}
