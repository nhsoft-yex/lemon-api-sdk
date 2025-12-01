package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ReceiveOrderDetailFindV2DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ReceiveOrderDetailFindV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="明细编号", example="1")
    private Integer detailNum;
    @ApiCloudField(value="商品编码", example="150050001")
    private Integer itemNum;
    @ApiCloudField(value="收货数量（小数点3位）", example="1.0")
    private BigDecimal itemUseQty;
    @ApiCloudField(value="收货单价（小数点4位）", example="1.0")
    private BigDecimal itemUsePrice;
    @ApiCloudField(value="收货单位", example="公斤")
    private String itemUseUnit;
    @ApiCloudField(value="商品名称", example="苹果")
    private String itemName;
    @ApiCloudField(value="商品换算率（小数点3位）", example="1.0")
    private BigDecimal itemUseRate;
    @ApiCloudField(value="基本单位数量（小数点3位）", example="1.0")
    private BigDecimal itemQty;
    @ApiCloudField(value="基本单位", example="公斤")
    private String itemUnit;
    @ApiCloudField(value="商品代码", example="10001")
    private String itemCode;
    @ApiCloudField(value="商品规格", example="1箱*10公斤")
    private String itemSpec;
    @ApiCloudField(value="批次号", example="20210120")
    private String itemLotNumber;
    @ApiCloudField(value="批次备注", example="备注信息")
    private String itemLotMemo;
    @ApiCloudField(value="生产日期", example="2021-01-30")
    private String itemProducingDate;
    @ApiCloudField(value="赠品单位", example="公斤")
    private String itemPresentUnit;
    @ApiCloudField(value="赠品数量（小数点3位）", example="1.0")
    private BigDecimal itemPresentQty;
    @ApiCloudField(value="赠品基本数量")
    private BigDecimal itemPresentBasicQty;
    @ApiCloudField(value="成本金额（小数点2位）", example="1.0")
    private BigDecimal detailSubTotal;
    @ApiCloudField(value="不含税金额（小数点2位）", example="1.0")
    private BigDecimal detailNoTaxMoney;
    @ApiCloudField(value="税率（小数点2位）", example="0.03")
    private BigDecimal detailTaxRate;
    @ApiCloudField(value="税额（小数点2位）", example="0.03")
    private BigDecimal detailTaxMoney;
    @ApiCloudField(value="业务系统未启用进销税项时税率（小数点2位）", example="0.03")
    private BigDecimal detailOtherTaxRate;
    @ApiCloudField(value="业务系统未启用进销税项时税额（小数点2位）", example="1.0")
    private BigDecimal detailOtherTaxMoney;
    @ApiCloudField(value="备注", example="备注信息")
    private String itemMemo;
    @ApiCloudField(value="皮重", example="1.0")
    private BigDecimal itemTare;
    @ApiCloudField(value="运费金额(总额)", example="1.0")
    private BigDecimal deliveryMoney;
    @ApiCloudField(value="有效天数", example="60")
    private String detailPeriod;
    @ApiCloudField(value="最近进价", example="1.25")
    private BigDecimal detailLastPrice;
}
