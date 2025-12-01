package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * AdjustmentOrderSaveDetailV3DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class AdjustmentOrderSaveDetailV3DTOModel extends ApiCloudObject {

    @ApiCloudField(value="商品编码", example="150050001", required=true)
    private Integer itemNum;
    @ApiCloudField(value="调整数量", example="1.0", required=true)
    private BigDecimal itemUseQty;
    @ApiCloudField(value="调整单位", example="公斤", required=true)
    private String itemUseUnit;
    @ApiCloudField(value="调整单价(出库不传)", example="30.0")
    private BigDecimal itemUsePrice;
    @ApiCloudField(value="基本数量", example="1.0")
    private BigDecimal itemQty;
    @ApiCloudField(value="基本单价(出库不传)", example="30.0")
    private BigDecimal itemPrice;
    @ApiCloudField(value="批次号", example="20210120")
    private String itemLotNumber;
    @ApiCloudField(value="生产日期(yyyy-mm-dd)", example="2021-01-20")
    private String itemProductDate;
    @ApiCloudField(value="备注", example="备注信息")
    private String itemMemo;
}
