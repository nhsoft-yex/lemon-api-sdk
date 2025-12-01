package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ItemUpdateToStandardTypeDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ItemUpdateToStandardTypeDTOModel extends ApiCloudObject {

    @ApiCloudField(value="商品编码列表", example="[43440001]", required=true)
    private List<Integer> itemNums;
    @ApiCloudField(value="操作人", example="管理员")
    private String operator;
}
