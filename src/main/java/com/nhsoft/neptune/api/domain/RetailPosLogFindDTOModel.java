package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * RetailPosLogFindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class RetailPosLogFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="分店编号", example="99", required=true)
    private Integer branchNum;
    @ApiCloudField(value="起始时间", example="2021-01-21 00:00:00", required=true)
    private String dateFrom;
    @ApiCloudField(value="结束时间", example="2021-01-21 00:00:00", required=true)
    private String dateTo;
    @ApiCloudField(value="查询页码(从1开始)", example="1", required=true)
    private Integer pageNo;
    @ApiCloudField(value="查询分页大小(最大100)", example="100", required=true)
    private Integer pageSize;
}
