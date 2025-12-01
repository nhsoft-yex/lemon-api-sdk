package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * SupplierAppointTaskDetailVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class SupplierAppointTaskDetailVOModel extends ApiCloudObject {

    @ApiCloudField(value="预约明细编号", example="1")
    private Integer supplierAppointTaskDetailNum;
    @ApiCloudField(value="商品编号", example="99")
    private Integer itemNum;
    @ApiCloudField(value="商品名称", example="WMS供应链一号商品")
    private String itemName;
    @ApiCloudField(value="商品代码", example="00011")
    private String itemCode;
    @ApiCloudField(value="商品规格", example="规格")
    private String itemSpec;
    @ApiCloudField(value="商品条码", example="00011")
    private String itemBarcode;
    @ApiCloudField(value="商品单位", example="件")
    private String itemUnit;
    @ApiCloudField(value="基本单位", example="件")
    private String itemBaseUnit;
    @ApiCloudField(value="采购数量", example="1")
    private BigDecimal purchaseUseQty;
    @ApiCloudField(value="收货数量", example="1")
    private BigDecimal receiveUseQty;
    @ApiCloudField(value="预约数量", example="1")
    private BigDecimal deliveryUseQty;
    @ApiCloudField(value="预约基本数量", example="1")
    private BigDecimal deliveryBaseQty;
    @ApiCloudField(value="预约门店名称", example="门店名称")
    private String deliverBranchName;
    @ApiCloudField(value="赠品基本数量", example="1")
    private BigDecimal presentBaseQty;
    @ApiCloudField(value="赠品数量", example="1")
    private BigDecimal presentUseQty;
    @ApiCloudField(value="赠品基本单位", example="件")
    private String itemPresentBaseUnit;
    @ApiCloudField(value="赠品常用单位", example="件")
    private String itemPresentUseUnit;
    @ApiCloudField(value="换算率", example="1")
    private BigDecimal useRate;
    @ApiCloudField(value="商品有效期", example="100")
    private Integer itemValidPeriod;
    @ApiCloudField(value="是否标准商品", example="true")
    private Boolean stdFlag;
}
