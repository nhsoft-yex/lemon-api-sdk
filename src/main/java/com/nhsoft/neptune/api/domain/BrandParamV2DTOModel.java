package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * BrandParamV2DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class BrandParamV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="品牌代码", example="001")
    private String brandCode;
    @ApiCloudField(value="品牌名称", example="红富士")
    private String brandName;
    @ApiCloudField(value="品牌拼音", example="HFS")
    private String brandPinYin;
}
