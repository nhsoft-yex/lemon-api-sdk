package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * InventoryLatestDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class InventoryLatestDTOModel extends ApiCloudObject {

    @ApiCloudField(value="商品编码", example="43440001")
    private Integer itemNum;
    @ApiCloudField(value="批次号", example="202100101001")
    private String itemLotNumber;
    @ApiCloudField(value="生产日期", example="2021-01-01")
    private String itemProductDate;
}
