package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * InventoryDailyByDayFindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class InventoryDailyByDayFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="门店编码列表", example="[1]", required=true)
    private List<Integer> branchNums;
    @ApiCloudField(value="商品编码列表", example="[43440001]")
    private List<Integer> itemNums;
    @ApiCloudField(value="商品类别代码列表", example="[10050]")
    private List<String> itemCategoryCodes;
    @ApiCloudField(value="仓库编码", example="43440001")
    private Integer storehouseNum;
    @ApiCloudField(value="查询日期", example="20200101", required=true)
    private String bizDay;
    @ApiCloudField(value="汇总方式(门店,商品,类别)", example="门店", required=true)
    private String summaryType;
    @ApiCloudField(value="不显示删除商品", example="false")
    private Boolean noDelItem;
}
