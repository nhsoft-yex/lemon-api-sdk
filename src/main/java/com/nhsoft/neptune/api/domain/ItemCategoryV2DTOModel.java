package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ItemCategoryV2DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ItemCategoryV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="商品类别代码", example="1001")
    private String categoryCode;
    @ApiCloudField(value="商品类别名称", example="水果")
    private String categoryName;
    @ApiCloudField(value="商品父类代码", example="1000")
    private String parentCategoryCode;
    @ApiCloudField(value="类别顺序", example="1")
    private Integer posItemTypeSn;
    @ApiCloudField(value="负库存不允许销售", example="false")
    private Boolean canNotSaleNoStoreItem;
}
