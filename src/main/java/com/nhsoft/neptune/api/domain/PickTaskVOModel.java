package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PickTaskVO模型
 * 拣货任务VO
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PickTaskVOModel extends ApiCloudObject {

    @ApiCloudField(value="波次计划单编号", example="BC996589925062000001")
    private String wavePlanFid;
    @ApiCloudField(value="仓库名称", example="系统默认仓库")
    private String storehouseName;
    @ApiCloudField(value="仓库编号", example="996580001")
    private Integer storehouseNum;
    @ApiCloudField(value="创建人", example="admin")
    private String creator;
    @ApiCloudField(value="创建时间")
    private String createTime;
    @ApiCloudField(value="计划分拣量", example="1.0")
    private BigDecimal planUseQty;
    @ApiCloudField(value="已拣数量", example="1.0")
    private BigDecimal pickedUseQty;
    @ApiCloudField(value="集货状态", example="已集货")
    private String collectionState;
    @ApiCloudField(value="商品名称", example="ch的标准02")
    private String itemName;
    @ApiCloudField(value="商品系统编码", example="15")
    private Integer itemNum;
    @ApiCloudField(value="商品条码", example="30001")
    private String itemBarcode;
    @ApiCloudField(value="商品代码", example="30005")
    private String itemCode;
    @ApiCloudField(value="客户编码", example="5597")
    private String clientNum;
    @ApiCloudField(value="客户名称", example="分店13")
    private String clientName;
    @ApiCloudField(value="客户代码", example="5584")
    private String clientCode;
    @ApiCloudField(value="拣货计划编号", example="FJ996589925062000001")
    private String pickTaskFid;
    @ApiCloudField(value="明细编号", example="1")
    private Integer pickTaskDetailNum;
    @ApiCloudField(value="基本单位", example="公斤")
    private String baseUnit;
    @ApiCloudField(value="常用单位", example="件")
    private String useUnit;
    @ApiCloudField(value="常用数量换算率", example="10.0")
    private BigDecimal useRate;
    @ApiCloudField(value="基本数量", example="1.0")
    private BigDecimal baseQty;
    @ApiCloudField(value="分拣差异数量", example="1.0")
    private BigDecimal differencesQty;
    @ApiCloudField(value="分拣差异换算率", example="1.0")
    private BigDecimal differencesRate;
    @ApiCloudField(value="常用数量", example="1.0")
    private BigDecimal useQty;
    @ApiCloudField(value="订购数量", example="1.0")
    private BigDecimal orderUseQty;
    @ApiCloudField(value="是否缺货", example="true")
    private Boolean shortageFlag;
    @ApiCloudField(value="出库订单号", example="CD996589925062000002")
    private String outWarehouseBookOrderFid;
    @ApiCloudField(value="领取人编号", example="1")
    private Integer ownerUserNum;
    @ApiCloudField(value="领取人", example="admin")
    private String ownerUserName;
    @ApiCloudField(value="领取时间")
    private String ownerGetTime;
    @ApiCloudField(value="集货时间")
    private String collectionTime;
    @ApiCloudField(value="集货库位", example="JH001")
    private String collectionPositionName;
    @ApiCloudField(value="上次集货员", example="admin")
    private String lastCollectionUser;
    @ApiCloudField(value="上次集货时间")
    private String lastCollectionTime;
}
