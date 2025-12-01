package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * InOrderDetailV2DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class InOrderDetailV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="明细编号", example="1")
    private Integer inOrderDetailNum;
    @ApiCloudField(value="商品编码", example="532599872")
    private Integer itemNum;
    @ApiCloudField(value="调入数量（小数点3位）", example="10.0")
    private BigDecimal itemUseQty;
    @ApiCloudField(value="调入单价（小数点4位）", example="5.0")
    private BigDecimal itemUsePrice;
    @ApiCloudField(value="调入单位", example="公斤")
    private String itemUseUnit;
    @ApiCloudField(value="商品名称", example="苹果")
    private String itemName;
    @ApiCloudField(value="换算率（小数点3位）", example="0.1")
    private BigDecimal itemUseRate;
    @ApiCloudField(value="基本单位数量（小数点3位）", example="1.0")
    private BigDecimal itemQty;
    @ApiCloudField(value="基本单位", example="公斤")
    private String itemUnit;
    @ApiCloudField(value="商品代码", example="000000000041")
    private String itemCode;
    @ApiCloudField(value="商品规格", example="1箱*10公斤")
    private String itemSpec;
    @ApiCloudField(value="商品备注", example="备注信息")
    private String itemMemo;
    @ApiCloudField(value="批次号", example="20210101")
    private String itemLotNumber;
    @ApiCloudField(value="生产日期(yyyy-mm-dd)", example="2021-01-01")
    private String itemProductDate;
    @ApiCloudField(value="赠品数量（小数点3位）", example="1.0")
    private BigDecimal itemPresentQty;
    @ApiCloudField(value="赠品基本数量（小数点3位）", example="1.0")
    private BigDecimal itemPresentBasicQty;
    @ApiCloudField(value="赠品单位", example="公斤")
    private String itemPresentUnit;
    @ApiCloudField(value="不含税金额（小数点2位）", example="1.0")
    private BigDecimal detailNoTaxMoney;
    @ApiCloudField(value="税率（小数点2位）", example="0.03")
    private BigDecimal detailTaxRate;
    @ApiCloudField(value="税额（小数点2位）", example="0.03")
    private BigDecimal detailTaxMoney;
    @ApiCloudField(value="成本金额（小数点2位）", example="1.0")
    private BigDecimal detailSubTotal;
    @ApiCloudField(value="含税金额（小数点2位）", example="1.0")
    private BigDecimal detailSaleSubTotal;
    @ApiCloudField(value="业务系统未启用进销税项时税率（小数点2位）", example="0.03")
    private BigDecimal detailOtherTaxRate;
    @ApiCloudField(value="业务系统未启用进销税项时税额（小数点2位）", example="1.0")
    private BigDecimal detailOtherTaxMoney;
    @ApiCloudField(value="成本单价", example="1.0")
    private BigDecimal itemDetailCost;
}
