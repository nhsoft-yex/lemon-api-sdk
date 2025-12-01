package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ItemCategoryFindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ItemCategoryFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="门店编号", example="99", required=true)
    private Integer branchNum;
    @ApiCloudField(value="商品分类编号列表", example="[838]")
    private List<Long> posItemCategoryNums;
}
