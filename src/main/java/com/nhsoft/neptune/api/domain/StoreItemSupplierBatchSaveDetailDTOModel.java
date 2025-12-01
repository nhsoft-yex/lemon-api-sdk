package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * StoreItemSupplierBatchSaveDetailDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class StoreItemSupplierBatchSaveDetailDTOModel extends ApiCloudObject {

    @ApiCloudField(value="商品编码", example="422123143", required=true)
    private Integer itemNum;
    @ApiCloudField(value="门店编码", example="99", required=true)
    private Integer branchNum;
    @ApiCloudField(value="约定价格(基本单位价格)", example="10.0", required=true)
    private BigDecimal storeItemSupplierCost;
    @ApiCloudField(value="是否主供应商", example="true")
    private Boolean storeItemSupplierDefault;
    @ApiCloudField(value="进项税率", example="0.1", required=true)
    private BigDecimal storeItemSupplierTax;
    @ApiCloudField(value="经营方式", example="购销", required=true)
    private String managementStyleType;
    @ApiCloudField(value="采购周期", example="10", required=true)
    private Integer storeItemSupplierPurchasePeriod;
    @ApiCloudField(value="起订量", example="10.0", required=true)
    private BigDecimal storeItemSupplierMin;
    @ApiCloudField(value="扣率", example="0.1", required=true)
    private BigDecimal grossRate;
    @ApiCloudField(value="特价扣率", example="0.1", required=true)
    private BigDecimal specialGrossRate;
    @ApiCloudField(value="优先级(非负整数，0优先级最高)", example="0", required=true)
    private Integer storeItemSupplierPri;
}
