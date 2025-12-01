package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PurchaseStorematrixSaveDetailDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PurchaseStorematrixSaveDetailDTOModel extends ApiCloudObject {

    @ApiCloudField(value="商品编码", example="434400001", required=true)
    private Integer itemNum;
    @ApiCloudField(value="基础库存（小数点两位）", example="10.0")
    private BigDecimal baseStock;
    @ApiCloudField(value="补货订购点（小数点两位）", example="10.0")
    private BigDecimal recorderPoint;
    @ApiCloudField(value="补货订购量（小数点两位）", example="10.0")
    private BigDecimal recorderQty;
    @ApiCloudField(value="库存上限（小数点两位）", example="10.0")
    private BigDecimal upperStock;
    @ApiCloudField(value="补货基数", example="2")
    private Integer orderBase;
    @ApiCloudField(value="停购标记（true:停购  false:不停购）", example="false")
    private Boolean stockCeaseFlag;
}
