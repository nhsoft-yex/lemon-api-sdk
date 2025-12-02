package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * WholesaleReturnDetailDTO模型
 * 批发退货明细
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class WholesaleReturnDetailDTOModel extends ApiCloudObject {

    @ApiCloudField(value="明细编号", example="1")
    private Integer detailNum;
    @ApiCloudField(value="商品编码", example="150050001")
    private Integer itemNum;
    @ApiCloudField(value="销售数量（小数点3位）", example="5.0")
    private BigDecimal itemUseQty;
    @ApiCloudField(value="销售单价（小数点4位）", example="5.0")
    private BigDecimal itemUsePrice;
    @ApiCloudField(value="销售单位", example="公斤")
    private String itemUseUnit;
    @ApiCloudField(value="商品名称", example="苹果")
    private String itemName;
    @ApiCloudField(value="商品换算率（小数点3位）", example="10.0")
    private BigDecimal itemUseRate;
    @ApiCloudField(value="基本单位数量（小数点3位）", example="1.0")
    private BigDecimal itemQty;
    @ApiCloudField(value="基本单位", example="箱")
    private String itemUnit;
    @ApiCloudField(value="商品代码", example="1001")
    private String itemCode;
    @ApiCloudField(value="商品规格", example="1箱*10公斤")
    private String itemSpec;
    @ApiCloudField(value="备注", example="备注信息")
    private String itemMemo;
    @ApiCloudField(value="批次号", example="20210118")
    private String itemLotNumber;
    @ApiCloudField(value="生产日期", example="2021-01-18")
    private String itemProducingDate;
    @ApiCloudField(value="赠品单位", example="公斤")
    private String itemPresentUnit;
    @ApiCloudField(value="赠品数量（小数点3位）", example="1.0")
    private BigDecimal itemPresentQty;
    @ApiCloudField(value="赠品基本数量")
    private BigDecimal itemPresentBasicQty;
    @ApiCloudField(value="销售金额（小数点2位）", example="5.0")
    private BigDecimal itemPaymentMoney;
    @ApiCloudField(value="销售成本（小数点2位）", example="5.0")
    private BigDecimal itemCostMoney;
    @ApiCloudField(value="经营方式", example="联营")
    private String managementStyleType;
    @ApiCloudField(value="供应商编码", example="434400001")
    private Integer supplierNum;
    @ApiCloudField(value="是否有商品组合明细", example="true")
    private Boolean returnDetailHasKit;
    @ApiCloudField(value="不含税金额（小数点2位）", example="1.0")
    private BigDecimal detailNoTaxMoney;
    @ApiCloudField(value="税率（小数点2位）", example="0.03")
    private BigDecimal detailTaxRate;
    @ApiCloudField(value="税额（小数点2位）", example="0.03")
    private BigDecimal detailTaxMoney;
    @ApiCloudField(value="金额（小数点2位）", example="1.0")
    private BigDecimal detailMoney;
    @ApiCloudField(value="业务系统未启用进销税项时税率（小数点2位）", example="0.03")
    private BigDecimal detailOtherTaxRate;
    @ApiCloudField(value="业务系统未启用进销税项时税额（小数点2位）", example="1.0")
    private BigDecimal detailOtherTaxMoney;
    @ApiCloudField(value="商品组合明细", example="")
    private List<WholesaleOrderKitDetailDTOModel> orderKitDetails;
}
