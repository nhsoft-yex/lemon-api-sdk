package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ElepriceadjDetailSaveV2DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ElepriceadjDetailSaveV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="商品编码", required=true)
    private Integer itemNum;
    @ApiCloudField(value="新制单组合商品编码", required=true)
    private Integer parentItemNum;
    @ApiCloudField(value="商品现标准售价", example="10.0")
    private BigDecimal itemRegularPrice;
    @ApiCloudField(value="商品原标准售价", example="9.0")
    private BigDecimal itemOriRegularPrice;
    @ApiCloudField(value="商品现售价2", example="11.0")
    private BigDecimal itemLevel2Price;
    @ApiCloudField(value="商品原售价2", example="10.0")
    private BigDecimal itemOriLevel2Price;
    @ApiCloudField(value="商品现售价3", example="12.0")
    private BigDecimal itemLevel3Price;
    @ApiCloudField(value="商品原售价3", example="11.0")
    private BigDecimal itemOriLevel3Price;
    @ApiCloudField(value="商品现售价4", example="13.0")
    private BigDecimal itemLevel4Price;
    @ApiCloudField(value="商品原售价4", example="12.0")
    private BigDecimal itemOriLevel4Price;
    @ApiCloudField(value="库存量", example="100")
    private BigDecimal itemStock;
}
