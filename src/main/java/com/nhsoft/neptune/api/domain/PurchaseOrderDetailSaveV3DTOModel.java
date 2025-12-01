package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PurchaseOrderDetailSaveV3DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PurchaseOrderDetailSaveV3DTOModel extends ApiCloudObject {

    @ApiCloudField(value="商品编码", example="150050001", required=true)
    private Integer itemNum;
    @ApiCloudField(value="采购数量（小数点3位）", example="1.0", required=true)
    private BigDecimal itemUseQty;
    @ApiCloudField(value="采购单价（小数点4位）", example="1.0", required=true)
    private BigDecimal itemUsePrice;
    @ApiCloudField(value="采购单位", example="公斤", required=true)
    private String itemUseUnit;
    @ApiCloudField(value="赠品单位", example="公斤")
    private String itemPresentUnit;
    @ApiCloudField(value="赠品数量（小数点3位）", example="1.0")
    private BigDecimal itemPresentQty;
    @ApiCloudField(value="备注", example="备注信息")
    private String itemMemo;
    @ApiCloudField(value="基本数量（小数点3位）", example="1.0")
    private BigDecimal itemQty;
    @ApiCloudField(value="最近进价", example="1.25")
    private BigDecimal detailLastPrice;
    @ApiCloudField(value="生产日期(yyyy-mm-dd)", example="Mon Jan 01 08:00:00 CST 2024")
    private String detailProducingDate;
}
