package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PickTaskDetailVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PickTaskDetailVOModel extends ApiCloudObject {

    @ApiCloudField(value="商品编码", example="1")
    private Integer itemNum;
    @ApiCloudField(value="商品条码", example="1300001")
    private String itemBarcode;
    @ApiCloudField(value="商品名称", example="可乐")
    private String itemName;
    @ApiCloudField(value="商品代码", example="cs001")
    private String itemCode;
    @ApiCloudField(value="拣货计划编号", example="FJ996589925062000001")
    private String pickTaskFid;
    @ApiCloudField(value="明细编号", example="1")
    private Integer pickTaskDetailNum;
    @ApiCloudField(value="拣货明细行号", example="1")
    private String pickTaskDetailLnNum;
    @ApiCloudField(value="仓库编号", example="996580001")
    private Integer storehouseNum;
    @ApiCloudField(value="波次计划单编号", example="BC996589925062000001")
    private String wavePlanFid;
    @ApiCloudField(value="客户编码", example="5597")
    private String clientNum;
    @ApiCloudField(value="批次号", example="20250101")
    private String lotNum;
    @ApiCloudField(value="生产日期")
    private String productionDate;
    @ApiCloudField(value="已拣数量", example="1.0")
    private BigDecimal useQty;
    @ApiCloudField(value="换算率", example="1.0")
    private BigDecimal useRate;
    @ApiCloudField(value="基本数量", example="1.0")
    private BigDecimal baseQty;
    @ApiCloudField(value="常用单位", example="件")
    private String useUnit;
    @ApiCloudField(value="基本单位", example="公斤")
    private String baseUnit;
    @ApiCloudField(value="拆零标记", example="true")
    private Boolean itemSplitFlag;
    @ApiCloudField(value="库位编号", example="49590")
    private Long sourcePositionNum;
    @ApiCloudField(value="库位名称", example="CZ-01-L01-1")
    private String sourcePositionName;
    @ApiCloudField(value="拣货员编号", example="1")
    private Integer pickUserNum;
    @ApiCloudField(value="拣货员", example="admin")
    private String pickUserName;
    @ApiCloudField(value="拣货时间")
    private String pickTime;
    @ApiCloudField(value="集货时间")
    private String collectionTime;
    @ApiCloudField(value="集货单编号", example="GH996589925188000001")
    private String collectionFid;
    @ApiCloudField(value="客户名称", example="上海新海")
    private String clientName;
    @ApiCloudField(value="客户代码", example="5597")
    private String clientCode;
    @ApiCloudField(value="状态(拣货完成|已集货|已发车|取消)", example="拣货完成")
    private String collectionState;
    @ApiCloudField(value="司机完成时间")
    private String driverCompleteTime;
    @ApiCloudField(value="缺货标识", example="true")
    private Boolean shortageFlag;
    @ApiCloudField(value="仓库名称", example="上海新海")
    private String storehouseName;
}
