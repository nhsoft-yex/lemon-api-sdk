package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * WarehouseSummaryVO模型
 * 入库明细
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class WarehouseSummaryVOModel extends ApiCloudObject {

    @ApiCloudField(value="审核时间")
    private String auditTime;
    @ApiCloudField(value="审核人", example="admin")
    private String auditor;
    @ApiCloudField(value="基本数量", example="10.0")
    private BigDecimal baseQty;
    @ApiCloudField(value="基本数量合计", example="10.0")
    private BigDecimal baseQtySum;
    @ApiCloudField(value="基本单位", example="公斤")
    private String baseUnit;
    @ApiCloudField(value="商品条码", example="30001")
    private String itemBarcode;
    @ApiCloudField(value="商品代码", example="30001")
    private String itemCode;
    @ApiCloudField(value="商品名称", example="ch的标准02")
    private String itemName;
    @ApiCloudField(value="商品系统编码", example="15")
    private Integer itemNum;
    @ApiCloudField(value="批次号", example="20250401")
    private String lotNum;
    @ApiCloudField(value="入库类型", example="调整入库")
    private String orderType;
    @ApiCloudField(value="ERP单号", example="MO99658990002313")
    private String outOrderFid;
    @ApiCloudField(value="库位名称", example="zfb集货位")
    private String positionName;
    @ApiCloudField(value="生产日期", example="Tue Apr 01 08:00:00 CST 2025")
    private String productionDate;
    @ApiCloudField(value="原因", example="入库")
    private String reason;
    @ApiCloudField(value="仓库名称", example="仓库A")
    private String storehouseName;
    @ApiCloudField(value="仓库编码", example="996580001")
    private Integer storehouseNum;
    @ApiCloudField(value="供应商编号", example="996580001")
    private Integer supplierNum;
    @ApiCloudField(value="数量", example="21")
    private Integer total;
    @ApiCloudField(value="数量", example="20.0")
    private BigDecimal useQty;
    @ApiCloudField(value="换算率", example="1.0")
    private BigDecimal useRate;
    @ApiCloudField(value="有效截止时间")
    private String validTime;
    @ApiCloudField(value="入库订单号", example="RD996589925086000001")
    private String warehouseBookOrderFid;
    @ApiCloudField(value="入库单号", example="RK996589925084000001")
    private String warehouseOrderFid;
    @ApiCloudField(value="调整原因", example="入库")
    private String adjustReason;
    @ApiCloudField(value="卸货方式", example="自卸")
    private String unloadingType;
}
