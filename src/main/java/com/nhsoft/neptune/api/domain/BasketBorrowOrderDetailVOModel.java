package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * BasketBorrowOrderDetailVO模型
 * 筐借还单明细VO
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class BasketBorrowOrderDetailVOModel extends ApiCloudObject {

    @ApiCloudField(value="容器编码")
    private Integer containerNum;
    @ApiCloudField(value="容器名称")
    private String containerName;
    @ApiCloudField(value="数量")
    private BigDecimal qty;
    @ApiCloudField(value="金额")
    private BigDecimal money;
    @ApiCloudField(value="单价")
    private BigDecimal price;
}
