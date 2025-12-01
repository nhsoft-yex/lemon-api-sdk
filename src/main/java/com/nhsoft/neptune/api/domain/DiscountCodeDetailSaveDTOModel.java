package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * DiscountCodeDetailSaveDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class DiscountCodeDetailSaveDTOModel extends ApiCloudObject {

    @ApiCloudField(value="商品编码")
    private Integer itemNum;
    @ApiCloudField(value="商品分级编码")
    private Integer itemGradeNum;
    @ApiCloudField(value="特价")
    private BigDecimal specialPrice;
}
