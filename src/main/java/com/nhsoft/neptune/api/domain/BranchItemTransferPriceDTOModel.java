package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * BranchItemTransferPriceDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class BranchItemTransferPriceDTOModel extends ApiCloudObject {

    @ApiCloudField(value="商品编码列表(长度不超过100)", example="43440001")
    private Integer itemNum;
    @ApiCloudField(value="配送价", example="1.0")
    private BigDecimal itemTransferPrice;
}
