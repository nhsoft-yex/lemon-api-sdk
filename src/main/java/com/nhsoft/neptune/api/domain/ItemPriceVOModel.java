package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ItemPriceVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ItemPriceVOModel extends ApiCloudObject {

    @ApiCloudField(value="商品编号", example="1")
    private Integer itemNum;
    @ApiCloudField(value="批次号（如果查询条件带批次，就返回批次价格）", example="20250701")
    private String itemLotNumber;
    @ApiCloudField(value="配送价")
    private BigDecimal itemTransferPrice;
}
