package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * SupplierPreSettlementDetailResponseDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class SupplierPreSettlementDetailResponseDTOModel extends ApiCloudObject {

    @ApiCloudField(value="供应商结算单号", example="CP4344990002262")
    private String supplierSettlementNo;
    @ApiCloudField(value="预付单据号", example="YF4344990000015")
    private String preSettlementNo;
    @ApiCloudField(value="本次结算金额（小数点2位）", example="100.0")
    private BigDecimal preSettlementDetailMoney;
}
