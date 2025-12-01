package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ReportApiSaleAndInventorySummaryFindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ReportApiSaleAndInventorySummaryFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="门店编码列表", example="1", required=true)
    private List<String> branchNums;
    @ApiCloudField(value="起始时间(yyyy-MM-dd)", example="2021-01-20", required=true)
    private String dateFrom;
    @ApiCloudField(value="结束时间(yyyy-MM-dd)", example="2021-01-20", required=true)
    private String dateTo;
    @ApiCloudField(value="商品编号列表", example="1", required=true)
    private List<String> itemNums;
}
