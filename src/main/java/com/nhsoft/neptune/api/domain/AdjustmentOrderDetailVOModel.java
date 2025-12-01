package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * AdjustmentOrderDetailVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class AdjustmentOrderDetailVOModel extends ApiCloudObject {

    @ApiCloudField(value="明细编号", example="1")
    private Integer detailNum;
    @ApiCloudField(value="商品编码", example="150050001")
    private Integer itemNum;
    @ApiCloudField(value="调整数量（小数点3位）", example="1.0")
    private BigDecimal itemUseQty;
    @ApiCloudField(value="调整单价", example="1.0")
    private BigDecimal itemUsePrice;
    @ApiCloudField(value="调整单位", example="公斤")
    private String itemUseUnit;
    @ApiCloudField(value="商品名称", example="苹果")
    private String itemName;
    @ApiCloudField(value="商品换算率", example="1.0")
    private BigDecimal itemUseRate;
    @ApiCloudField(value="基本单位数量（小数点3位）", example="1.0")
    private BigDecimal itemQty;
    @ApiCloudField(value="基本单位", example="公斤")
    private String itemUnit;
    @ApiCloudField(value="商品代码", example="1001")
    private String itemCode;
    @ApiCloudField(value="商品规格", example="1箱*10公斤")
    private String itemSpec;
    @ApiCloudField(value="批次号", example="20210120")
    private String itemLotNumber;
    @ApiCloudField(value="生产日期(yyyy-MM-dd)", example="2021-01-20")
    private String itemProductDate;
    @ApiCloudField(value="备注", example="备注信息")
    private String itemMemo;
    @ApiCloudField(value="含税金额", example="40.0")
    private BigDecimal adjustmentOrderDetailSubtotal;
}
