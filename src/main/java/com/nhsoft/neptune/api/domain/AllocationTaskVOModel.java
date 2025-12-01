package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * AllocationTaskVO模型
 * 移库记录
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class AllocationTaskVOModel extends ApiCloudObject {

    @ApiCloudField(value="移库任务号", example="YK996589925062000003")
    private String allocationTaskFid;
    @ApiCloudField(value="任务类型", example="移库")
    private String allocationTaskType;
    @ApiCloudField(value="营业日", example="20250301")
    private String bizday;
    @ApiCloudField(value="创建来源", example="APP")
    private String createSource;
    @ApiCloudField(value="创建时间")
    private String createTime;
    @ApiCloudField(value="创建人", example="admin")
    private String creator;
    @ApiCloudField(value="门店编号", example="99")
    private Integer branchNum;
    @ApiCloudField(value="商品条码", example="30001")
    private String itemBarcode;
    @ApiCloudField(value="基本单位", example="公斤")
    private String itemBaseUnit;
    @ApiCloudField(value="商品代码", example="30005")
    private String itemCode;
    @ApiCloudField(value="商品名称", example="ch的标准02")
    private String itemName;
    @ApiCloudField(value="商品系统编码", example="15")
    private Integer itemNum;
    @ApiCloudField(value="是否拆零", example="true")
    private Boolean itemSplitIs;
    @ApiCloudField(value="常用单位", example="件")
    private String itemUseUnit;
    @ApiCloudField(value="批次号", example="20250101")
    private String lotNum;
    @ApiCloudField(value="计划基本数量", example="10.0")
    private BigDecimal planBaseQty;
    @ApiCloudField(value="计划常用数量", example="10.0")
    private BigDecimal planUseQty;
    @ApiCloudField(value="生产日期")
    private String productionDate;
    @ApiCloudField(value="实收基本数量", example="10.0")
    private BigDecimal realBaseQty;
    @ApiCloudField(value="明细常用数量合计", example="10.0")
    private BigDecimal realDetailUseQty;
    @ApiCloudField(value="实收常用数量", example="10.0")
    private BigDecimal realUseQty;
    @ApiCloudField(value="补货方式", example="1")
    private Integer replenishmentMode;
    @ApiCloudField(value="源库位名称", example="SHZC01")
    private String sourcePositionName;
    @ApiCloudField(value="源库位编号", example="49590")
    private Integer sourcePositionNum;
    @ApiCloudField(value="单据状态编码", example="3")
    private Integer stateCode;
    @ApiCloudField(value="单据状态", example="制单|审核")
    private String stateName;
    @ApiCloudField(value="仓库名称", example="系统默认仓库")
    private String storehouseName;
    @ApiCloudField(value="仓库编号", example="996580001")
    private Integer storehouseNum;
    @ApiCloudField(value="目标库位名称", example="CZ-01-L01-1")
    private String targetPositionName;
    @ApiCloudField(value="目标库位编号", example="49590")
    private Integer targetPositionNum;
    @ApiCloudField(value="目标仓库名称", example="系统默认仓库")
    private String targetStorehouseName;
    @ApiCloudField(value="目标仓库编号", example="996580001")
    private Integer targetStorehouseNum;
    @ApiCloudField(value="更新时间")
    private String updateTime;
    @ApiCloudField(value="更新人", example="admin")
    private String updator;
}
