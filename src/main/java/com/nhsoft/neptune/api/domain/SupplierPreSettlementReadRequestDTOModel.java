package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * SupplierPreSettlementReadRequestDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class SupplierPreSettlementReadRequestDTOModel extends ApiCloudObject {

    @ApiCloudField(value="供应商预付单号", example="YF4344990002262", required=true)
    private String preSettlementNo;
}
