package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ItemNumsDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ItemNumsDTOModel extends ApiCloudObject {

    @ApiCloudField(value="商品编码", example="102200551", required=true)
    private List<Integer> itemNums;
}
