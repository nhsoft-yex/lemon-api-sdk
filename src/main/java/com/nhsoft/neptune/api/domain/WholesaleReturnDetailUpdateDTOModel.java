package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * WholesaleReturnDetailUpdateDTO模型
 * 批发退货明细
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class WholesaleReturnDetailUpdateDTOModel extends ApiCloudObject {

    @ApiCloudField(value="商品编码", example="150050001", required=true)
    private Integer itemNum;
    @ApiCloudField(value="销售数量（小数点3位）", example="5.0", required=true)
    private BigDecimal itemUseQty;
    @ApiCloudField(value="销售单价（小数点4位）", example="5.0")
    private BigDecimal itemUsePrice;
    @ApiCloudField(value="销售单位", example="公斤", required=true)
    private String itemUseUnit;
    @ApiCloudField(value="备注", example="备注信息")
    private String itemMemo;
    @ApiCloudField(value="批次号", example="20210118")
    private String itemLotNumber;
    @ApiCloudField(value="生产日期 格式：yyyy-MM-dd", example="2021-01-18")
    private String itemProducingDate;
    @ApiCloudField(value="赠品单位", example="公斤")
    private String itemPresentUnit;
    @ApiCloudField(value="赠品数量（小数点3位）", example="1.0")
    private BigDecimal itemPresentQty;
    @ApiCloudField(value="基本数量（小数点3位）", example="1.0")
    private BigDecimal itemQty;
    @ApiCloudField(value="赠品基本数量（小数点3位）", example="1.0")
    private BigDecimal itemPresentBasicQty;
}
