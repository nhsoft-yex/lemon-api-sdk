package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * InventoryDailyItemV2DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class InventoryDailyItemV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="商品编码", example="434400001")
    private Object itemNum;
    @ApiCloudField(value="商品名称", example="苹果")
    private String itemName;
    @ApiCloudField(value="基本数量", example="10.0")
    private BigDecimal inventoryDailyQty;
    @ApiCloudField(value="辅助数量", example="0.0")
    private BigDecimal inventoryDailyAssistQty;
    @ApiCloudField(value="金额", example="2000.0")
    private BigDecimal inventoryDailyMoney;
}
