package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * OutOrderSaveDetailV2DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class OutOrderSaveDetailV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="商品编码", example="150050001", required=true)
    private Integer itemNum;
    @ApiCloudField(value="调出数量（小数点3位）", example="1.0", required=true)
    private BigDecimal itemUseQty;
    @ApiCloudField(value="调出单价（小数点4位）", example="5.0")
    private BigDecimal itemUsePrice;
    @ApiCloudField(value="调出单位", example="公斤", required=true)
    private String itemUseUnit;
    @ApiCloudField(value="商品备注", example="备注信息")
    private String itemMemo;
    @ApiCloudField(value="批次号", example="20210101")
    private String itemLotNumber;
    @ApiCloudField(value="批次备注", example="备注信息")
    private String itemLotMemo;
    @ApiCloudField(value="生产日期(yyyy-mm-dd)", example="2020-01-01")
    private String itemProductDate;
    @ApiCloudField(value="赠品数量（小数点3位）", example="1.0")
    private BigDecimal itemPresentQty;
    @ApiCloudField(value="赠品基本数量（小数点3位）", example="1.0")
    private BigDecimal itemPresentBasicQty;
    @ApiCloudField(value="赠品单位", example="公斤")
    private String itemPresentUnit;
    @ApiCloudField(value="基本数量（小数点3位）", example="1.0")
    private BigDecimal itemQty;
    @ApiCloudField(value="out_order_detail_receive_qty")
    private BigDecimal outOrderDetailReceiveQty;
    @ApiCloudField(value="out_order_detail_receive_use_qty")
    private BigDecimal outOrderDetailReceiveUseQty;
    @ApiCloudField(value="out_order_detail_receive_tare")
    private BigDecimal outOrderDetailReceiveTare;
    @ApiCloudField(value="out_order_detail_freight")
    private BigDecimal outOrderDetailFreight;
    @ApiCloudField(value="out_order_detail_quantity")
    private BigDecimal outOrderDetailQuantity;
}
