package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ChainRequestOrderSummaryReadDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ChainRequestOrderSummaryReadDTOModel extends ApiCloudObject {

    @ApiCloudField(value="开始日期(yyyy-MM-dd)", example="2021-01-01", required=true)
    private String dateFrom;
    @ApiCloudField(value="结束日期(yyyy-MM-dd)", example="2021-01-01", required=true)
    private String dateTo;
    @ApiCloudField(value="要货门店编码列表", example="1")
    private List<Integer> branchNums;
    @ApiCloudField(value="调出门店编码列表", example="99")
    private List<Integer> outBranchNums;
    @ApiCloudField(value="商品档案编号列表", example="99")
    private List<Integer> itemNums;
}
