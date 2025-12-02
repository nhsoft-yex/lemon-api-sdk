package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * WmsCheckOrderDetailVO模型
 * WMS盘点单明细
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class WmsCheckOrderDetailVOModel extends ApiCloudObject {

    @ApiCloudField(value="基本数量", example="0.0")
    private BigDecimal baseQty;
    @ApiCloudField(value="盘点单明细号", example="1")
    private Integer checkOrderDetailNum;
    @ApiCloudField(value="门店编码", example="99")
    private Integer branchNum;
    @ApiCloudField(value="库存基本数量", example="4.0")
    private BigDecimal inventoryBaseQty;
    @ApiCloudField(value="库存数量", example="4.0")
    private BigDecimal inventoryUseQty;
    @ApiCloudField(value="基本单位", example="件")
    private String itemBaseUnit;
    @ApiCloudField(value="商品代码", example="00756")
    private String itemCode;
    @ApiCloudField(value="库存单位", example="件")
    private String itemUseUnit;
    @ApiCloudField(value="损益数量", example="-4.0")
    private BigDecimal lossQty;
    @ApiCloudField(value="备注", example="测试")
    private String memo;
    @ApiCloudField(value="生产日期", example="Mon Apr 01 08:00:00 CST 2024")
    private String productionDate;
    @ApiCloudField(value="盘点数量", example="0.0")
    private BigDecimal useQty;
    @ApiCloudField(value="换算率", example="1.0")
    private BigDecimal useRate;
    @ApiCloudField(value="批次明细", example="")
    private List<WhsCheckOrderLnDetailVOModel> checkOrderLnDetails;
}
