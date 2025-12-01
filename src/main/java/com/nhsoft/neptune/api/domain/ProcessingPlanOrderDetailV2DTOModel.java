package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ProcessingPlanOrderDetailV2DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ProcessingPlanOrderDetailV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="商品编码", example="43440001")
    private Integer itemNum;
    @ApiCloudField(value="商品名称", example="苹果")
    private String itemName;
    @ApiCloudField(value="商品代码", example="0001")
    private String itemCode;
    @ApiCloudField(value="商品规格", example="1箱")
    private String itemSpec;
    @ApiCloudField(value="基本数量", example="1")
    private BigDecimal itemQty;
    @ApiCloudField(value="基本单位", example="公斤")
    private String itemUnit;
    @ApiCloudField(value="常用数量", example="1")
    private BigDecimal itemUseQty;
    @ApiCloudField(value="常用单位", example="公斤")
    private String itemUseUnit;
    @ApiCloudField(value="备注", example="")
    private String itemMemo;
}
