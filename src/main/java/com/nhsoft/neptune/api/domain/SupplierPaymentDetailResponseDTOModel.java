package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * SupplierPaymentDetailResponseDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class SupplierPaymentDetailResponseDTOModel extends ApiCloudObject {

    @ApiCloudField(value="付款编号", example="SP2072990000035")
    private String paymentNo;
    @ApiCloudField(value="序号", example="1")
    private Integer paymentDetailNum;
    @ApiCloudField(value="settlement")
    private SupplierSettlementResponseDTOModel settlement;
    @ApiCloudField(value="pre_settlement")
    private SupplierPreSettlementResponseDTOModel preSettlement;
    @ApiCloudField(value="明细付款金额", example="-120.0")
    private BigDecimal settlementPaymentDetailMoney;
    @ApiCloudField(value="明细折扣金额", example="0.0")
    private BigDecimal settlementPaymentDetailDiscountMoney;
}
