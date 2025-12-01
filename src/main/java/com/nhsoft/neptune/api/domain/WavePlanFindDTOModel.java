package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * WavePlanFindDTO模型
 * 波次计划查询DTO
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class WavePlanFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="操作门店", example="99", required=true)
    private String branchNum;
    @ApiCloudField(value="日期类型(创建日期)", example="创建日期", required=true)
    private String dateType;
    @ApiCloudField(value="开始时间", required=true)
    private String dateFrom;
    @ApiCloudField(value="结束时间", required=true)
    private String dateTo;
    @ApiCloudField(value="客户编码列表", example="[1]")
    private List<String> clientNums;
    @ApiCloudField(value="商品编码列表", example="[1]")
    private List<Integer> itemNums;
    @ApiCloudField(value="查询页码 从1开始", example="1", required=true)
    private Integer pageNo;
    @ApiCloudField(value="查询分页大小", example="10", required=true)
    private Integer pageSize;
}
