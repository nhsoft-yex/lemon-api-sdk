package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * WholesalePriceAdjustOrderDetailSaveDTO模型
 * 批发价格调整订单明细
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class WholesalePriceAdjustOrderDetailSaveDTOModel extends ApiCloudObject {

    @ApiCloudField(value="商品编码", example="434400001", required=true)
    private Integer itemNum;
    @ApiCloudField(value="原批发价", example="20.0", required=true)
    private BigDecimal oriWholesalePrice;
    @ApiCloudField(value="原批发价", example="22.0", required=true)
    private BigDecimal wholesalePrice;
    @ApiCloudField(value="原批发价2", example="22.0", required=true)
    private BigDecimal oriWholesaleLevel2Price;
    @ApiCloudField(value="现批发价2", example="22.0", required=true)
    private BigDecimal wholesaleLevel2Price;
    @ApiCloudField(value="原批发价3", example="22.0", required=true)
    private BigDecimal oriWholesaleLevel3Price;
    @ApiCloudField(value="现批发价3", example="22.0", required=true)
    private BigDecimal wholesaleLevel3Price;
    @ApiCloudField(value="原批发价4", example="22.0", required=true)
    private BigDecimal oriWholesaleLevel4Price;
    @ApiCloudField(value="现批发价4", example="22.0", required=true)
    private BigDecimal wholesaleLevel4Price;
}
