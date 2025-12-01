package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * BasketBorrowOrderSaveDetailDTO模型
 * 筐借还单明细
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class BasketBorrowOrderSaveDetailDTOModel extends ApiCloudObject {

    @ApiCloudField(value="容器名称", required=true)
    private String containerName;
    @ApiCloudField(value="数量", required=true)
    private BigDecimal qty;
}
