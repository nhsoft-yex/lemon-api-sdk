package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ItemWithCategoryVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ItemWithCategoryVOModel extends ApiCloudObject {

    @ApiCloudField(value="商品编码", example="1")
    private Integer itemNum;
    @ApiCloudField(value="商品名称", example="测试1")
    private String itemName;
    @ApiCloudField(value="category")
    private ItemCategoryVOModel category;
}
