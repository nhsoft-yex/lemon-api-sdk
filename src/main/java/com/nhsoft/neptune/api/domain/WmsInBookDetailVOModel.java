package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * WmsInBookDetailVO模型
 * WMS入库单明细
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class WmsInBookDetailVOModel extends ApiCloudObject {

    @ApiCloudField(value="明细编号", example="1")
    private Integer detailNum;
    @ApiCloudField(value="商品编码", example="434400016")
    private Integer itemNum;
    @ApiCloudField(value="商品名称", example="苹果")
    private String itemName;
    @ApiCloudField(value="商品规格", example="1箱*10公斤")
    private String itemSpec;
    @ApiCloudField(value="商品代码", example="10001")
    private String itemCode;
    @ApiCloudField(value="基本单位", example="公斤")
    private String itemUnit;
    @ApiCloudField(value="基本单位数量（小数点3位）", example="1.0")
    private BigDecimal itemQty;
    @ApiCloudField(value="基本单价（小数点4位）", example="1.0")
    private BigDecimal itemPrice;
    @ApiCloudField(value="出库数量（小数点3位）", example="1.0")
    private BigDecimal itemUseQty;
    @ApiCloudField(value="出库单价（小数点4位）", example="1.0")
    private BigDecimal itemUsePrice;
    @ApiCloudField(value="出库单位", example="公斤")
    private String itemUseUnit;
    @ApiCloudField(value="赠品常用单位", example="公斤")
    private String itemPresentUseUnit;
    @ApiCloudField(value="赠品常用数量（小数点3位）", example="1.0")
    private BigDecimal itemPresentUseQty;
    @ApiCloudField(value="赠品单位", example="公斤")
    private String itemPresentUnit;
    @ApiCloudField(value="赠品数量（小数点3位）", example="1.0")
    private BigDecimal itemPresentQty;
    @ApiCloudField(value="常用单位换算率（小数点3位）", example="1.0")
    private BigDecimal itemUseRate;
    @ApiCloudField(value="明细金额（小数点2位）", example="5.0")
    private BigDecimal itemMoney;
    @ApiCloudField(value="备注", example="备注内容")
    private String itemMemo;
}
