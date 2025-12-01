package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * OrderFindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class OrderFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="单据编号", example="JO2072010000004")
    private String orderFid;
    @ApiCloudField(value="门店编码", example="1", required=true)
    private Integer branchNum;
    @ApiCloudField(value="仓库编码", example="207200003")
    private Integer storehouseNum;
    @ApiCloudField(value="开始时间", example="2021-09-13", required=true)
    private String dateFrom;
    @ApiCloudField(value="结束时间", example="2021-09-15", required=true)
    private String dateTo;
    @ApiCloudField(value="查询时间类型(制单时间、审核时间)", example="审核时间", required=true)
    private String dateType;
    @ApiCloudField(value="是否查询明细", example="true")
    private Boolean withDetails;
    @ApiCloudField(value="查询页码", example="1", required=true)
    private Integer pageNo;
    @ApiCloudField(value="查询分页大小", example="10", required=true)
    private Integer pageSize;
}
