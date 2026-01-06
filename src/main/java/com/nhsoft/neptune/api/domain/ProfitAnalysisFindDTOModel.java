package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ProfitAnalysisFindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ProfitAnalysisFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="日期类型(调整时间|审核时间)", required=true)
    private String dateType;
    @ApiCloudField(value="开始日期", example="2023-01-01 00:00:00", required=true)
    private String dateFrom;
    @ApiCloudField(value="截止日期", example="2023-01-02 00:00:00", required=true)
    private String dateTo;
    @ApiCloudField(value="门店编号列表", example="[1,2]")
    private List<Integer> branchNums;
    @ApiCloudField(value="商品档案编号", example="[1,2]")
    private List<Integer> itemNums;
    @ApiCloudField(value="部门名称")
    private List<String> itemDepartments;
    @ApiCloudField(value="汇总项 门店，日期，商品，类别，部门，时段，营业月", example="[门店]", required=true)
    private List<String> summarys;
    @ApiCloudField(value="查询页码", required=true)
    private Integer pageNo;
    @ApiCloudField(value="查询分页大小(分页大小最大为200)", required=true)
    private Integer pageSize;
}
