package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ShelveLogVO模型
 * 上架记录
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ShelveLogVOModel extends ApiCloudObject {

    @ApiCloudField(value="基本数量", example="1.0")
    private BigDecimal baseQty;
    @ApiCloudField(value="营业日", example="20250301")
    private String bizday;
    @ApiCloudField(value="容器的序列号", example="1")
    private String containerNumber;
    @ApiCloudField(value="门店编号", example="99")
    private Integer branchNum;
    @ApiCloudField(value="商品代码", example="30001")
    private String itemBarcode;
    @ApiCloudField(value="基本单位", example="公斤")
    private String itemBaseUnit;
    @ApiCloudField(value="商品代码", example="30005")
    private String itemCode;
    @ApiCloudField(value="商品名称", example="ch的标准02")
    private String itemName;
    @ApiCloudField(value="商品系统编码", example="15")
    private Integer itemNum;
    @ApiCloudField(value="常用单位", example="件")
    private String itemUseUnit;
    @ApiCloudField(value="批次号", example="20250101")
    private String lotNum;
    @ApiCloudField(value="操作时间")
    private String operateTime;
    @ApiCloudField(value="操作人", example="admin")
    private String operator;
    @ApiCloudField(value="生产日期", example="Wed Jan 01 08:00:00 CST 2025")
    private String productionDate;
    @ApiCloudField(value="操作记录编号", example="1")
    private Integer shelveLogNum;
    @ApiCloudField(value="源库位名称", example="SHZC01")
    private String sourcePositionName;
    @ApiCloudField(value="源库位编号", example="49590")
    private Integer sourcePositionNum;
    @ApiCloudField(value="仓库名称", example="系统默认仓库")
    private String storehouseName;
    @ApiCloudField(value="仓库编号", example="9965800001")
    private Integer storehouseNum;
    @ApiCloudField(value="目标库位名称", example="CZ-01-L01-1")
    private String targetPositionName;
    @ApiCloudField(value="目标库位编号", example="49590")
    private Integer targetPositionNum;
    @ApiCloudField(value="有效期")
    private String untilDate;
    @ApiCloudField(value="常用数量", example="11.0")
    private BigDecimal useQty;
}
