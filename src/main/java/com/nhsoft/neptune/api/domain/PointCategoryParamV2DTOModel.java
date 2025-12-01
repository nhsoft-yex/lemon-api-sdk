package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PointCategoryParamV2DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PointCategoryParamV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="category_code")
    private String categoryCode;
    @ApiCloudField(value="category_name")
    private String categoryName;
    @ApiCloudField(value="consume_money")
    private BigDecimal consumeMoney;
    @ApiCloudField(value="point_value")
    private BigDecimal pointValue;
}
