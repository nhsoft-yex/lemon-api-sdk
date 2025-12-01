package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * AllocationOrderDetailVO模型
 * 移库任务明细
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class AllocationOrderDetailVOModel extends ApiCloudObject {

    @ApiCloudField(value="移库任务编号", example="YK996589924134000001")
    private String allocationTaskFid;
    @ApiCloudField(value="明细编号", example="1")
    private Integer detailNum;
    @ApiCloudField(value="门店编号", example="99")
    private Integer branchNum;
    @ApiCloudField(value="仓库编号", example="996580001")
    private Integer outStorehouseNum;
    @ApiCloudField(value="仓库名称", example="系统默认仓库")
    private String outStorehouseName;
    @ApiCloudField(value="移入仓库编号", example="996580001")
    private Long inStorehouseNum;
    @ApiCloudField(value="移入仓库名称", example="系统默认仓库")
    private String inStorehouseName;
    @ApiCloudField(value="原始库位编号", example="11619")
    private Long sourcePositionNum;
    @ApiCloudField(value="目标库位编号", example="11619")
    private String targetPositionNum;
    @ApiCloudField(value="原始库位名称", example="A-01-L01-2")
    private String sourcePositionName;
    @ApiCloudField(value="目标库位名称", example="A-01-L01-1")
    private String targetPositionName;
    @ApiCloudField(value="移库类型(移库|计划移库)", example="移库")
    private String allocationTaskType;
    @ApiCloudField(value="商品编码", example="996580001")
    private Integer itemNum;
    @ApiCloudField(value="商品名称", example="测试商品")
    private String itemName;
    @ApiCloudField(value="商品代码", example="30007")
    private String itemCode;
    @ApiCloudField(value="商品条码", example="30007")
    private String itemBarcode;
    @ApiCloudField(value="常用单位", example="件")
    private String itemUseUnit;
    @ApiCloudField(value="基本单位", example="公斤")
    private String itemUnit;
    @ApiCloudField(value="生产日期", example="Thu Jun 06 08:00:00 CST 2024")
    private String productionDate;
    @ApiCloudField(value="批次号", example="20240606")
    private String lotNum;
    @ApiCloudField(value="换算率", example="1.0")
    private BigDecimal itemUseRate;
    @ApiCloudField(value="常用数量", example="1.0")
    private BigDecimal itemUseQty;
    @ApiCloudField(value="基本数量", example="1.0")
    private BigDecimal itemQty;
    @ApiCloudField(value="操作人", example="admin")
    private String operator;
    @ApiCloudField(value="完成时间")
    private String completeTime;
    @ApiCloudField(value="单据完成人", example="admin")
    private String completor;
    @ApiCloudField(value="商品规格", example="1*6罐")
    private String itemSpec;
}
