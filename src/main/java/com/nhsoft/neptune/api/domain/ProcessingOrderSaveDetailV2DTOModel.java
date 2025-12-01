package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ProcessingOrderSaveDetailV2DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ProcessingOrderSaveDetailV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="商品编号", example="207210315", required=true)
    private Integer itemNum;
    @ApiCloudField(value="常用数量", example="200.0", required=true)
    private BigDecimal itemUseQty;
    @ApiCloudField(value="常用单位", example="公斤", required=true)
    private String itemUseUnit;
    @ApiCloudField(value="商品备注", example="备注")
    private String itemMemo;
    @ApiCloudField(value="批次", example="11")
    private String itemLotNumber;
}
