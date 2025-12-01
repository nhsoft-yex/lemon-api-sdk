package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ProcessingInOrderSaveDetailV2DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ProcessingInOrderSaveDetailV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="processing_in_order_fid")
    private String processingInOrderFid;
    @ApiCloudField(value="加工生产单编号", example="JO4344990001", required=true)
    private String processingOrderFid;
    @ApiCloudField(value="商品编号", example="207210315", required=true)
    private Integer itemNum;
    @ApiCloudField(value="生产日期", example="2022-01-01")
    private String itemProducingDate;
    @ApiCloudField(value="备注", example="备注")
    private String itemMemo;
    @ApiCloudField(value="常用数量", example="200.0", required=true)
    private BigDecimal itemUseQty;
    @ApiCloudField(value="基本数量", example="200.0", required=true)
    private BigDecimal itemQty;
    @ApiCloudField(value="常用单位", example="公斤", required=true)
    private String itemUseUnit;
    @ApiCloudField(value="批次", example="11")
    private String itemLotNumber;
}
