package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PosItemLogSeparateFindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PosItemLogSeparateFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="门店列表", example="1", required=true)
    private List<Integer> branchNums;
    @ApiCloudField(value="开始日期", example="2021-11-01", required=true)
    private String dateFrom;
    @ApiCloudField(value="结束日期", example="2021-11-30", required=true)
    private String dateTo;
    @ApiCloudField(value="商品编码列表(用,间隔)", example="434400001")
    private List<Integer> itemNums;
    @ApiCloudField(value="仓库编码列表(用,间隔)", example="434400001")
    private List<Integer> storehouseNums;
    @ApiCloudField(value="查询页码 从1开始", example="1", required=true)
    private Integer pageNo;
    @ApiCloudField(value="查询分页大小， 最大2000", example="200", required=true)
    private Integer pageSize;
}
