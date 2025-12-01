package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * InventoryDailyItemFindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class InventoryDailyItemFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="门店编码", example="1", required=true)
    private Integer branchNum;
    @ApiCloudField(value="仓库编码", example="43440001", required=true)
    private Integer storehouseNum;
    @ApiCloudField(value="营业日", example="20200101", required=true)
    private String bizDay;
}
