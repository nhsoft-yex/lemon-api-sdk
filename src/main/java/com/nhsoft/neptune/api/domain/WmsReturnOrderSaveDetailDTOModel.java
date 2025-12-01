package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * WmsReturnOrderSaveDetailDTO模型
 * WMS销退订单明细
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class WmsReturnOrderSaveDetailDTOModel extends ApiCloudObject {

    @ApiCloudField(value="商品编码", example="434400016", required=true)
    private Integer itemNum;
    @ApiCloudField(value="退货基本数量", example="20.0", required=true)
    private BigDecimal itemQty;
    @ApiCloudField(value="退货基本单位", example="公斤", required=true)
    private String itemUnit;
    @ApiCloudField(value="退货单价（小数点4位）", example="1.0", required=true)
    private BigDecimal itemPrice;
}
