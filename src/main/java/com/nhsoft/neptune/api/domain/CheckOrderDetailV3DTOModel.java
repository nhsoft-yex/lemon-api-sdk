package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * CheckOrderDetailV3DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CheckOrderDetailV3DTOModel extends ApiCloudObject {

    @ApiCloudField(value="明细编号", example="1")
    private Integer detailNum;
    @ApiCloudField(value="商品编码", example="150050001")
    private Integer itemNum;
    @ApiCloudField(value="盘点数量（小数点3位）", example="1.0")
    private BigDecimal itemUseQty;
    @ApiCloudField(value="盘点单价（小数点4位）", example="1.0")
    private BigDecimal itemUsePrice;
    @ApiCloudField(value="盘点单位", example="公斤")
    private String itemUseUnit;
    @ApiCloudField(value="商品名称", example="苹果")
    private String itemName;
    @ApiCloudField(value="商品换算率", example="1.0")
    private BigDecimal itemUseRate;
    @ApiCloudField(value="基本单位数量（小数点3位）", example="1.0")
    private BigDecimal itemQty;
    @ApiCloudField(value="基本单位", example="公斤")
    private String itemUnit;
    @ApiCloudField(value="商品代码", example="1001")
    private String itemCode;
    @ApiCloudField(value="商品规格", example="1箱*10公斤")
    private String itemSpec;
    @ApiCloudField(value="批次号", example="20210120")
    private String itemLotNumber;
    @ApiCloudField(value="生产日期(yyyy-mm-dd)", example="2021-01-20")
    private String itemProductDate;
    @ApiCloudField(value="备注", example="备注信息")
    private String itemMemo;
    @ApiCloudField(value="库存数量", example="1.0")
    private BigDecimal itemStockAmount;
    @ApiCloudField(value="盈亏基本数量(仅已审核+差异处理的商品返回)", example="1.0")
    private BigDecimal itemDiffAmount;
    @ApiCloudField(value="盈亏金额(仅已审核+差异处理的商品返回)", example="1.0")
    private BigDecimal itemDiffMoney;
}
