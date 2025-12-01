package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PurchaseOrderReadV3DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PurchaseOrderReadV3DTOModel extends ApiCloudObject {

    @ApiCloudField(value="采购订单号(和外部流水号二选一)", example="PO2030990000001")
    private String purchaseOrderFid;
    @ApiCloudField(value="外部流水号(和采购订单号二选一)", example="A0001")
    private String purchaseOrderBillNo;
}
