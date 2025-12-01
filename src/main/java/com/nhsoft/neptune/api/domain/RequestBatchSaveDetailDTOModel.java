package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * RequestBatchSaveDetailDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class RequestBatchSaveDetailDTOModel extends ApiCloudObject {

    @ApiCloudField(value="商品编号", required=true)
    private Integer itemNum;
    @ApiCloudField(value="商品序号(从0开始，序号越小顺序越高)", example="0")
    private Integer itemSequence;
    @ApiCloudField(value="必订数量")
    private BigDecimal boundUseQty;
}
