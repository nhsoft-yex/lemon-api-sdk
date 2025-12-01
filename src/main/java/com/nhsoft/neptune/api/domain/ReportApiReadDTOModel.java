package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ReportApiReadDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ReportApiReadDTOModel extends ApiCloudObject {

    @ApiCloudField(value="api接口名称", example="report", required=true)
    private String reportApiName;
    @ApiCloudField(value="起始时间(yyyy-MM-dd)", example="2021-01-20", required=true)
    private String dateFrom;
    @ApiCloudField(value="结束时间(yyyy-MM-dd)", example="2021-01-20", required=true)
    private String dateTo;
    @ApiCloudField(value="第二组起始时间(yyyy-MM-dd) 标记*", example="2021-01-20")
    private String secDateFrom;
    @ApiCloudField(value="第二组结束时间(yyyy-MM-dd) 标记*", example="2021-01-20")
    private String secDateTo;
    @ApiCloudField(value="第三组起始时间(yyyy-MM-dd) 标记#", example="2021-01-20")
    private String trdDateFrom;
    @ApiCloudField(value="第三组结束时间(yyyy-MM-dd) 标记#", example="2021-01-20")
    private String trdDateTo;
    @ApiCloudField(value="门店编码列表", example="1")
    private List<Integer> branchNums;
}
