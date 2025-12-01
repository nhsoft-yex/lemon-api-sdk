package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PosItemBarCodeV2DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PosItemBarCodeV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="商品条码", example="2200551")
    private String itemBarCode;
    @ApiCloudField(value="换算率（小数点2位）", example="0.8")
    private BigDecimal itemBarRate;
    @ApiCloudField(value="单位", example="1.00")
    private String itemBarUnit;
}
