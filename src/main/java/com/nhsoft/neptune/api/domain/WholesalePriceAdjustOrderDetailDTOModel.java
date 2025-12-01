package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * WholesalePriceAdjustOrderDetailDTO模型
 * 批发价格调整单明细
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class WholesalePriceAdjustOrderDetailDTOModel extends ApiCloudObject {

    @ApiCloudField(value="配送价调整单号", example="4344990000318")
    private String priceAdjustmentFid;
    @ApiCloudField(value="商品编码", example="434400001")
    private Integer itemNum;
    @ApiCloudField(value="原批发价", example="20.0")
    private BigDecimal oriWholesalePrice;
    @ApiCloudField(value="原批发价", example="22.0")
    private BigDecimal wholesalePrice;
    @ApiCloudField(value="原批发价2", example="22.0")
    private BigDecimal oriWholesaleLevel2Price;
    @ApiCloudField(value="现批发价2", example="22.0")
    private BigDecimal wholesaleLevel2Price;
    @ApiCloudField(value="原批发价3", example="22.0")
    private BigDecimal oriWholesaleLevel3Price;
    @ApiCloudField(value="现批发价3", example="22.0")
    private BigDecimal wholesaleLevel3Price;
    @ApiCloudField(value="原批发价4", example="22.0")
    private BigDecimal oriWholesaleLevel4Price;
    @ApiCloudField(value="现批发价4", example="22.0")
    private BigDecimal wholesaleLevel4Price;
}
