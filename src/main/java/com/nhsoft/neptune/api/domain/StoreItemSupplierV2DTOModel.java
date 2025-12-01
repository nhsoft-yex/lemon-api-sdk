package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * StoreItemSupplierV2DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class StoreItemSupplierV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="供应商编码", example="1")
    private Integer supplierNum;
    @ApiCloudField(value="商品编码", example="422123143")
    private Integer itemNum;
    @ApiCloudField(value="门店编码", example="99")
    private Integer branchNum;
    @ApiCloudField(value="优先级", example="0")
    private Integer storeItemSupplierPri;
    @ApiCloudField(value="起订量", example="50.0")
    private BigDecimal storeItemSupplierMin;
    @ApiCloudField(value="约定价格", example="10.0")
    private BigDecimal storeItemSupplierCost;
    @ApiCloudField(value="最大价格", example="15.0")
    private BigDecimal storeItemSupplierMaxPrice;
    @ApiCloudField(value="最小价格", example="5.0")
    private BigDecimal storeItemSupplierMinPrice;
    @ApiCloudField(value="最近进价", example="5.0")
    private BigDecimal storeItemSupplierLastestPrice;
    @ApiCloudField(value="是否主供应商", example="true")
    private Boolean storeItemSupplierDefault;
    @ApiCloudField(value="进项税率", example="0.1")
    private BigDecimal storeItemSupplierTax;
    @ApiCloudField(value="经营方式", example="")
    private String managementStyleType;
    @ApiCloudField(value="扣率", example="0.1")
    private BigDecimal grossRate;
    @ApiCloudField(value="特价扣率", example="0.1")
    private BigDecimal specialGrossRate;
    @ApiCloudField(value="合同单据号", example="")
    private String supplierAgreementNo;
    @ApiCloudField(value="采购周期")
    private Integer storeItemSupplierPurchasePeriod;
    @ApiCloudField(value="是否删除", example="false")
    private Boolean storeItemSupplierDelTag;
}
