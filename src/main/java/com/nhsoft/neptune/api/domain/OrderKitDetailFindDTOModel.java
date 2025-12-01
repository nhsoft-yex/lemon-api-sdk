package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * OrderKitDetailFindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class OrderKitDetailFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="门店编号", example="1")
    private Integer branchNum;
    @ApiCloudField(value="单据编号(单号和时间必须二选一查询)", example="JO2072010000004")
    private List<String> orderFids;
    @ApiCloudField(value="单据类型", example="调出单")
    private String orderType;
    @ApiCloudField(value="仓库编码", example="207200003")
    private Integer storehouseNum;
    @ApiCloudField(value="开始时间", example="2022-08-01 00:00:00")
    private String dateFrom;
    @ApiCloudField(value="结束时间", example="2022-08-01 00:00:00")
    private String dateTo;
    @ApiCloudField(value="查询页码", example="1", required=true)
    private Integer pageNo;
    @ApiCloudField(value="查询分页大小", example="10", required=true)
    private Integer pageSize;
}
