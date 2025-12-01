package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * InventoryLatestFindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class InventoryLatestFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="仓库编码", example="150050001", required=true)
    private Integer storehouseNum;
    @ApiCloudField(value="商品编码列表", example="[43440001,43440002]", required=true)
    private List<Integer> itemNums;
}
