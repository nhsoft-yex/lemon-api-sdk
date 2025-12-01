package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * WhsCheckOrderLnDetailVO模型
 * 批次明细
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class WhsCheckOrderLnDetailVOModel extends ApiCloudObject {

    @ApiCloudField(value="盘点基本数量", example="0.0")
    private BigDecimal baseQty;
    @ApiCloudField(value="批次明细号", example="1")
    private Integer checkOrderDetailLnNum;
    @ApiCloudField(value="盘点单明细号", example="1")
    private Integer checkOrderDetailNum;
    @ApiCloudField(value="门店", example="99")
    private Integer branchNum;
    @ApiCloudField(value="库存基本数量", example="3.0")
    private BigDecimal inventoryBaseQty;
    @ApiCloudField(value="库存基本数量", example="3.0")
    private BigDecimal inventoryUseQty;
    @ApiCloudField(value="商品代码", example="00756")
    private String itemCode;
    @ApiCloudField(value="损益数量", example="-3.0")
    private BigDecimal lossQty;
    @ApiCloudField(value="批次", example="20220918")
    private String lotNum;
    @ApiCloudField(value="备注", example="99")
    private String memo;
    @ApiCloudField(value="生产日期", example="Sun Sep 18 08:00:00 CST 2022")
    private String productionDate;
    @ApiCloudField(value="盘点库存数量", example="0.0")
    private BigDecimal useQty;
    @ApiCloudField(value="换算率", example="1.0")
    private BigDecimal useRate;
}
