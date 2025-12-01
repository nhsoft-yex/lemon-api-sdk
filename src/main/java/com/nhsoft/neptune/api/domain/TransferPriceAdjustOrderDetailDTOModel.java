package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * TransferPriceAdjustOrderDetailDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class TransferPriceAdjustOrderDetailDTOModel extends ApiCloudObject {

    @ApiCloudField(value="配送价调整单号", example="4344990000318")
    private String priceAdjustmentFid;
    @ApiCloudField(value="商品编码", example="434400001")
    private Integer itemNum;
    @ApiCloudField(value="原配送价", example="20.0")
    private BigDecimal itemOriTransferPrice;
    @ApiCloudField(value="现配送价", example="22.0")
    private BigDecimal itemTransferPrice;
    @ApiCloudField(value="常用单位", example="公斤")
    private String itemDetailUseUnit;
}
