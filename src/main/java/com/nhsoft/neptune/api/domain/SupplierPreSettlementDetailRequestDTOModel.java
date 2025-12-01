package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * SupplierPreSettlementDetailRequestDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class SupplierPreSettlementDetailRequestDTOModel extends ApiCloudObject {

    @ApiCloudField(value="预付单据号", example="YF4344990000015", required=true)
    private String preSettlementNo;
    @ApiCloudField(value="结算金额（小数点2位）", example="100.0", required=true)
    private BigDecimal preSettlementDetailMoney;
}
