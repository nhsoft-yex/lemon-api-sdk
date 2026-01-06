package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * InventoryOrderDetailSaveDTO模型
 * 调整单明细
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class InventoryOrderDetailSaveDTOModel extends ApiCloudObject {

    @ApiCloudField(value="明细编号", example="1")
    private Integer detailNum;
    @ApiCloudField(value="调整数量(整数，向下取整)", example="1", required=true)
    private Integer amount;
    @ApiCloudField(value="商品编码", required=true)
    private Integer productId;
    @ApiCloudField(value="规格id", required=true)
    private String variantId;
}
