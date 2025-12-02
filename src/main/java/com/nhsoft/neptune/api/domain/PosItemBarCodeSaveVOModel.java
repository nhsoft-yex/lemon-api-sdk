package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PosItemBarCodeSaveVO模型
 * 一品多码
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PosItemBarCodeSaveVOModel extends ApiCloudObject {

    @ApiCloudField(value="商品条码", example="000000000005", required=true)
    private String itemBarCode;
    @ApiCloudField(value="换算率（小数点2位）", example="1.0")
    private BigDecimal itemBarRate;
    @ApiCloudField(value="单位", example="1.00")
    private String itemBarUnit;
}
