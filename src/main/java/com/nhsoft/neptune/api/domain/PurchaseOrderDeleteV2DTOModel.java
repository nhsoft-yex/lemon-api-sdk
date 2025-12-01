package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PurchaseOrderDeleteV2DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PurchaseOrderDeleteV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="采购订单", example="PO43440000001", required=true)
    private String purchaseOrderFid;
}
