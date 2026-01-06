package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PaymentOrderSaveDTO模型
 * 付款单保存
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PaymentOrderSaveDTOModel extends ApiCloudObject {

    @ApiCloudField(value="业务类型（储值卡|商品|业务费用|费用）", example="GOODS", required=true)
    private String businessType;
    @ApiCloudField(value="业务时间", example="2022-01-01 10:00:00", required=true)
    private String date;
    @ApiCloudField(value="目标单位ID", example="1", required=true)
    private String dstUnitId;
    @ApiCloudField(value="目标账号id", example="1", required=true)
    private String dstAccountId;
    @ApiCloudField(value="源账号id", example="1", required=true)
    private String srcAccountId;
    @ApiCloudField(value="外部单据号", example="PI43440000001")
    private String paymentOrderOutId;
    @ApiCloudField(value="手续费(小数2位)", example="0.0")
    private BigDecimal fee;
    @ApiCloudField(value="金额", example="100.0", required=true)
    private BigDecimal totalAmount;
    @ApiCloudField(value="结算方式", example="现金", required=true)
    private String settlementType;
    @ApiCloudField(value="金额锁定", example="true")
    private Boolean amountLock;
    @ApiCloudField(value="描述", example="描述信息")
    private String description;
    @ApiCloudField(value="退款收款单支付流水号")
    private String originOrderNo;
}
