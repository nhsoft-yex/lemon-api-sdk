package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * RequestDetailV2DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class RequestDetailV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="商品编码", required=true)
    private Integer itemNum;
    @ApiCloudField(value="要货单位", example="公斤", required=true)
    private String itemUseUnit;
    @ApiCloudField(value="要货数量（小数点3位）", example="1.0", required=true)
    private BigDecimal itemUseQty;
    @ApiCloudField(value="要货单价（小数点4位）", example="5.0")
    private BigDecimal itemUsePrice;
    @ApiCloudField(value="备注", example="备注信息")
    private String itemMemo;
    @ApiCloudField(value="赠品数量（小数点3位）", example="1.0")
    private BigDecimal itemPresentQty;
    @ApiCloudField(value="赠品基本数量（小数点3位）", example="1.0")
    private BigDecimal itemPresentBasicQty;
    @ApiCloudField(value="赠品单位", example="公斤")
    private String itemPresentUnit;
}
