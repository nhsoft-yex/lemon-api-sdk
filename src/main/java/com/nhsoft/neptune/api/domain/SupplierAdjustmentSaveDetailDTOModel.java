package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * SupplierAdjustmentSaveDetailDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class SupplierAdjustmentSaveDetailDTOModel extends ApiCloudObject {

    @ApiCloudField(value="商品编号", required=true)
    private Integer itemNum;
    @ApiCloudField(value="常用单位", example="公斤", required=true)
    private String adjustmentDetailUseUnit;
    @ApiCloudField(value="常用单价(现约定价格)", example="50.0", required=true)
    private BigDecimal adjustmentDetailUsePrice;
    @ApiCloudField(value="现加点价格")
    private BigDecimal adjustmentDetailAppendPrice;
    @ApiCloudField(value="现加点常用价格")
    private BigDecimal adjustmentDetailAppendUsePrice;
    @ApiCloudField(value="现售价")
    private BigDecimal adjustmentDetailRegularPrice;
    @ApiCloudField(value="现售价2")
    private BigDecimal adjustmentDetailLevel2Price;
    @ApiCloudField(value="现售价3")
    private BigDecimal adjustmentDetailLevel3Price;
    @ApiCloudField(value="现售价4")
    private BigDecimal adjustmentDetailLevel4Price;
    @ApiCloudField(value="主供应商选中标记", example="false")
    private Boolean defaultSupplierSelectCase;
    @ApiCloudField(value="单品备注", example="")
    private String adjustmentDetailMemo;
}
