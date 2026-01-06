package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PosItemCombineItemVO模型
 * 组合明细
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PosItemCombineItemVOModel extends ApiCloudObject {

    @ApiCloudField(value="组合中的商品编号")
    private Integer combinedItemNum;
    @ApiCloudField(value="组合中的商品规格", example="10.0")
    private String combinedItemSpecNum;
    @ApiCloudField(value="数量（小数点3位）", example="10.0")
    private BigDecimal quantity;
    @ApiCloudField(value="是否固定重量", example="false")
    private Boolean unfixedWeightFlag;
}
