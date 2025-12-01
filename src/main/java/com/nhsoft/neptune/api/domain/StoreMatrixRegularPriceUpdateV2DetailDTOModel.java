package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * StoreMatrixRegularPriceUpdateV2DetailDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class StoreMatrixRegularPriceUpdateV2DetailDTOModel extends ApiCloudObject {

    @ApiCloudField(value="商品编码", example="1", required=true)
    private Integer itemNum;
    @ApiCloudField(value="门店零售价（小数点4位）", example="1.0", required=true)
    private BigDecimal itemRegularPrice;
    @ApiCloudField(value="门店零售价2（小数点4位）", example="1.0")
    private BigDecimal itemLevel2Price;
    @ApiCloudField(value="门店最低售价（小数点4位）", example="1.0")
    private BigDecimal itemMinPrice;
    @ApiCloudField(value="门店最高售价（小数点4位）", example="1.0")
    private BigDecimal itemMaxPrice;
    @ApiCloudField(value="是否允许经营", example="true")
    private Boolean storeMatrixManage;
    @ApiCloudField(value="门店零售价3（小数点4位）", example="1.0")
    private BigDecimal itemLevel3Price;
    @ApiCloudField(value="门店零售价4（小数点4位）", example="1.0")
    private BigDecimal itemLevel4Price;
}
