package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * SupplierAdjustmentDetailVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class SupplierAdjustmentDetailVOModel extends ApiCloudObject {

    @ApiCloudField(value="明细编号")
    private Integer adjustmentDetailNum;
    @ApiCloudField(value="商品编号")
    private Integer itemNum;
    @ApiCloudField(value="原约定价格")
    private BigDecimal adjustmentDetailOriCostPrice;
    @ApiCloudField(value="现约定价格")
    private BigDecimal adjustmentDetailCostPrice;
    @ApiCloudField(value="代码", example="")
    private String adjustmentDetailItemCode;
    @ApiCloudField(value="名称", example="")
    private String adjustmentDetailItemName;
    @ApiCloudField(value="规格", example="")
    private String adjustmentDetailItemSpec;
    @ApiCloudField(value="基本单位", example="")
    private String adjustmentDetailItemUnit;
    @ApiCloudField(value="门店编码")
    private Integer branchNum;
    @ApiCloudField(value="原加点价格")
    private BigDecimal adjustmentDetailOriAppendPrice;
    @ApiCloudField(value="现加点价格")
    private BigDecimal adjustmentDetailAppendPrice;
    @ApiCloudField(value="原最低价")
    private BigDecimal adjustmentDetailOriMinPrice;
    @ApiCloudField(value="最低价")
    private BigDecimal adjustmentDetailMinPrice;
    @ApiCloudField(value="原最高价")
    private BigDecimal adjustmentDetailOriMaxPrice;
    @ApiCloudField(value="最高价")
    private BigDecimal adjustmentDetailMaxPrice;
    @ApiCloudField(value="常用单位换算率")
    private BigDecimal adjustmentDetailUseRate;
    @ApiCloudField(value="常用单位", example="")
    private String adjustmentDetailUseUnit;
    @ApiCloudField(value="常用单价")
    private BigDecimal adjustmentDetailUsePrice;
    @ApiCloudField(value="现加点常用价格")
    private BigDecimal adjustmentDetailAppendUsePrice;
    @ApiCloudField(value="普通扣点")
    private BigDecimal adjustmentDetailPvalRebate;
    @ApiCloudField(value="原普通扣点")
    private BigDecimal adjustmentDetailOriPvalRebate;
    @ApiCloudField(value="特价扣点")
    private BigDecimal adjustmentDetailSpecialRebate;
    @ApiCloudField(value="原特价扣点")
    private BigDecimal adjustmentDetailOriSpecialRebate;
    @ApiCloudField(value="原标准售价")
    private BigDecimal adjustmentDetailOriRegularPrice;
    @ApiCloudField(value="现标准售价")
    private BigDecimal adjustmentDetailRegularPrice;
    @ApiCloudField(value="原售价2")
    private BigDecimal adjustmentDetailOriLevel2Price;
    @ApiCloudField(value="现售价2")
    private BigDecimal adjustmentDetailLevel2Price;
    @ApiCloudField(value="原售价3")
    private BigDecimal adjustmentDetailOriLevel3Price;
    @ApiCloudField(value="现售价3")
    private BigDecimal adjustmentDetailLevel3Price;
    @ApiCloudField(value="原售价4")
    private BigDecimal adjustmentDetailOriLevel4Price;
    @ApiCloudField(value="现售价4")
    private BigDecimal adjustmentDetailLevel4Price;
    @ApiCloudField(value="主供应商选中标记", example="false")
    private Boolean defaultSupplierSelectCase;
    @ApiCloudField(value="单品备注", example="")
    private String adjustmentDetailMemo;
    @ApiCloudField(value="报表打印使用属性", example="")
    private String useQtyString;
}
