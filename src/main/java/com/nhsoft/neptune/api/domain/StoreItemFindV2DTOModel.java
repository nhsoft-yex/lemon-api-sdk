package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * StoreItemFindV2DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class StoreItemFindV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="门店编码", required=true)
    private Integer branchNum;
    @ApiCloudField(value="商品列表,根据逗号分隔", example="2201529020,2201529021")
    private String itemNums;
    @ApiCloudField(value="供应商列表,根据逗号分隔", example="1,2")
    private String supplierNums;
    @ApiCloudField(value="是否查询主供应商商品（true=主供应商商品，false=非主供应商商品，null=主供应商和非主供应商商品）", example="true")
    private Boolean supplierDefault;
}
