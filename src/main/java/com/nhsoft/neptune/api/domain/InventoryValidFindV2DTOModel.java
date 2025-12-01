package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * InventoryValidFindV2DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class InventoryValidFindV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="门店编码", example="1", required=true)
    private Integer branchNum;
    @ApiCloudField(value="仓库编码", example="207200001")
    private Integer storehouseNum;
    @ApiCloudField(value="单位类型", example="基本单位或采购单位等", required=true)
    private String unitType;
    @ApiCloudField(value="商品编码列表", example="43440001", required=true)
    private List<Integer> itemNums;
}
