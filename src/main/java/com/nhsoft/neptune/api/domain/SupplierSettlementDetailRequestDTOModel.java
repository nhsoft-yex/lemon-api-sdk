package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * SupplierSettlementDetailRequestDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class SupplierSettlementDetailRequestDTOModel extends ApiCloudObject {

    @ApiCloudField(value="其他收支单号", example="OP4344990010424")
    private String otherInoutBillNo;
    @ApiCloudField(value="收货单号", example="PI4344020000069")
    private String receiveOrderFid;
    @ApiCloudField(value="退货单号", example="RO2003990000001")
    private String returnOrderFid;
    @ApiCloudField(value="扣补单号", example="434401000021")
    private String makeUpOrderFid;
    @ApiCloudField(value="结算金额（小数点2位）", example="100.0", required=true)
    private BigDecimal supplierSettlementDetailMoney;
    @ApiCloudField(value="折扣金额（小数点2位）", example="1.0", required=true)
    private BigDecimal supplierSettlementDetailDiscount;
    @ApiCloudField(value="备注", example="备注信息")
    private String supplierSettlementDetailMemo;
}
