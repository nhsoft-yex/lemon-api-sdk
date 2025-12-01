package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ItemCategoryFindByItemsDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ItemCategoryFindByItemsDTOModel extends ApiCloudObject {

    @ApiCloudField(value="门店编号", example="99", required=true)
    private Integer branchNum;
    @ApiCloudField(value="商品编号列表(和商品分类列表不能同时存在)", example="[1]")
    private List<Integer> itemNums;
}
