package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * RequestTemplateDetailResponseDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class RequestTemplateDetailResponseDTOModel extends ApiCloudObject {

    @ApiCloudField(value="商品编码", example="43440001")
    private Integer itemNum;
    @ApiCloudField(value="门店配送价（小数点4位）", example="20.0")
    private BigDecimal transferPrice;
    @ApiCloudField(value="毛利率（小数点4位， 0.1500表示15%）", example="0.15")
    private BigDecimal transferGross;
    @ApiCloudField(value="标签", example="水果")
    private String itemLabel;
}
