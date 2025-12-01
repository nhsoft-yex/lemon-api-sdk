package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PriceAdjustmentDetailVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PriceAdjustmentDetailVOModel extends ApiCloudObject {

    @ApiCloudField(value="商品编码", example="102207121")
    private Integer itemNum;
    @ApiCloudField(value="分级商品编码", example="102207123")
    private Integer itemGradeNum;
    @ApiCloudField(value="商品代码", example="0700121")
    private String itemCode;
    @ApiCloudField(value="商品名称", example="青苹果")
    private String itemName;
    @ApiCloudField(value="商品现标准售价", example="11.0")
    private BigDecimal itemRegularPrice;
    @ApiCloudField(value="商品原标准售价", example="11.0")
    private BigDecimal itemOriRegularPrice;
    @ApiCloudField(value="商品现售价2", example="11.0")
    private BigDecimal itemLevel2Price;
    @ApiCloudField(value="商品原售价2", example="11.0")
    private BigDecimal itemOriLevel2Price;
    @ApiCloudField(value="商品现售价3", example="11.0")
    private BigDecimal itemLevel3Price;
    @ApiCloudField(value="商品原售价3", example="11.0")
    private BigDecimal itemOriLevel3Price;
    @ApiCloudField(value="商品现售价4", example="11.0")
    private BigDecimal itemLevel4Price;
    @ApiCloudField(value="商品原售价4", example="11.0")
    private BigDecimal itemOriLevel4Price;
    @ApiCloudField(value="商品现最高价", example="11.0")
    private BigDecimal itemMaxPrice;
    @ApiCloudField(value="商品原最高价", example="11.0")
    private BigDecimal itemOriMaxPrice;
    @ApiCloudField(value="商品现最低价", example="11.0")
    private BigDecimal itemMinPrice;
    @ApiCloudField(value="商品原最低价", example="11.0")
    private BigDecimal itemOriMinPrice;
}
