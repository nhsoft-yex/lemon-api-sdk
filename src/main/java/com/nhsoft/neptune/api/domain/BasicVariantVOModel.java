package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * BasicVariantVO模型
 * 基础档案商品规格
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class BasicVariantVOModel extends ApiCloudObject {

    @ApiCloudField(value="规格id", example="404646")
    private Long variantId;
    @ApiCloudField(value="规格名称", example="乐事薯片")
    private String variantName;
    @ApiCloudField(value="标准售价(两位小数)", example="1.0")
    private BigDecimal variantStdPrice;
    @ApiCloudField(value="划线价(两位小数)", example="1.0")
    private BigDecimal variantLiningPrice;
    @ApiCloudField(value="二级价格(两位小数)", example="1.0")
    private BigDecimal variantLevel2Price;
    @ApiCloudField(value="三级价格(两位小数)", example="1.0")
    private BigDecimal variantLevel3Price;
    @ApiCloudField(value="四级价格(两位小数)", example="1.0")
    private BigDecimal variantLevel4Price;
    @ApiCloudField(value="基本单位数量转化率(三位小数)", example="1.0")
    private BigDecimal variantRatio;
    @ApiCloudField(value="净重(三位小数)", example="1.0")
    private BigDecimal variantWeight;
    @ApiCloudField(value="商品主规格代码", example="404646")
    private String variantCode;
    @ApiCloudField(value="条码", example="404646")
    private String variantBarcode;
    @ApiCloudField(value="起售数量", example="1")
    private Integer startSaleQuantity;
    @ApiCloudField(value="虚拟销量", example="1")
    private Integer virtualStock;
    @ApiCloudField(value="创建时间")
    private String createdAt;
    @ApiCloudField(value="更新时间")
    private String updatedAt;
    @ApiCloudField(value="item_info")
    private BasicVariantProductVOModel itemInfo;
    @ApiCloudField(value="商品分组")
    private List<BasicVariantGroupVOModel> itemGroups;
}
