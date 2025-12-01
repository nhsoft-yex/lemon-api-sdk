package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * InventoryExternalOccupySaveDetailDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class InventoryExternalOccupySaveDetailDTOModel extends ApiCloudObject {

    @ApiCloudField(value="商品编号", required=true)
    private Integer itemNum;
    @ApiCloudField(value="占用库存数量", required=true)
    private BigDecimal inventoryOccupyAmount;
    @ApiCloudField(value="批次编号", example="")
    private String lotNumber;
    @ApiCloudField(value="占用库存常用数量")
    private BigDecimal inventoryExternalOccupyUseQty;
    @ApiCloudField(value="占用库存常用单位", example="")
    private String inventoryExternalOccupyUseUnit;
}
