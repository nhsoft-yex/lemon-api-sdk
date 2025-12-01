package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * RequestBatchDetailVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class RequestBatchDetailVOModel extends ApiCloudObject {

    @ApiCloudField(value="商品编码", example="43440021")
    private Integer itemNum;
    @ApiCloudField(value="必定货数量", example="8.0")
    private BigDecimal boundUseQty;
    @ApiCloudField(value="商品序号", example="1")
    private Integer itemSequence;
}
