package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * WholesaleInnerOrderDetailSaveDTO模型
 * 售后申请单明细保存
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class WholesaleInnerOrderDetailSaveDTOModel extends ApiCloudObject {

    @ApiCloudField(value="商品编号", example="4344990000318", required=true)
    private Integer itemNum;
    @ApiCloudField(value="申请数量（小数点3位）", example="1.22", required=true)
    private BigDecimal itemUseQty;
    @ApiCloudField(value="商品数量（小数点3位）", example="1.22")
    private BigDecimal itemQty;
    @ApiCloudField(value="申请单价（小数点4位）", example="2.0")
    private BigDecimal itemUsePrice;
    @ApiCloudField(value="申请单位", example="公斤", required=true)
    private String itemUseUnit;
    @ApiCloudField(value="申请备注")
    private String itemMemo;
    @ApiCloudField(value="赠品常用数量")
    private BigDecimal itemPresentUseQty;
    @ApiCloudField(value="赠品单位")
    private String itemPresentUnit;
    @ApiCloudField(value="批次号", example="20240101")
    private String itemLotNumber;
    @ApiCloudField(value="生产日期")
    private String itemProductDate;
}
