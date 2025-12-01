package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * SupplierSettlementReadRequestDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class SupplierSettlementReadRequestDTOModel extends ApiCloudObject {

    @ApiCloudField(value="供应商结算单号", example="CP4344990002262", required=true)
    private String supplierSettlementNo;
}
