package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ItemPriceDetailFindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ItemPriceDetailFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="商品编号", example="1", required=true)
    private Integer itemNum;
    @ApiCloudField(value="批次号（如果查询条件带批次，就返回批次价格）", example="20250701")
    private String itemLotNumber;
}
