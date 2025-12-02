package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * InventoryFindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class InventoryFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="仓库编码", example="150050001", required=true)
    private Integer storehouseNum;
    @ApiCloudField(value="商品编码列表", example="[1,2]")
    private List<Integer> itemNums;
    @ApiCloudField(value="是否查询批次库存，默认false", example="false")
    private Boolean withLnDetails;
}
