package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * CheckTaskDetailVO模型
 * 任务明细列表
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CheckTaskDetailVOModel extends ApiCloudObject {

    @ApiCloudField(value="明细编号", example="1")
    private Integer detailNum;
    @ApiCloudField(value="库位编码", example="8070")
    private Long positionNum;
    @ApiCloudField(value="库位名称", example="jh001")
    private String positionName;
    @ApiCloudField(value="商品编码", example="434400016")
    private Integer itemNum;
    @ApiCloudField(value="商品代码", example="10001")
    private String itemCode;
    @ApiCloudField(value="商品名称", example="苹果")
    private String itemName;
    @ApiCloudField(value="商品条码", example="211330478")
    private String itemBarcode;
    @ApiCloudField(value="商品规格", example="1箱*10公斤")
    private String itemSpec;
    @ApiCloudField(value="生产日期", example="Thu Aug 03 08:00:00 CST 2023")
    private String itemProductDate;
    @ApiCloudField(value="批次号", example="20230803")
    private String itemLotNum;
    @ApiCloudField(value="库存单位", example="公斤")
    private String itemInventoryUseUnit;
    @ApiCloudField(value="库存数量", example="50.0")
    private BigDecimal inventoryUseQty;
    @ApiCloudField(value="损益数量（小数点3位）", example="-50.0")
    private BigDecimal itemDiffUseQty;
    @ApiCloudField(value="盘点整件单位", example="包")
    private String itemUseUnit;
    @ApiCloudField(value="盘点整件数量（小数点3位）", example="1.0")
    private BigDecimal itemUseQty;
    @ApiCloudField(value="盘点拆零单位", example="包")
    private String itemPartUnit;
    @ApiCloudField(value="盘点拆零数量（小数点3位）", example="1.0")
    private BigDecimal itemPartQty;
    @ApiCloudField(value="库存基本单位", example="公斤")
    private String itemInventoryUnit;
    @ApiCloudField(value="库存基本数量（小数点3位）", example="1.0")
    private BigDecimal itemInventoryQty;
    @ApiCloudField(value="盘点基本单位", example="公斤")
    private String itemUnit;
    @ApiCloudField(value="盘点基本数量（小数点3位）", example="1.0")
    private BigDecimal itemQty;
    @ApiCloudField(value="损益基本数量（小数点3位）", example="-1.0")
    private BigDecimal itemDiffQty;
    @ApiCloudField(value="盘点人", example="wfy")
    private String checkUser;
    @ApiCloudField(value="盘点时间")
    private String checkTime;
    @ApiCloudField(value="备注", example="")
    private String itemMemo;
}
