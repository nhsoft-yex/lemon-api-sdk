package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * InventoryValidV2DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class InventoryValidV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="商品编码", example="43440001")
    private Integer itemNum;
    @ApiCloudField(value="库存数量", example="10.0")
    private BigDecimal inventoryAmount;
    @ApiCloudField(value="库存常用数量", example="1.0")
    private BigDecimal inventoryUseAmount;
    @ApiCloudField(value="库存可用数量", example="10.0")
    private BigDecimal inventoryValidAmount;
    @ApiCloudField(value="库存可用常用数量", example="1.0")
    private BigDecimal inventoryValidUseAmount;
}
