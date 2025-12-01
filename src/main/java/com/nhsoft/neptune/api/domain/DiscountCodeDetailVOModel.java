package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * DiscountCodeDetailVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class DiscountCodeDetailVOModel extends ApiCloudObject {

    @ApiCloudField(value="商品编码")
    private Integer itemNum;
    @ApiCloudField(value="商品分级编码")
    private Integer itemGradeNum;
    @ApiCloudField(value="商品代码", example="")
    private String itemCode;
    @ApiCloudField(value="商品条码", example="")
    private String itemBarcode;
    @ApiCloudField(value="商品名称", example="")
    private String itemName;
    @ApiCloudField(value="商品规格", example="")
    private String itemSpec;
    @ApiCloudField(value="基本单位", example="")
    private String itemUnit;
    @ApiCloudField(value="标准售价")
    private BigDecimal regularPrice;
    @ApiCloudField(value="特价")
    private BigDecimal specialPrice;
}
