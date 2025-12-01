package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ElepriceadjDetailV2DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ElepriceadjDetailV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="商品编码", example="2207000017")
    private Integer itemNum;
    @ApiCloudField(value="新制单组合商品编码", example="2207121")
    private Integer parentItemNum;
    @ApiCloudField(value="商品代码", example="07000017")
    private String itemCode;
    @ApiCloudField(value="商品名称", example="青苹果")
    private String itemName;
    @ApiCloudField(value="商品现标准售价", example="10.0")
    private BigDecimal itemRegularPrice;
    @ApiCloudField(value="商品原标准售价", example="10.0")
    private BigDecimal itemOriRegularPrice;
    @ApiCloudField(value="商品现售价2", example="10.0")
    private BigDecimal itemLevel2Price;
    @ApiCloudField(value="商品原售价2", example="10.0")
    private BigDecimal itemOriLevel2Price;
    @ApiCloudField(value="商品现售价3", example="10.0")
    private BigDecimal itemLevel3Price;
    @ApiCloudField(value="商品原售价3", example="10.0")
    private BigDecimal itemOriLevel3Price;
    @ApiCloudField(value="商品现售价4", example="10.0")
    private BigDecimal itemLevel4Price;
    @ApiCloudField(value="商品原售价4", example="10.0")
    private BigDecimal itemOriLevel4Price;
    @ApiCloudField(value="库存量", example="100.0")
    private BigDecimal itemStock;
}
