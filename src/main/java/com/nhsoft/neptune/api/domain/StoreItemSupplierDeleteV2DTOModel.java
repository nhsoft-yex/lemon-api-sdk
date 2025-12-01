package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * StoreItemSupplierDeleteV2DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class StoreItemSupplierDeleteV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="供应商编码", example="1", required=true)
    private Integer supplierNum;
    @ApiCloudField(value="商品编码", example="422123143", required=true)
    private Integer itemNum;
    @ApiCloudField(value="门店编码", example="99", required=true)
    private Integer branchNum;
}
