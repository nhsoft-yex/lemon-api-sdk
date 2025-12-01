package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * InventoryLnDetailV2DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class InventoryLnDetailV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="仓库编码")
    private Integer storehouseNum;
    @ApiCloudField(value="序号")
    private Integer inventoryLnDetailNum;
    @ApiCloudField(value="商品编码")
    private Integer itemNum;
    @ApiCloudField(value="批次号", example="")
    private String inventoryLnDetailLotNumber;
    @ApiCloudField(value="基本数量")
    private BigDecimal inventoryLnDetailAmount;
    @ApiCloudField(value="成本单价")
    private BigDecimal inventoryLnDetailCostPrice;
    @ApiCloudField(value="初始入库数量")
    private BigDecimal inventoryLnDetailInitAmount;
    @ApiCloudField(value="辅助数量")
    private BigDecimal inventoryLnDetailAssistAmount;
    @ApiCloudField(value="初始辅助数量")
    private BigDecimal inventoryLnDetailInitAssistAmount;
    @ApiCloudField(value="换算率")
    private BigDecimal inventoryLnDetailUseRate;
    @ApiCloudField(value="库存单位", example="")
    private String inventoryLnDetailUseUnit;
    @ApiCloudField(value="数量")
    private BigDecimal inventoryLnDetailUseAmount;
    @ApiCloudField(value="生产日期", example="")
    private String inventoryLnDetailProducingDate;
}
