package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ProcessingOrderDetailV2DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ProcessingOrderDetailV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="商品编码", example="207210315")
    private Integer itemNum;
    @ApiCloudField(value="商品名称", example="多退少补3")
    private String itemName;
    @ApiCloudField(value="基本数量", example="200000.0")
    private BigDecimal itemQty;
    @ApiCloudField(value="数量(辅助数量)", example="4000.0")
    private BigDecimal itemAssistQty;
    @ApiCloudField(value="辅助单位", example="个")
    private String itemAssistUnit;
    @ApiCloudField(value="常用数量", example="4000.0")
    private BigDecimal itemUseQty;
    @ApiCloudField(value="商品换算率", example="5.0")
    private BigDecimal itemRate;
    @ApiCloudField(value="商品单价", example="10.4")
    private BigDecimal itemPrice;
    @ApiCloudField(value="商品总额(含税金额)", example="2080000.0")
    private BigDecimal itemMoney;
    @ApiCloudField(value="商品基本单位", example="个")
    private String itemUnit;
    @ApiCloudField(value="商品备注", example="备注")
    private String itemMemo;
    @ApiCloudField(value="商品常用单位", example="箱")
    private String itemUseUnit;
    @ApiCloudField(value="商品码", example="00005")
    private String itemCode;
    @ApiCloudField(value="商品规格", example="500ml")
    private String itemSpec;
    @ApiCloudField(value="批次", example="11")
    private String itemLotNumber;
    @ApiCloudField(value="生产日期", example="2025-06-01")
    private String itemProductionDate;
}
