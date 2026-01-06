package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * WholesaleProfitAnalysisFindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class WholesaleProfitAnalysisFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="日期类型(制单时间|审核时间|操作时间)", required=true)
    private String dateType;
    @ApiCloudField(value="开始日期", example="2023-01-01 00:00:00", required=true)
    private String dateFrom;
    @ApiCloudField(value="截止日期", example="2023-01-02 00:00:00", required=true)
    private String dateTo;
    @ApiCloudField(value="汇总项 客户、商品、门店，类别，部门，销售员，供应商，品牌", example="[门店]", required=true)
    private List<String> summarys;
    @ApiCloudField(value="门店编号列表", example="[1,2]")
    private List<Integer> branchNums;
    @ApiCloudField(value="商品档案编号", example="[1,2]")
    private List<Integer> itemNums;
    @ApiCloudField(value="查询页码", required=true)
    private Integer pageNo;
    @ApiCloudField(value="查询分页大小(分页大小最大为200)", required=true)
    private Integer pageSize;
}
