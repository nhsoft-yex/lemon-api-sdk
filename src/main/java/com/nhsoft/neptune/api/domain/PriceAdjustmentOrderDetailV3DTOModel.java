package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PriceAdjustmentOrderDetailV3DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PriceAdjustmentOrderDetailV3DTOModel extends ApiCloudObject {

    @ApiCloudField(value="明细编号", example="1")
    private Integer detailNum;
    @ApiCloudField(value="商品编码", example="150050001")
    private Integer itemNum;
    @ApiCloudField(value="商品名称", example="苹果")
    private String itemName;
    @ApiCloudField(value="原基本单价（小数点4位）", example="1.0")
    private BigDecimal itemOldPrice;
    @ApiCloudField(value="调整后单价（小数点4位）", example="1.0")
    private BigDecimal itemPrice;
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
    @ApiCloudField(value="生产日期(yyyy-MM-dd)", example="2021-01-20")
    private String itemProductDate;
    @ApiCloudField(value="备注", example="备注信息")
    private String itemMemo;
    @ApiCloudField(value="常用单位", example="公斤")
    private String itemUseUnit;
    @ApiCloudField(value="常用数量")
    private BigDecimal itemUseQty;
    @ApiCloudField(value="含税金额差", example="200.0")
    private BigDecimal totalAmount;
}
