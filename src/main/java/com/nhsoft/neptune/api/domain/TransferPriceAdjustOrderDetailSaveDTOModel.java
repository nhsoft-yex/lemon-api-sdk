package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * TransferPriceAdjustOrderDetailSaveDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class TransferPriceAdjustOrderDetailSaveDTOModel extends ApiCloudObject {

    @ApiCloudField(value="商品编码", example="434400001", required=true)
    private Integer itemNum;
    @ApiCloudField(value="原配送价", example="20.0", required=true)
    private BigDecimal itemOriTransferPrice;
    @ApiCloudField(value="现配送价", example="22.0", required=true)
    private BigDecimal itemTransferPrice;
    @ApiCloudField(value="常用单位", example="公斤")
    private String itemDetailUseUnit;
}
